package br.com.fiap.system.hospital.repository;
import br.com.fiap.system.hospital.domain.Especialidade;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long> {
}
