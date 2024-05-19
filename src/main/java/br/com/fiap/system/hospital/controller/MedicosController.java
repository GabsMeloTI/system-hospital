package br.com.fiap.system.hospital.controller;

import br.com.fiap.system.hospital.dto.medico.DetalhesMedicoDto;
import br.com.fiap.system.hospital.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicosController {

    private final MedicoRepository medicoRepository;

    @Autowired
    public MedicosController(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    @GetMapping
    public ResponseEntity<Page<DetalhesMedicoDto>> listagem(Pageable pageable) {
        var page = medicoRepository.findAll(pageable).map(DetalhesMedicoDto::new);
        return ResponseEntity.ok(page);
    }
}
