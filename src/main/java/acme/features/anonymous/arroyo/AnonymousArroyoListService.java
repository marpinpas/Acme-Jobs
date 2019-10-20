
package acme.features.anonymous.arroyo;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.shouts.Arroyo;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousArroyoListService implements AbstractListService<Anonymous, Arroyo> {

	@Autowired
	AnonymousArroyoRepository repository;


	@Override
	public boolean authorise(final Request<Arroyo> request) {
		assert request != null;

		return true;
	}

	@Override
	public Collection<Arroyo> findMany(final Request<Arroyo> request) {
		assert request != null;

		Collection<Arroyo> result;

		result = this.repository.findMany();

		return result;
	}

	@Override
	public void unbind(final Request<Arroyo> request, final Arroyo entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "dateTimeBirth", "name", "description", "phone");
	}

}
