
package acme.entities.cruz;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cruz extends DomainEntity {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	private String				author;

	@Positive
	private Integer				age;

	@NotBlank
	private String				phone;

	@NotBlank
	private String				text;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	private Date				moment;

}
