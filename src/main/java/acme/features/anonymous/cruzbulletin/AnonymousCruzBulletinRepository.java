
package acme.features.anonymous.cruzbulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.bulletins.CruzBulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousCruzBulletinRepository extends AbstractRepository {

	@Query("select s from CruzBulletin s")
	Collection<CruzBulletin> findMany();

}
