
package acme.features.anonymous.cruz;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.cruz.Cruz;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousCruzRepository extends AbstractRepository {

	@Query("select s from Cruz s")
	Collection<Cruz> findMany();

}
