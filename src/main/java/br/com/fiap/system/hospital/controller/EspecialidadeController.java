package br.com.fiap.system.hospital.controller;

import br.com.fiap.system.hospital.domain.Especialidade;
import br.com.fiap.system.hospital.dto.especialidade.DetalhesEspecialidadeDto;
import br.com.fiap.system.hospital.repository.EspecialidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/especialidades")
public class EspecialidadeController {
    @Autowired
    private EspecialidadeRepository especialidadeRepository;

    @GetMapping
    public ResponseEntity<Page<DetalhesEspecialidadeDto>> listagem(Pageable pageable) {
        var page = especialidadeRepository.findAll(pageable).map(DetalhesEspecialidadeDto::new);
        return ResponseEntity.ok(page);
    }
}
