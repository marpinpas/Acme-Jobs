
package acme.features.anonymous.romerobulletin;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.bulletins.RomeroBulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousRomeroBulletinCreateService implements AbstractCreateService<Anonymous, RomeroBulletin> {

	@Autowired
	AnonymousRomeroBulletinRepository repository;


	@Override
	public boolean authorise(final Request<RomeroBulletin> request) {
		assert request != null;
		return true;
	}

	@Override
	public void bind(final Request<RomeroBulletin> request, final RomeroBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);

	}

	@Override
	public void unbind(final Request<RomeroBulletin> request, final RomeroBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;
		request.unbind(entity, model, "name", "surnames", "place", "type", "fecha", "free");

	}

	@Override
	public RomeroBulletin instantiate(final Request<RomeroBulletin> request) {
		assert request != null;

		RomeroBulletin result;
		Date moment;
		moment = new Date(System.currentTimeMillis() + 1);
		result = new RomeroBulletin();
		result.setName("John");
		result.setSurnames("Doe Doe");
		result.setPlace("Calle Tres");
		result.setFecha(moment);
		return result;
	}

	@Override
	public void validate(final Request<RomeroBulletin> request, final RomeroBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<RomeroBulletin> request, final RomeroBulletin entity) {
		assert request != null;
		assert entity != null;

		this.repository.save(entity);

	}

}
