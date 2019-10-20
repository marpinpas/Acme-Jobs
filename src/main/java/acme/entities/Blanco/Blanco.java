
package acme.entities.Blanco;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Blanco extends DomainEntity {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	private String				name;

	@NotBlank
	private String				email;

	@NotBlank
	private String				profession;

	@NotBlank
	private String				hobby;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	private Date				startdate;
}
