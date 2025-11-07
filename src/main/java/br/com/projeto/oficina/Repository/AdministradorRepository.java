package br.com.projeto.oficina.Repository;
import br.com.projeto.oficina.Model.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, Long>{
    Administrador findById(long idAdministrador);
}
