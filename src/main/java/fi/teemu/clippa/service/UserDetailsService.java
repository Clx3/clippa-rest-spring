package fi.teemu.clippa.service;

import fi.teemu.clippa.persistence.entity.ClippaUserDetails;
import fi.teemu.clippa.repository.UserDetailsRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserDetailsService {

    private UserDetailsRepository repository;

    public Optional<ClippaUserDetails> findSelf() {
        Jwt jwtAuthDetails = (Jwt) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String email = jwtAuthDetails.getClaim("email"); // TODO Can email be null when extra auth providers will be added?
        return repository.findByEmailEquals(email);
    }

    public List<ClippaUserDetails> findAll() {
        return (List<ClippaUserDetails>) repository.findAll();
    }

    public Optional<ClippaUserDetails> findById(long id) {
        return repository.findById(id);
    }
}
