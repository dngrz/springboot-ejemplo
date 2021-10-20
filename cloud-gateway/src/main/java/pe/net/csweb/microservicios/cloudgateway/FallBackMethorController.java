package pe.net.csweb.microservicios.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethorController {
	
	@GetMapping("/usuarioServiceFallBack")
	public String usuarioServiceFallbackMethod() {
		return "Usuario Service esta demorando en responder. " + 
				" Intente nuevamente en unos minutos.";
	}

	@GetMapping("/departamentoServiceFallBack")
	public String departamentoServiceFallbackMethod() {
		return "Departamento Service esta demorando en responder. " + 
				" Intente nuevamente en unos minutos.";
	}
}
