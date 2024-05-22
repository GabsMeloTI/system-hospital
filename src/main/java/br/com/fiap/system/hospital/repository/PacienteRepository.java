package br.com.fiap.system.hospital.repository;
import br.com.fiap.system.hospital.domain.Consultas;
import br.com.fiap.system.hospital.domain.Medicos;
import br.com.fiap.system.hospital.domain.Pacientes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;

public interface PacienteRepository extends JpaRepository<Pacientes, Long>{

    @Query("from Pacientes p where lower(p.nome) like lower(concat('%', :caracteres, '%'))")
    Page<Pacientes> pesquisarNomeDePacientes(@Param("caracteres") String caracteres, Pageable pageable);

    @Query("from Pacientes p where p.dataNascimento between :inicio and :fim")
    Page<Pacientes> pesquisaEntreDatasDeNascimento(@Param("inicio") LocalDate inicio, @Param("fim") LocalDate fim, Pageable pageable);


}
