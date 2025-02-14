package com.fatima.user_service.controller;

import com.fatima.user_service.model.User;
import com.fatima.user_service.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        log.info("Creating new user");
        return ResponseEntity.ok(userService.createUser(user));
    }

    @GetMapping("/profile/{id}")
    public ResponseEntity<User> getProfile(@PathVariable Long id) {
        log.info("Accessing User profile of {}", id);
        return userService.getProfile(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }


    @GetMapping("/{id}")
    public ResponseEntity<String> getUserEmailById(@PathVariable Long id){
        log.info("Accessing Email of user {}",id);
        return ResponseEntity.ok(userService.getUserEmailById(id));
    }
}

