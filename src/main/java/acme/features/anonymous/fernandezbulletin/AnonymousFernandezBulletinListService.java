
package acme.features.anonymous.fernandezbulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.bulletins.FernandezBulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousFernandezBulletinListService implements AbstractListService<Anonymous, FernandezBulletin> {

	//Internal state --------------------------------------------------------

	@Autowired
	AnonymousFernandezBulletinRepository repository;


	//AbstractListService<Administrator, FernandezBulletin> interface -------

	@Override
	public boolean authorise(final Request<FernandezBulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public Collection<FernandezBulletin> findMany(final Request<FernandezBulletin> request) {
		assert request != null;

		Collection<FernandezBulletin> result;

		result = this.repository.findMany();

		return result;
	}

	@Override
	public void unbind(final Request<FernandezBulletin> request, final FernandezBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "name", "country", "email", "birthday", "address");
	}

}
