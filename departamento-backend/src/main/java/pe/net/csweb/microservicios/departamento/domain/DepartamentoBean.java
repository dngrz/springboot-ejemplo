package pe.net.csweb.microservicios.departamento.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartamentoBean implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer departamentoId;
	
	private String departamentoNombre;
	
	private String departamentoDireccion;
	
	private String departamentoCodigo;

}
