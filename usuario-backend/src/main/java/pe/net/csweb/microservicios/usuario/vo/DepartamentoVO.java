package pe.net.csweb.microservicios.usuario.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartamentoVO {

	private Integer departamentoId;
	
	private String departamentoNombre;
	
	private String departamentoDireccion;
	
	private String departamentoCodigo;

}
