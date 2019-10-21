
package acme.entities.bulletins;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class FernandezBulletin extends DomainEntity {

	//Serialisation identifier ------------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	private String				name;

	@NotBlank
	private String				country;

	@NotBlank
	@Email
	private String				email;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	private Date				birthday;

	@NotBlank
	private String				address;

}
