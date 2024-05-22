package br.com.fiap.system.hospital.dto.medico;

import br.com.fiap.system.hospital.domain.Genero;
import br.com.fiap.system.hospital.domain.Medicos;
import br.com.fiap.system.hospital.dto.especialidade.DetalhesEspecialidadeDto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public record DetalhesMedicoDto(Long id, String nome, String genero, String telefone, String email, DetalhesEspecialidadeDto especialidade) {
    public DetalhesMedicoDto(Medicos medicos) {
        this(medicos.getId(), medicos.getNome(), medicos.getGenero(), medicos.getTelefone(), medicos.getEmail(), new DetalhesEspecialidadeDto(medicos.getEspecialidade()));
    }
}