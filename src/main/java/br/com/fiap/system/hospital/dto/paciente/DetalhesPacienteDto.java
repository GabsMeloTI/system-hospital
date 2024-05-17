package br.com.fiap.system.hospital.dto.paciente;

import br.com.fiap.system.hospital.domain.Pacientes;
import br.com.fiap.system.hospital.dto.endereco.DetalhesEnderecoDto;

import java.time.LocalDate;

public record DetalhesPacienteDto(Long id, String nome, LocalDate dataNascimento, String telefone, String email, DetalhesEnderecoDto endereco) {
    public DetalhesPacienteDto(Pacientes pacientes){
        this(pacientes.getId(), pacientes.getNome(), pacientes.getDataNascimento(), pacientes.getTelefone(), pacientes.getEmail(), new DetalhesEnderecoDto(pacientes.getEndereco()));
    }
}
