package fi.teemu.clippa.controller;

import fi.teemu.clippa.persistence.entity.UserDetails;
import fi.teemu.clippa.service.UserDetailsService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class UserDetailsController {

    private UserDetailsService userDetailsService;

    @GetMapping("/users")
    public List<UserDetails> getUsers() {
        return userDetailsService.findAll();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<UserDetails> getById(@PathVariable long id) {
        Optional<UserDetails> userDetails = userDetailsService.findById(id);

        if (userDetails.isPresent()) {
            return ResponseEntity.ok(userDetails.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
