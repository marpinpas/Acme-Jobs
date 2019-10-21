/*
 * AnonymousUserAccountCreateService.java
 *
 * Copyright (c) 2019 Rafael Corchuelo.
 *
 * In keeping with the traditional purpose of furthering education and research, it is
 * the policy of the copyright owner to permit non-commercial use and redistribution of
 * this software. It has been tested carefully, but it is not guaranteed for any particular
 * purposes. The copyright owner does not offer any warranties or representations, nor do
 * they accept any liabilities with respect to them.
 */

package acme.features.anonymous.blancobulletin;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.bulletins.BlancoBulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousBlancoBulletinCreateService implements AbstractCreateService<Anonymous, BlancoBulletin> {

	// Internal state ---------------------------------------------------------

	@Autowired
	AnonymousBlancoBulletinRepository repository;


	@Override
	public boolean authorise(final Request<BlancoBulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public void bind(final Request<BlancoBulletin> request, final BlancoBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void unbind(final Request<BlancoBulletin> request, final BlancoBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "name", "email", "profession", "hobby", "startdate");

	}

	@Override
	public BlancoBulletin instantiate(final Request<BlancoBulletin> request) {
		assert request != null;

		BlancoBulletin result;
		Date moment;
		moment = new Date(2010 / 10 / 10);
		result = new BlancoBulletin();
		result.setName("Marta");
		result.setEmail("mataaa@jaja.com");
		result.setProfession("Escritora");
		result.setHobby("Leer");
		result.setStartdate(moment);

		return result;
	}

	@Override
	public void validate(final Request<BlancoBulletin> request, final BlancoBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<BlancoBulletin> request, final BlancoBulletin entity) {
		assert request != null;
		assert entity != null;

		this.repository.save(entity);
	}
}
