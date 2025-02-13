package com.fatima.user_service.controller;

import com.fatima.user_service.model.User;
import com.fatima.user_service.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.createUser(user));
    }

    @GetMapping("/profile/{id}")
    public ResponseEntity<Optional<User>> getProfile(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getProfile(id));
    }
}

