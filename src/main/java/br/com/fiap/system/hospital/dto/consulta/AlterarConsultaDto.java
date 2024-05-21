package br.com.fiap.system.hospital.dto.consulta;

import java.time.LocalDate;
import java.time.LocalTime;

public record AlterarConsultaDto(LocalDate dataConsulta, LocalTime horaConsulta, String motivoConsulta) {
}
