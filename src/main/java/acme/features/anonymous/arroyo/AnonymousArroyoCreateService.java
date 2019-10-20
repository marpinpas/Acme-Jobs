
package acme.features.anonymous.arroyo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.shouts.Arroyo;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousArroyoCreateService implements AbstractCreateService<Anonymous, Arroyo> {

	@Autowired
	AnonymousArroyoRepository repository;


	@Override
	public boolean authorise(final Request<Arroyo> request) {
		assert request != null;

		return true;
	}

	@Override
	public Arroyo instantiate(final Request<Arroyo> request) {
		assert request != null;

		Arroyo result;
		Date dateTimeBirth;

		dateTimeBirth = new Date(System.currentTimeMillis() - 1);

		result = new Arroyo();
		result.setDateTimeBirth(dateTimeBirth);
		result.setName("Alexander White");
		result.setDescription("Lorem ipsum");
		result.setPhone("666555444");

		return result;

	}

	@Override
	public void unbind(final Request<Arroyo> request, final Arroyo entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "name", "description", "dateTimeBirth", "phone");

	}

	@Override
	public void bind(final Request<Arroyo> request, final Arroyo entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void validate(final Request<Arroyo> request, final Arroyo entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;
	}

	@Override
	public void create(final Request<Arroyo> request, final Arroyo entity) {
		assert request != null;
		assert entity != null;

		this.repository.save(entity);
	}

}
