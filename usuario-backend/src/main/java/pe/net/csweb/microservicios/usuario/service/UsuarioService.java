package pe.net.csweb.microservicios.usuario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;
import pe.net.csweb.microservicios.usuario.domain.UsuarioBean;
import pe.net.csweb.microservicios.usuario.repository.UsuarioRepository;
import pe.net.csweb.microservicios.usuario.vo.DepartamentoVO;
import pe.net.csweb.microservicios.usuario.vo.ResponseTemplateVO;

@Service
@Slf4j
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public UsuarioBean grabarUsuario(UsuarioBean usuario) {
		log.info("grabarUsuario");
		return usuarioRepository.save(usuario);
	}

	public ResponseTemplateVO obtUsuarioConDepartamento(Integer id) {
		log.info("obtUsuarioConDepartamento");
		ResponseTemplateVO vo = new ResponseTemplateVO();
		UsuarioBean usuario = usuarioRepository.findByUsuarioId(id);
		
		DepartamentoVO departamento = 
				restTemplate.getForObject("http://localhost:9001/departamentos/" + usuario.getDepartamentoId(), DepartamentoVO.class);
		
		vo.setDepartamento(departamento);
		vo.setUsuario(usuario);
		
		return vo;
	}

}
