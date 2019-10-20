
package acme.features.anonymous.cruz;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.cruz.Cruz;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousCruzListService implements AbstractListService<Anonymous, Cruz> {

	@Autowired
	AnonymousCruzRepository repository;


	@Override
	public boolean authorise(final Request<Cruz> request) {
		assert request != null;

		return true;
	}

	@Override
	public Collection<Cruz> findMany(final Request<Cruz> request) {
		assert request != null;

		Collection<Cruz> result;

		result = this.repository.findMany();

		return result;
	}

	@Override
	public void unbind(final Request<Cruz> request, final Cruz entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "author", "age", "phone", "text", "moment");
	}

}
