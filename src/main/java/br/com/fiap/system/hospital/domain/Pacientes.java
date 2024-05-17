package br.com.fiap.system.hospital.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.time.LocalDate;
import java.util.List;


@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="cp_pacientes")
public class Pacientes {
    @Id
    @GeneratedValue
    @Column(name = "cd_paciente")
    private Long id;

    @Column(name = "nm_paciente", nullable = false, length = 100)
    private String nome;

    @Column(name = "dt_nascimento", nullable = false)
    @Past
    private LocalDate dataNascimento;

    @Column(name = "nr_telefone", nullable = false, length = 11)
    private String telefone;

    @Column(name = "ds_email", nullable = false, length = 200)
    private String email;

    @OneToMany(mappedBy = "paciente")
    private List<Consultas> consultas;

    @OneToOne
    @JoinColumn(name = "cd_endereco")
    private Enderecos endereco;
}
