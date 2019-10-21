
package acme.features.anonymous.fernandezbulletin;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.bulletins.FernandezBulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousFernandezBulletinCreateService implements AbstractCreateService<Anonymous, FernandezBulletin> {

	// Internal state ----------------------------------------------------------------

	@Autowired
	AnonymousFernandezBulletinRepository repository;


	@Override
	public boolean authorise(final Request<FernandezBulletin> request) {
		assert request != null;

		return true;

	}

	@Override
	public FernandezBulletin instantiate(final Request<FernandezBulletin> request) {
		assert request != null;

		FernandezBulletin result;
		Date moment;

		moment = new Date(System.currentTimeMillis() - 1);

		result = new FernandezBulletin();
		result.setName("Adrián");
		result.setCountry("Spain");
		result.setEmail("adrian@email.com");
		result.setBirthday(moment);
		result.setAddress("Sevilla, Calle Amor de Dios, Piso 27");

		return result;
	}

	@Override
	public void unbind(final Request<FernandezBulletin> request, final FernandezBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "name", "country", "email", "address");
	}

	@Override
	public void bind(final Request<FernandezBulletin> request, final FernandezBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void validate(final Request<FernandezBulletin> request, final FernandezBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;
	}

	@Override
	public void create(final Request<FernandezBulletin> request, final FernandezBulletin entity) {
		assert request != null;
		assert entity != null;

		Date moment;

		moment = new Date(System.currentTimeMillis() - 1);
		entity.setBirthday(moment);
		this.repository.save(entity);
	}

}
