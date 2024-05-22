package br.com.fiap.system.hospital.dto.medico;

import br.com.fiap.system.hospital.domain.Genero;
import br.com.fiap.system.hospital.dto.especialidade.DetalhesEspecialidadeDto;

public record AlterarMedicoDto(String nome, String genero, String telefone, String email) {
}
