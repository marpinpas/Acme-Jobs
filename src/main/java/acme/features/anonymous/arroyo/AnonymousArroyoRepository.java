
package acme.features.anonymous.arroyo;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.arroyo.Arroyo;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousArroyoRepository extends AbstractRepository {

	@Query("select s from Arroyo s")
	Collection<Arroyo> findMany();

}
