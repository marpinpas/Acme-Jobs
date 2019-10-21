
package acme.features.anonymous.arroyobulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.bulletins.ArroyoBulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousArroyoBulletinListService implements AbstractListService<Anonymous, ArroyoBulletin> {

	@Autowired
	AnonymousArroyoBulletinRepository repository;


	@Override
	public boolean authorise(final Request<ArroyoBulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public Collection<ArroyoBulletin> findMany(final Request<ArroyoBulletin> request) {
		assert request != null;

		Collection<ArroyoBulletin> result;

		result = this.repository.findMany();

		return result;
	}

	@Override
	public void unbind(final Request<ArroyoBulletin> request, final ArroyoBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "dateTimeBirth", "name", "description", "phone");
	}

}
