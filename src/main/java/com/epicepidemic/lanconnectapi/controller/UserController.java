package com.epicepidemic.lanconnectapi.controller;

import com.epicepidemic.lanconnectapi.dao.User;
import com.epicepidemic.lanconnectapi.repository.CredentialsRepository;
import com.epicepidemic.lanconnectapi.repository.ProviderRepository;
import com.epicepidemic.lanconnectapi.repository.UserRepository;
import com.epicepidemic.lanconnectapi.service.UserAddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path="/user")
public class UserController {
    @Autowired
    UserAddService userAddService;

    @GetMapping(path="/add")
    public @ResponseBody String addNewUser(@RequestParam String firstName,
                                           @RequestParam String lastName,
                                           @RequestParam String username,
                                           @RequestParam String email) {

        userAddService.addUser(firstName, lastName, username, email);

        return "Saved user " + username + " for " + firstName;
    }

    @PostMapping(path="/add")
    public @ResponseBody ResponseEntity<User> addNewUser(@RequestBody User user) {
        if (user != null) {
            User savedUser = userAddService.addUser(user);
            return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
        } else return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
