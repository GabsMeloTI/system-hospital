package br.com.fiap.system.hospital.repository;
import br.com.fiap.system.hospital.domain.ReceitaMedica;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ReceitaMedicaRepository extends JpaRepository<ReceitaMedica, Long>{
    @Query("from ReceitaMedica r where r.consulta.paciente = :nome")
    Page<ReceitaMedica> pesquisarPorNome(@Param("nome") String nome, Pageable pageable);
}
