package br.com.fiap.system.hospital.dto.consulta;

import br.com.fiap.system.hospital.domain.Consultas;
import br.com.fiap.system.hospital.dto.especialidade.DetalhesEspecialidadeDto;
import br.com.fiap.system.hospital.dto.medico.DetalhesMedicoDto;
import br.com.fiap.system.hospital.dto.paciente.DetalhesPacienteDto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

public record DetalhesConsultaDto(Long id, LocalDate dataConsulta, LocalTime horaConsulta, String motivoConsulta, DetalhesPacienteDto paciente, DetalhesMedicoDto medico, DetalhesEspecialidadeDto especialidade) {
    public DetalhesConsultaDto(Consultas consultas) {
        this(consultas.getId(), consultas.getDataConsulta(), consultas.getHoraConsulta(), consultas.getMotivoConsulta(), new DetalhesPacienteDto(consultas.getPaciente()), new DetalhesMedicoDto(consultas.getMedico()), new DetalhesEspecialidadeDto(consultas.getEspecialidade()));
    }
}
