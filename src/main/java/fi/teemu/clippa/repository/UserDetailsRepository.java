package fi.teemu.clippa.repository;

import fi.teemu.clippa.persistence.entity.ClippaUserDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDetailsRepository extends CrudRepository<ClippaUserDetails, Long> {

	Optional<ClippaUserDetails> findByEmailEquals(String email);

}
