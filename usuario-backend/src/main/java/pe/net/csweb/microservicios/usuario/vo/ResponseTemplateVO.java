package pe.net.csweb.microservicios.usuario.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.net.csweb.microservicios.usuario.domain.UsuarioBean;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

	private UsuarioBean usuario;
	
	private DepartamentoVO departamento;
}
