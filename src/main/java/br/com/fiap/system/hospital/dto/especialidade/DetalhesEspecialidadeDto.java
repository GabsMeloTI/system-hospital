package br.com.fiap.system.hospital.dto.especialidade;

import br.com.fiap.system.hospital.domain.Especialidade;

public record DetalhesEspecialidadeDto(Long id, String nome) {
    public DetalhesEspecialidadeDto(Especialidade especialidade) {
        this(especialidade.getId(), especialidade.getNome());
    }
}
