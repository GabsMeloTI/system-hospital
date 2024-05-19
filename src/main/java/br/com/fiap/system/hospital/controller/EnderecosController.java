package br.com.fiap.system.hospital.controller;

import br.com.fiap.system.hospital.dto.endereco.DetalhesEnderecoDto;
import br.com.fiap.system.hospital.repository.EnderecoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/enderecos")
public class EnderecosController {
    @Autowired
    private EnderecoRepository enderecoRepository;

    @GetMapping
    public ResponseEntity<Page<DetalhesEnderecoDto>> listagem(Pageable pageable) {
        var page = enderecoRepository.findAll(pageable).map(DetalhesEnderecoDto::new);
        return ResponseEntity.ok(page);
    }


}
