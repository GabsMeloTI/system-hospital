package br.com.fiap.system.hospital.dto.receita;

import br.com.fiap.system.hospital.domain.ReceitaMedica;

public record DetalhesReceitaDto(Long id, String nome, Double dosagem, String instrucaoUso, Long idConsulta, String nomeMedico, String nomePaciente) {
    public DetalhesReceitaDto(ReceitaMedica receitaMedica) {
        this(receitaMedica.getId(), receitaMedica.getNome(), receitaMedica.getDosagem(), receitaMedica.getInstrucaoUso(), receitaMedica.getConsulta().getId(), receitaMedica.getConsulta().getMedico().getNome(), receitaMedica.getConsulta().getPaciente().getNome());
    }
}
