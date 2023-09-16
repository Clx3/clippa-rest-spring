package fi.teemu.clippa.service;

import fi.teemu.clippa.persistence.entity.User;
import fi.teemu.clippa.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository repository;

    public List<User> findAll() {
        return (List<User>) repository.findAll();
    }
}
