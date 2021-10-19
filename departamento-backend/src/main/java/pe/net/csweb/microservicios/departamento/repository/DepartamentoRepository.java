package pe.net.csweb.microservicios.departamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.net.csweb.microservicios.departamento.domain.DepartamentoBean;

@Repository
public interface DepartamentoRepository extends JpaRepository<DepartamentoBean, Integer>{

	DepartamentoBean findByDepartamentoId(Integer departamentoId);

}
