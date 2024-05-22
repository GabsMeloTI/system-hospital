package br.com.fiap.system.hospital.controller;

import br.com.fiap.system.hospital.domain.Enderecos;
import br.com.fiap.system.hospital.domain.Pacientes;
import br.com.fiap.system.hospital.dto.consulta.DetalhesConsultaDto;
import br.com.fiap.system.hospital.dto.endereco.AlterarEnderecoDto;
import br.com.fiap.system.hospital.dto.endereco.DetalhesEnderecoDto;
import br.com.fiap.system.hospital.dto.paciente.AlterarPacienteDto;
import br.com.fiap.system.hospital.dto.paciente.CadastrarPacienteDto;
import br.com.fiap.system.hospital.dto.paciente.DetalhesPacienteDto;
import br.com.fiap.system.hospital.repository.EnderecoRepository;
import br.com.fiap.system.hospital.repository.PacienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacientesController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;


    @GetMapping("pesquisar-por-nome")
    public ResponseEntity<Page<DetalhesPacienteDto>> pesquisaPorNome(@RequestParam("caracteres") String caracteres, Pageable pageable) {
        var page = pacienteRepository.pesquisarNomeDePacientes(caracteres, pageable).map(DetalhesPacienteDto::new);
        return ResponseEntity.ok(page);
    }

    @GetMapping("pesquisa-por-data")
    public ResponseEntity<Page<DetalhesPacienteDto>> pesquisaData(@RequestParam("inicio") LocalDate inicio, @RequestParam("fim") LocalDate fim, Pageable pageable) {
        var page = pacienteRepository.pesquisaEntreDatasDeNascimento(inicio, fim, pageable).map(DetalhesPacienteDto::new);
        return ResponseEntity.ok(page);
    }


    @GetMapping
    public ResponseEntity<Page<DetalhesPacienteDto>> listagem(Pageable pageable) {
        var page = pacienteRepository.findAll(pageable).map(DetalhesPacienteDto::new);
        return ResponseEntity.ok(page);
    }

    @PostMapping
    @Transactional
    public ResponseEntity<DetalhesPacienteDto> cadastrar(@RequestBody @Valid CadastrarPacienteDto dto, UriComponentsBuilder uriBuilder) {
        Enderecos endereco = new Enderecos(dto.endereco());
        enderecoRepository.save(endereco);

        var paciente = new Pacientes(dto);
        paciente.setEndereco(endereco);
        pacienteRepository.save(paciente);

        var url = uriBuilder.path("/pacientes/{id}").buildAndExpand(paciente.getId()).toUri();
        return ResponseEntity.created(url).body(new DetalhesPacienteDto(paciente));
    }

    //Paciente
    @PutMapping("{id}")
    @Transactional
    public ResponseEntity<DetalhesPacienteDto> alterar(@PathVariable("id") Long id, @RequestBody @Valid AlterarPacienteDto dto) {
        var paciente = pacienteRepository.getReferenceById(id);
        paciente.alterarDados(dto);
        return ResponseEntity.ok(new DetalhesPacienteDto(paciente));
    }

    //Endereco
    @PutMapping("{id}/endereco")
    @Transactional
    public ResponseEntity<DetalhesPacienteDto> alterarEndereco(@PathVariable("id") Long id, @RequestBody @Valid AlterarEnderecoDto dto) {
        var paciente = pacienteRepository.getReferenceById(id);
        paciente.getEndereco().alterar(dto);
        return ResponseEntity.ok(new DetalhesPacienteDto(paciente));
    }

    @DeleteMapping("{id}")
    @Transactional
    public ResponseEntity<Void> remover(@PathVariable("id") Long id) {
        pacienteRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
