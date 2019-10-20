
package acme.features.anonymous.cruz;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.cruz.Cruz;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousCruzCreateService implements AbstractCreateService<Anonymous, Cruz> {

	@Autowired
	AnonymousCruzRepository repository;


	@Override
	public boolean authorise(final Request<Cruz> request) {
		assert request != null;

		return true;
	}

	@Override
	public Cruz instantiate(final Request<Cruz> request) {
		assert request != null;

		Cruz result;
		Date moment;

		moment = new Date(System.currentTimeMillis() - 1);

		result = new Cruz();
		result.setAuthor("Petra Broke");
		result.setAge(22);
		result.setPhone("654753268");
		result.setText("Loop");
		result.setMoment(moment);

		return result;
	}

	@Override
	public void unbind(final Request<Cruz> request, final Cruz entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "author", "age", "phone", "text");
	}

	@Override
	public void bind(final Request<Cruz> request, final Cruz entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void validate(final Request<Cruz> request, final Cruz entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;
	}

	@Override
	public void create(final Request<Cruz> request, final Cruz entity) {
		assert request != null;
		assert entity != null;

		Date moment;

		moment = new Date(System.currentTimeMillis() - 1);
		entity.setMoment(moment);
		this.repository.save(entity);
	}

}
