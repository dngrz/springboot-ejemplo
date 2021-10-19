package pe.net.csweb.microservicios.departamento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import pe.net.csweb.microservicios.departamento.domain.DepartamentoBean;
import pe.net.csweb.microservicios.departamento.repository.DepartamentoRepository;

@Service
@Slf4j
public class DepartamentoService {

	@Autowired
	private DepartamentoRepository departamentoRepository;
	
	public DepartamentoBean guardarDepartamento(DepartamentoBean departamento) {
		log.info("guardarDepartamento");
		return departamentoRepository.save(departamento);
	}

	public DepartamentoBean findDepartamentoById(Integer departamentoId) {
		log.info("findDepartamentoById");
		return departamentoRepository.findByDepartamentoId(departamentoId);
	}

}
