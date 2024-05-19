package br.com.fiap.system.hospital.domain;

import br.com.fiap.system.hospital.dto.paciente.AlterarPacienteDto;
import br.com.fiap.system.hospital.dto.paciente.CadastrarPacienteDto;
import br.com.fiap.system.hospital.dto.paciente.DetalhesPacienteDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.time.LocalDate;
import java.util.ArrayList;
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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cd_endereco")
    private Enderecos endereco;

    public Pacientes(CadastrarPacienteDto dto) {
        this.nome = dto.nome();
        this.dataNascimento = dto.dataNascimento();
        this.telefone = dto.telefone();
        this.email = dto.email();
        this.endereco = new Enderecos(dto.endereco());
    }

    public void alterarDados(AlterarPacienteDto dto) {
        if(nome != null) {
            this.nome = dto.nome();
        }
        if(telefone != null) {
            this.telefone = dto.telefone();
        }
        if(email != null) {
            this.email = dto.email();
        }
    }

}
