
package acme.features.anonymous.arroyobulletin;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.bulletins.ArroyoBulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousArroyoBulletinCreateService implements AbstractCreateService<Anonymous, ArroyoBulletin> {

	@Autowired
	AnonymousArroyoBulletinRepository repository;


	@Override
	public boolean authorise(final Request<ArroyoBulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public ArroyoBulletin instantiate(final Request<ArroyoBulletin> request) {
		assert request != null;

		ArroyoBulletin result;
		Date dateTimeBirth;

		dateTimeBirth = new Date(System.currentTimeMillis() - 1);

		result = new ArroyoBulletin();
		result.setDateTimeBirth(dateTimeBirth);
		result.setName("Alexander White");
		result.setDescription("Lorem ipsum");
		result.setPhone("666555444");

		return result;

	}

	@Override
	public void unbind(final Request<ArroyoBulletin> request, final ArroyoBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "name", "description", "dateTimeBirth", "phone");

	}

	@Override
	public void bind(final Request<ArroyoBulletin> request, final ArroyoBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void validate(final Request<ArroyoBulletin> request, final ArroyoBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;
	}

	@Override
	public void create(final Request<ArroyoBulletin> request, final ArroyoBulletin entity) {
		assert request != null;
		assert entity != null;

		this.repository.save(entity);
	}

}
