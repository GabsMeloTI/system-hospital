package br.com.fiap.system.hospital.dto.medico;

import br.com.fiap.system.hospital.domain.Genero;
import br.com.fiap.system.hospital.dto.especialidade.DetalhesEspecialidadeDto;

public record CadastrarMedicoDto(String nome, String genero, String telefone, String email, DetalhesEspecialidadeDto especialidade) {
}
