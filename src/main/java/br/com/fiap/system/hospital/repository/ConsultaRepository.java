package br.com.fiap.system.hospital.repository;
import br.com.fiap.system.hospital.domain.Consultas;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ConsultaRepository extends JpaRepository<Consultas, Long> {
}
