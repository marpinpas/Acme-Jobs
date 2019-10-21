
package acme.features.anonymous.pinerobulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.bulletin.PineroBulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousPineroBulletinRepository extends AbstractRepository {

	@Query("select s from PineroBulletin s")
	Collection<PineroBulletin> findMany();

}
