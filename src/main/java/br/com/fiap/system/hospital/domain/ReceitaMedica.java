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
@Table(name="cp_receita_medica")
public class ReceitaMedica {
    @Id
    @GeneratedValue
    @Column(name = "cd_receita_medica")
    private Long id;

    @Column(name = "nm_medicamento", nullable = false, length = 100)
    private String nome;

    @Column(name = "ds_dosagem", nullable = false, precision = 10, scale = 2)
    private Double dosagem;

    @Column(name = "ds_instrucao_uso", nullable = false, length = 200)
    private String instrucaoUso;

    @ManyToOne
    @JoinColumn(name = "cd_consulta")
    private Consultas consulta;
}
