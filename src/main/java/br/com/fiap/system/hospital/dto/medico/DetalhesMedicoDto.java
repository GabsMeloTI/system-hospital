package br.com.fiap.system.hospital.dto.medico;

import br.com.fiap.system.hospital.domain.Medicos;
import br.com.fiap.system.hospital.dto.especialidade.DetalhesEspecialidadeDto;

import java.time.LocalDate;
import java.util.List;

public record DetalhesMedicoDto(Long id, String nome, String telefone, String email) {
    public DetalhesMedicoDto(Medicos medicos) {
        this(medicos.getId(), medicos.getNome(), medicos.getTelefone(), medicos.getEmail());
    }
}
