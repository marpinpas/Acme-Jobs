
package acme.features.anonymous.pinerobulletin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.bulletins.PineroBulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousPineroBulletinCreateService implements AbstractCreateService<Anonymous, PineroBulletin> {

	@Autowired
	AnonymousPineroBulletinRepository repository;


	@Override
	public boolean authorise(final Request<PineroBulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public PineroBulletin instantiate(final Request<PineroBulletin> request) {
		assert request != null;

		PineroBulletin result;

		result = new PineroBulletin();
		result.setSignature("signature");
		result.setBody("body");
		result.setTitle("title");

		return result;
	}

	@Override
	public void unbind(final Request<PineroBulletin> request, final PineroBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "signature", "title", "body");
	}

	@Override
	public void bind(final Request<PineroBulletin> request, final PineroBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void validate(final Request<PineroBulletin> request, final PineroBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<PineroBulletin> request, final PineroBulletin entity) {
		assert request != null;
		assert entity != null;

		this.repository.save(entity);

	}

}
