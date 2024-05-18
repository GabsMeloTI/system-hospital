package br.com.fiap.system.hospital.dto.medico;

import br.com.fiap.system.hospital.domain.Medicos;
import br.com.fiap.system.hospital.dto.especialidade.DetalhesEspecialidadeDto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public record DetalhesMedicoDto(Long id, String nome, String telefone, String email, List<DetalhesEspecialidadeDto> especialidade) {
    public DetalhesMedicoDto(Medicos medicos) {
        this(medicos.getId(), medicos.getNome(), medicos.getTelefone(), medicos.getEmail(),
                medicos.getEspecialidades().stream().map(DetalhesEspecialidadeDto::new).collect(Collectors.toList())
        );
    }
}