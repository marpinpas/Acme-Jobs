
package acme.features.anonymous.romerobulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.bulletins.RomeroBulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousRomeroBulletinRepository extends AbstractRepository {

	@Query("select s from RomeroBulletin s")
	Collection<RomeroBulletin> findMany();

}
