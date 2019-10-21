
package acme.features.anonymous.cruzbulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.bulletins.CruzBulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousCruzBulletinListService implements AbstractListService<Anonymous, CruzBulletin> {

	@Autowired
	AnonymousCruzBulletinRepository repository;


	@Override
	public boolean authorise(final Request<CruzBulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public Collection<CruzBulletin> findMany(final Request<CruzBulletin> request) {
		assert request != null;

		Collection<CruzBulletin> result;

		result = this.repository.findMany();

		return result;
	}

	@Override
	public void unbind(final Request<CruzBulletin> request, final CruzBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "author", "age", "phone", "text", "moment");
	}

}
