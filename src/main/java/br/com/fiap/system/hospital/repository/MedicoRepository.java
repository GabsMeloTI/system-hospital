package br.com.fiap.system.hospital.repository;
import br.com.fiap.system.hospital.domain.Medicos;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MedicoRepository extends JpaRepository<Medicos, Long>{
}
