package br.com.fiap.system.hospital.repository;
import br.com.fiap.system.hospital.domain.Medicos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MedicoRepository extends JpaRepository<Medicos, Long>{
    @Query("from Medicos m where lower(m.nome) like lower(concat('%', :caracteres, '%'))")
    Page<Medicos> pesquisarNomeDeMedicos(@Param("caracteres") String caracteres, Pageable pageable);

}
