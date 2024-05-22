package br.com.fiap.system.hospital.controller;

import br.com.fiap.system.hospital.domain.Consultas;
import br.com.fiap.system.hospital.domain.Especialidade;
import br.com.fiap.system.hospital.domain.Medicos;
import br.com.fiap.system.hospital.dto.consulta.AlterarConsultaDto;
import br.com.fiap.system.hospital.dto.consulta.CadastrarConsultaDto;
import br.com.fiap.system.hospital.dto.consulta.DetalhesConsultaDto;
import br.com.fiap.system.hospital.dto.consulta.RetornoTotalConsultas;
import br.com.fiap.system.hospital.dto.medico.CadastrarMedicoDto;
import br.com.fiap.system.hospital.dto.medico.DetalhesMedicoDto;
import br.com.fiap.system.hospital.repository.ConsultaRepository;
import br.com.fiap.system.hospital.repository.EspecialidadeRepository;
import br.com.fiap.system.hospital.repository.MedicoRepository;
import br.com.fiap.system.hospital.repository.PacienteRepository;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/consultas")
public class ConsultasController {
    @Autowired
    private ConsultaRepository consultaRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private EspecialidadeRepository especialidadeRepository;

    @GetMapping("total-consultas-dia")
    public ResponseEntity<RetornoTotalConsultas> total(@RequestParam("diaConsulta") LocalDate diaConsulta) {
        var page = consultaRepository.totalConsultasAoDia(diaConsulta);
        return ResponseEntity.ok(new RetornoTotalConsultas(diaConsulta, page));

    }

    @GetMapping("pesquisa-por-data")
    public ResponseEntity<Page<DetalhesConsultaDto>> pesquisaData(@RequestParam("inicio")LocalDate inicio, @RequestParam("fim") LocalDate fim, Pageable pageable) {
        var page = consultaRepository.pesquisaEntreDatasConsultas(inicio, fim, pageable).map(DetalhesConsultaDto::new);
        return ResponseEntity.ok(page);

    }

    @GetMapping
    public ResponseEntity<Page<DetalhesConsultaDto>> listagem(Pageable pageable) {
        var page = consultaRepository.findAll(pageable).map(DetalhesConsultaDto::new);
        return ResponseEntity.ok(page);
    }


    @PostMapping
    @Transactional
    public ResponseEntity<DetalhesConsultaDto> cadastro(@RequestBody @Valid CadastrarConsultaDto dto, UriComponentsBuilder uriBuilder) {
        var paciente = pacienteRepository.findById(dto.pacienteId())
                .orElseThrow(() -> new RuntimeException("Paciente não encontrado"));
        var medico = medicoRepository.findById(dto.medicoId())
                .orElseThrow(() -> new RuntimeException("Médico não encontrado"));
        var especialidade = especialidadeRepository.findById(dto.especialidadeId())
                .orElseThrow(() -> new RuntimeException("Especialidade não encontrada"));

        var consulta = new Consultas(dto, paciente, medico, especialidade);
        consultaRepository.save(consulta);
        var uri = uriBuilder.path("/consultas/{id}").buildAndExpand(consulta.getId()).toUri();
        return ResponseEntity.created(uri).body(new DetalhesConsultaDto(consulta));
    }

    @PutMapping("{id}")
    @Transactional
    public ResponseEntity<DetalhesConsultaDto> alterar(@PathVariable("id") Long id, @RequestBody AlterarConsultaDto dto) {
        var consulta = consultaRepository.getReferenceById(id);
        consulta.alterar(dto);
        return ResponseEntity.ok().body(new DetalhesConsultaDto(consulta));
    }

    @DeleteMapping("{id}")
    @Transactional
    public ResponseEntity<Void> deletar(@PathVariable("id") Long id) {
        consultaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
