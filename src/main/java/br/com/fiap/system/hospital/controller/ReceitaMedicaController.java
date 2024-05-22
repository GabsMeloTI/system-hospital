package br.com.fiap.system.hospital.controller;


import br.com.fiap.system.hospital.domain.Pacientes;
import br.com.fiap.system.hospital.domain.ReceitaMedica;
import br.com.fiap.system.hospital.dto.receita.AlterarReceitaDto;
import br.com.fiap.system.hospital.dto.receita.CadastrarReceitaDto;
import br.com.fiap.system.hospital.dto.receita.DetalhesReceitaDto;
import br.com.fiap.system.hospital.repository.ConsultaRepository;
import br.com.fiap.system.hospital.repository.ReceitaMedicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/receitas")
public class ReceitaMedicaController {
    @Autowired
    private ReceitaMedicaRepository receitaMedicaRepository;

    @Autowired
    private ConsultaRepository consultaRepository;


    @GetMapping("pesquisa-paciente-remedio")
    public ResponseEntity<Page<DetalhesReceitaDto>> pesquisarPorNomePaciente(@RequestParam("nome") String nome, Pageable pageable) {
        var page = receitaMedicaRepository.pesquisarPorNome(nome, pageable).map(DetalhesReceitaDto::new);
        return ResponseEntity.ok(page);
    }

    @GetMapping
    public ResponseEntity<Page<DetalhesReceitaDto>> listagem(Pageable pageable) {
        var page = receitaMedicaRepository.findAll(pageable).map(DetalhesReceitaDto::new);
        return ResponseEntity.ok(page);
    }

    @PostMapping
    @Transactional
    public ResponseEntity<DetalhesReceitaDto> cadastro(@RequestBody CadastrarReceitaDto dto, UriComponentsBuilder uriBuilder) {
        var consulta = consultaRepository.findById(dto.consultaId())
                .orElseThrow(() -> new RuntimeException("Consulta não encontrado"));

        var receita = new ReceitaMedica(dto, consulta);
        receitaMedicaRepository.save(receita);
        var url = uriBuilder.path("receitas/{id}").buildAndExpand(receita.getId()).toUri();
        return ResponseEntity.created(url).body(new DetalhesReceitaDto(receita));
    }

    @PutMapping("{id}")
    @Transactional
    public ResponseEntity<DetalhesReceitaDto> alterar(@PathVariable("id") Long id, @RequestBody AlterarReceitaDto dto) {
        var receita = receitaMedicaRepository.getReferenceById(id);
        receita.alterarDados(dto);
        return ResponseEntity.ok().body(new DetalhesReceitaDto(receita));
    }

    @DeleteMapping("{id}")
    @Transactional
    public ResponseEntity<Void> deletar(@PathVariable("id") Long id) {
        receitaMedicaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
