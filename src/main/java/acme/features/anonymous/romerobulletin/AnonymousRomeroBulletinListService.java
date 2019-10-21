
package acme.features.anonymous.romerobulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.bulletins.RomeroBulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousRomeroBulletinListService implements AbstractListService<Anonymous, RomeroBulletin> {

	@Autowired
	AnonymousRomeroBulletinRepository repository;


	@Override
	public boolean authorise(final Request<RomeroBulletin> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<RomeroBulletin> request, final RomeroBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "name", "surnames", "place", "type", "fecha", "free");

	}

	@Override
	public Collection<RomeroBulletin> findMany(final Request<RomeroBulletin> request) {
		assert request != null;
		Collection<RomeroBulletin> result;
		result = this.repository.findMany();
		return result;
	}

}
