package com.fatima.user_service.service;

import com.fatima.user_service.model.User;
import com.fatima.user_service.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User createUser(User user) {
        user.setActive(true);
        return userRepository.save(user);
    }

    public Optional<User> getProfile(Long id) {
        return userRepository.findById(id);
    }
}

