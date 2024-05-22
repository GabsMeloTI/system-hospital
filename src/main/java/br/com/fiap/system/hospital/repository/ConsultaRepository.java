package br.com.fiap.system.hospital.repository;
import br.com.fiap.system.hospital.domain.Consultas;
import jakarta.validation.constraints.Past;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;

public interface ConsultaRepository extends JpaRepository<Consultas, Long> {
    @Query("from Consultas c where c.dataConsulta between :inicio and :fim")
    Page<Consultas> pesquisaEntreDatasConsultas(@Param("inicio")LocalDate inicio, @Param("fim") LocalDate fim, Pageable pageable);

    @Query("select count(c) from Consultas c where c.dataConsulta = :diaConsulta")
    Long totalConsultasAoDia(@Param("diaConsulta") LocalDate diaConsulta);


}

