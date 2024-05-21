package br.com.fiap.system.hospital.dto.consulta;

import java.time.LocalDate;
import java.time.LocalTime;

public record CadastrarConsultaDto(LocalDate dataConsulta, LocalTime horaConsulta, String motivoConsulta, Long pacienteId, Long medicoId, Long especialidadeId) {
}
