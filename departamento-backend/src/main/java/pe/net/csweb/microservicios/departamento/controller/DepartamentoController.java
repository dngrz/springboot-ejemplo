package pe.net.csweb.microservicios.departamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import pe.net.csweb.microservicios.departamento.domain.DepartamentoBean;
import pe.net.csweb.microservicios.departamento.service.DepartamentoService;

@RestController
@RequestMapping("/departamentos")
@Slf4j
public class DepartamentoController {
	
	@Autowired
	private DepartamentoService departamentoService;

	@PostMapping("/")
	public DepartamentoBean guardarDepartamento(@RequestBody DepartamentoBean departamento) {
		log.info("dentro de guardarDepartamento");
		return departamentoService.guardarDepartamento(departamento);
	}
	
	@GetMapping("/{id}")
	public DepartamentoBean findDepartamentById(@PathVariable("id") Integer departamentoId) {
		log.info("dentro de findDepartamentById");
		return departamentoService.findDepartamentoById(departamentoId);
	}

}
