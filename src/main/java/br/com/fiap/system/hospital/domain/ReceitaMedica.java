package br.com.fiap.system.hospital.domain;

import br.com.fiap.system.hospital.dto.receita.AlterarReceitaDto;
import br.com.fiap.system.hospital.dto.receita.CadastrarReceitaDto;
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

    @Column(name = "ds_dosagem", nullable = false)
    private Double dosagem;

    @Column(name = "ds_instrucao_uso", nullable = false, length = 200)
    private String instrucaoUso;

    @ManyToOne
    @JoinColumn(name = "cd_consulta")
    private Consultas consulta;


    public ReceitaMedica(CadastrarReceitaDto dto, Consultas consultas) {
        this.nome = dto.nome();
        this.dosagem = dto.dosagem();
        this.instrucaoUso = dto.instrucaoUso();
        this.consulta = consultas;
    }

    public void alterarDados(AlterarReceitaDto dto) {
        if(nome != null) {
            this.nome = dto.nome();
        }
        if(dosagem != null) {
            this.dosagem = dto.dosagem();
        }
        if(instrucaoUso != null) {
            this.instrucaoUso = dto.instrucaoUso();
        }
    }
}
