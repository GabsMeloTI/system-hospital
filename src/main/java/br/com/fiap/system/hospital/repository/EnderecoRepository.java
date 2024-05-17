package br.com.fiap.system.hospital.repository;
import br.com.fiap.system.hospital.domain.Enderecos;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EnderecoRepository extends JpaRepository<Enderecos, Long> {
}
