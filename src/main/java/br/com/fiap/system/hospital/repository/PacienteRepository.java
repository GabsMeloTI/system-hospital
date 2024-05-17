package br.com.fiap.system.hospital.repository;
import br.com.fiap.system.hospital.domain.Pacientes;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PacienteRepository extends JpaRepository<Pacientes, Long>{
}
