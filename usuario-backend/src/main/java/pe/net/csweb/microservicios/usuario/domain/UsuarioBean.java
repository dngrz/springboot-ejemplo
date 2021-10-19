package pe.net.csweb.microservicios.usuario.domain;

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
public class UsuarioBean implements Serializable {

	private static final long serialVersionUID = 4769608609973302803L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer usuarioId;

	private String nombres;

	private String apellidoPate;

	private String apellidoMate;

	private Integer departamentoId;

}
