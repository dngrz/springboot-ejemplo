package pe.net.csweb.microservicios.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.net.csweb.microservicios.usuario.domain.UsuarioBean;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioBean, Integer>{

	UsuarioBean findByUsuarioId(Integer id);

}
