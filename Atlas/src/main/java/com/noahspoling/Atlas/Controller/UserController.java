package com.noahspoling.Atlas.Controller;

import com.noahspoling.Atlas.Service.*;

import jakarta.websocket.server.PathParam;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.noahspoling.Atlas.Model.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * User Controller Handles all api endpoint requests involved in 
 */
@RestController
public class UserController {
    private UserService userService;
    private static UserController instance = null;

    public UserController(){
        this.userService = new UserService();
    }

    @PostMapping(value ="/login", consumes = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<User> loginHandler(@RequestBody User user) {
        User responseUser = userService.login(user);
        if(responseUser == null) {
            return null;
        }
        else {
            return ResponseEntity.ok(responseUser);
        }
    }
    @PostMapping(value ="/logout", consumes = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<User> logoutHandler(@RequestBody User user) {
        User responseUser = userService.logout(user);
        if(responseUser == null) {
            return null;
        }
        else {
            return ResponseEntity.ok(responseUser);
        }
    }

    @PostMapping(value ="/register", consumes = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<User> createAccountHandler(@RequestBody User user) {
        User responseUser = userService.addUser(user);
        if(responseUser == null) {
            return null;
        }
        else {
            return ResponseEntity.ok(responseUser);
        }
    }

    @GetMapping(value ="/users/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<User> getUser(@PathVariable long id) {
        User responseUser = userService.getUser(id);
        if(responseUser == null) {
            return null;
        }
        else {
            return ResponseEntity.ok(responseUser);
        }
    }

    @PostMapping(value ="/users", consumes = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<List<User>> getAllUsersId() {
        List<User> responseUser = userService.getAllUsers();
        if(responseUser == null) {
            return null;
        }
        else {
            return ResponseEntity.ok(responseUser);
        }
    }
}

