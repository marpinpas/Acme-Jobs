
package acme.features.anonymous.romero;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.romero.Romero;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousRomeroRepository extends AbstractRepository {

	@Query("select s from Romero s")
	Collection<Romero> findMany();

}
