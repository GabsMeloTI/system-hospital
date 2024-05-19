package br.com.fiap.system.hospital.dto.paciente;

import br.com.fiap.system.hospital.dto.endereco.DetalhesEnderecoDto;

import java.time.LocalDate;

public record CadastrarPacienteDto(String nome, LocalDate dataNascimento, String telefone, String email, DetalhesEnderecoDto endereco) {
}
