package fi.teemu.clippa.service;

import fi.teemu.clippa.persistence.entity.UserDetails;
import fi.teemu.clippa.repository.UserDetailsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserDetailsService {

    private UserDetailsRepository repository;

    public List<UserDetails> findAll() {
        return (List<UserDetails>) repository.findAll();
    }

    public Optional<UserDetails> findById(long id) {
        return repository.findById(id);
    }
}
