package br.com.fiap.system.hospital.dto.endereco;

import br.com.fiap.system.hospital.domain.Enderecos;

public record DetalhesEnderecoDto(Long id, String bairro, String logradouro, Integer numero) {
    public DetalhesEnderecoDto(Enderecos enderecos) {
        this(enderecos.getId(), enderecos.getBairro(), enderecos.getLogradouro(), enderecos.getNumero());
    }
}
