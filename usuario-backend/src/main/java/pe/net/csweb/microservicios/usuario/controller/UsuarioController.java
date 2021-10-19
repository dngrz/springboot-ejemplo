package pe.net.csweb.microservicios.usuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import pe.net.csweb.microservicios.usuario.domain.UsuarioBean;
import pe.net.csweb.microservicios.usuario.service.UsuarioService;
import pe.net.csweb.microservicios.usuario.vo.ResponseTemplateVO;

@RestController
@RequestMapping("/usuarios")
@Slf4j
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/")
	public UsuarioBean grabarUsuario(@RequestBody UsuarioBean usuario) {
		log.info("dentro de grabarUsuario");
		return usuarioService.grabarUsuario(usuario);
	}
	
	@GetMapping("/{id}")
	public ResponseTemplateVO obtUsuarioConDepartamento(@PathVariable("id") Integer id) {
		log.info("dentro de obtUsuarioConDepartamento");
		return usuarioService.obtUsuarioConDepartamento(id);
	}

}
