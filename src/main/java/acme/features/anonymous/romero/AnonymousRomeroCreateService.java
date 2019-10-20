
package acme.features.anonymous.romero;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.romero.Romero;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousRomeroCreateService implements AbstractCreateService<Anonymous, Romero> {

	@Autowired
	AnonymousRomeroRepository repository;


	@Override
	public boolean authorise(final Request<Romero> request) {
		assert request != null;
		return true;
	}

	@Override
	public void bind(final Request<Romero> request, final Romero entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);

	}

	@Override
	public void unbind(final Request<Romero> request, final Romero entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;
		request.unbind(entity, model, "name", "surnames", "place", "type", "fecha", "free");

	}

	@Override
	public Romero instantiate(final Request<Romero> request) {
		assert request != null;

		Romero result;
		Date moment;
		moment = new Date(System.currentTimeMillis() + 1);
		result = new Romero();
		result.setName("John");
		result.setSurnames("Doe Doe");
		result.setPlace("Calle Tres");
		result.setFecha(moment);
		return result;
	}

	@Override
	public void validate(final Request<Romero> request, final Romero entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<Romero> request, final Romero entity) {
		assert request != null;
		assert entity != null;

		this.repository.save(entity);

	}

}
