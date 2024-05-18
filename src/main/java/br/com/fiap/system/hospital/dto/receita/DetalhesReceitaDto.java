package br.com.fiap.system.hospital.dto.receita;

import br.com.fiap.system.hospital.domain.ReceitaMedica;

public record DetalhesReceitaDto(Long id, String nome, Double dosagem, String instrucaoUso) {
    public DetalhesReceitaDto(ReceitaMedica receitaMedica) {
        this(receitaMedica.getId(), receitaMedica.getNome(), receitaMedica.getDosagem(), receitaMedica.getInstrucaoUso());
    }
}
