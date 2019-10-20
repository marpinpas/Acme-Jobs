
package acme.features.anonymous.romero;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.romero.Romero;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousRomeroListService implements AbstractListService<Anonymous, Romero> {

	@Autowired
	AnonymousRomeroRepository repository;


	@Override
	public boolean authorise(final Request<Romero> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<Romero> request, final Romero entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "name", "surnames", "place", "type", "fecha", "free");

	}

	@Override
	public Collection<Romero> findMany(final Request<Romero> request) {
		assert request != null;
		Collection<Romero> result;
		result = this.repository.findMany();
		return result;
	}

}
