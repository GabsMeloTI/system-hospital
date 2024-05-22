package br.com.fiap.system.hospital.dto.receita;

public record CadastrarReceitaDto(String nome, Double dosagem, String instrucaoUso, Long consultaId) {

}
