package fi.teemu.clippa.controller;

import fi.teemu.clippa.persistence.entity.User;
import fi.teemu.clippa.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping("/users/")
    public List<User> getUsers() {
        return userService.findAll();
    }

    @PostMapping("/user/register")
    public String registerUser() {
        return "Hello user";
    }

}
