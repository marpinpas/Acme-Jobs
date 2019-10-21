
package acme.entities.bulletins;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class RomeroBulletin extends DomainEntity {

	private static final long	serialVersionUID	= 1L;
	@NotBlank
	private String				name;

	@NotBlank
	private String				surnames;

	@NotBlank
	private String				place;

	@NotBlank
	private String				type;

	@Temporal(TemporalType.TIMESTAMP)
	@Future
	private Date				fecha;

	private Boolean				free;
}
