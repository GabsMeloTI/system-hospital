package br.com.fiap.system.hospital.controller;

import br.com.fiap.system.hospital.domain.Especialidade;
import br.com.fiap.system.hospital.domain.Medicos;
import br.com.fiap.system.hospital.domain.Pacientes;
import br.com.fiap.system.hospital.dto.especialidade.AlterarEspecialidadeDto;
import br.com.fiap.system.hospital.dto.medico.AlterarMedicoDto;
import br.com.fiap.system.hospital.dto.medico.CadastrarMedicoDto;
import br.com.fiap.system.hospital.dto.medico.DetalhesMedicoDto;
import br.com.fiap.system.hospital.repository.EspecialidadeRepository;
import br.com.fiap.system.hospital.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/medicos")
public class MedicosController {
    @Autowired
    private final MedicoRepository medicoRepository;
    @Autowired
    private final EspecialidadeRepository especialidadeRepository;

    @Autowired
    public MedicosController(MedicoRepository medicoRepository, EspecialidadeRepository especialidadeRepository) {
        this.medicoRepository = medicoRepository;
        this.especialidadeRepository = especialidadeRepository;
    }

    @GetMapping("pesquisar-por-nome")
    public ResponseEntity<Page<DetalhesMedicoDto>> pesquisaPorNome(@RequestParam("caracteres") String caracteres, Pageable pageable) {
        var page =  medicoRepository.pesquisarNomeDeMedicos(caracteres, pageable).map(DetalhesMedicoDto::new);
        return ResponseEntity.ok(page);
    }

    @GetMapping
    public ResponseEntity<Page<DetalhesMedicoDto>> listagem(Pageable pageable) {
        var page = medicoRepository.findAll(pageable).map(DetalhesMedicoDto::new);
        return ResponseEntity.ok(page);
    }

    @PostMapping
    @Transactional
    public ResponseEntity<DetalhesMedicoDto> cadastro(@RequestBody CadastrarMedicoDto dto, UriComponentsBuilder uriBuilder) {
        Especialidade especialidade = new Especialidade(dto.especialidade());
        especialidadeRepository.save(especialidade);

        var medico = new Medicos(dto);
        medico.setEspecialidade(especialidade);
        medicoRepository.save(medico);

        var url = uriBuilder.path("/medicos/{id}").buildAndExpand(medico.getId()).toUri();
        return ResponseEntity.created(url).body(new DetalhesMedicoDto(medico));
    }

    //Medico
    @PutMapping("{id}")
    @Transactional
    public ResponseEntity<DetalhesMedicoDto> alterar(@PathVariable("id") Long id, @RequestBody AlterarMedicoDto dto) {
        var medico = medicoRepository.getReferenceById(id);
        medico.alterarDados(dto);
        return ResponseEntity.ok(new DetalhesMedicoDto(medico));
    }

    //Especialidade
    @PutMapping("{id}/especialidade")
    @Transactional
    public ResponseEntity<DetalhesMedicoDto> alterarEspecialidade(@PathVariable("id") Long id, @RequestBody AlterarEspecialidadeDto dto) {
        var medico = medicoRepository.getReferenceById(id);
        medico.getEspecialidade().alterar(dto);
        return ResponseEntity.ok(new DetalhesMedicoDto(medico));
    }

    @DeleteMapping("{id}")
    @Transactional
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        medicoRepository.deleteById(id);
        var mensagem = "Item deletado com sucesso!";
        return ResponseEntity.ok().header("mensagem", mensagem).build();
    }
}
