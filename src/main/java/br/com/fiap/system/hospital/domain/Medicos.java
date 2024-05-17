package br.com.fiap.system.hospital.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="cp_medicos")
public class Medicos {
    @Id
    @GeneratedValue
    @Column(name = "cd_medico")
    private Long id;

    @Column(name = "nm_medico", nullable = false, length = 100)
    private String nome;

    @Column(name = "nr_telefone", nullable = false, length = 11)
    private String telefone;

    @Column(name = "ds_email", nullable = false, length = 200)
    private String email;

    @OneToMany(mappedBy = "medico")
    private List<Consultas> consultas;

    @OneToMany(mappedBy = "medico")
    private List<Especialidade> especialidades;
}
