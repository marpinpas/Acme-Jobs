
package acme.features.anonymous.arroyobulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.bulletins.ArroyoBulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousArroyoBulletinRepository extends AbstractRepository {

	@Query("select s from ArroyoBulletin s")
	Collection<ArroyoBulletin> findMany();

}
