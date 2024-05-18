package br.com.fiap.system.hospital.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="cp_consultas")
public class Consultas {
    @Id
    @GeneratedValue
    @Column(name = "cd_consultas")
    private Long id;

    @Column(name = "dt_consulta", nullable = false)
    private LocalDate dataConsulta;

    @Column(name = "hr_consulta", nullable = false)
    private LocalTime horaConsulta;

    @Column(name = "ds_motivo_consulta", nullable = false, length = 100)
    private String motivoConsulta;

    @ManyToOne
    @JoinColumn(name = "cd_paciente")
    private Pacientes paciente;

    @ManyToOne
    @JoinColumn(name = "cd_medico")
    private Medicos medico;

    @OneToOne
    @JoinColumn(name = "cd_especialidade")
    private Especialidade especialidade;

    @OneToMany(mappedBy = "consulta")
    private List<ReceitaMedica> receitaMedicas;
}
