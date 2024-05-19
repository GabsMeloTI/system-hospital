package br.com.fiap.system.hospital.domain;

import br.com.fiap.system.hospital.dto.medico.AlterarMedicoDto;
import br.com.fiap.system.hospital.dto.medico.CadastrarMedicoDto;
import br.com.fiap.system.hospital.dto.medico.DetalhesMedicoDto;
import br.com.fiap.system.hospital.dto.paciente.AlterarPacienteDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.ArrayList;
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

    @OneToOne
    @JoinColumn(name = "cd_especialidade")
    private Especialidade especialidade;

    public Medicos(CadastrarMedicoDto dto) {
        this.nome = dto.nome();
        this.telefone = dto.telefone();
        this.email = dto.email();
        this.especialidade = new Especialidade(dto.especialidade());
    }

    public void alterarDados(AlterarMedicoDto dto) {
        if (nome != null) {
            this.nome = dto.nome();
        }
        if (telefone != null) {
            this.telefone = dto.telefone();
        }
        if (email != null) {
            this.email = dto.email();
        }
    }
}
