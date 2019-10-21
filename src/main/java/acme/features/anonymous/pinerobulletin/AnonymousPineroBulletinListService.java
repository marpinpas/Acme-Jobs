
package acme.features.anonymous.pinerobulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.bulletins.PineroBulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousPineroBulletinListService implements AbstractListService<Anonymous, PineroBulletin> {

	@Autowired
	AnonymousPineroBulletinRepository repository;


	@Override
	public boolean authorise(final Request<PineroBulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public Collection<PineroBulletin> findMany(final Request<PineroBulletin> request) {
		assert request != null;

		Collection<PineroBulletin> result;

		result = this.repository.findMany();

		return result;

	}

	@Override
	public void unbind(final Request<PineroBulletin> request, final PineroBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "body", "signature");
	}
}
