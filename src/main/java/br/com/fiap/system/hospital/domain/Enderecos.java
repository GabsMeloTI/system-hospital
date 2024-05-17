package br.com.fiap.system.hospital.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="cp_enderecos")
public class Enderecos {
    @Id
    @GeneratedValue
    @Column(name = "cd_endereco")
    private Long id;

    @Column(name = "ds_bairro", nullable = false, length = 100)
    private String bairro;

    @Column(name = "ds_logradouro", nullable = false, length = 100)
    private String logradouro;

    @Column(name = "ds_numero", nullable = false)
    private Integer numero;

    @OneToOne(mappedBy = "endereco")
    private Pacientes paciente;
}
