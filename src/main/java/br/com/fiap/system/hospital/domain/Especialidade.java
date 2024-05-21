package br.com.fiap.system.hospital.domain;

import br.com.fiap.system.hospital.dto.especialidade.AlterarEspecialidadeDto;
import br.com.fiap.system.hospital.dto.especialidade.DetalhesEspecialidadeDto;
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
@Table(name="cp_especialidade")
public class Especialidade {
    @Id
    @GeneratedValue
    @Column(name = "cd_especialidade")
    private Long id;

    @Column(name = "nm_especialidade")
    private String nome;

    @OneToOne(mappedBy = "especialidade")
    private Consultas consulta;

    @OneToOne(mappedBy = "especialidade")
    private Medicos medico;

    public Especialidade(DetalhesEspecialidadeDto dto) {
        this.nome = dto.nome();
    }

    public void alterar(AlterarEspecialidadeDto dto) {
        if (nome != null) {
            this.nome = dto.nome();
        }
    }
}
