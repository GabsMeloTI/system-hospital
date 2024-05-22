package br.com.fiap.system.hospital.dto.consulta;

import java.time.LocalDate;

public record RetornoTotalConsultas(LocalDate dia, Long totalConsultas) {
}
