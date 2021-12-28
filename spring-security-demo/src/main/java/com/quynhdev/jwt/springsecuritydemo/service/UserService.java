package com.quynhdev.jwt.springsecuritydemo.service;

import com.quynhdev.jwt.springsecuritydemo.model.User;
import com.quynhdev.jwt.springsecuritydemo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService implements CommandLineRunner {

    private UserRepository userRepository;

    private PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();

        User user = new User("user",
                passwordEncoder.encode("user123"),
                "USER",
                "");
        User admin = new User("admin",
                passwordEncoder.encode("admin123"),
                "ADMIN",
                "ACCESS_TEST1,ACCESS_TEST2");
        User manager = new User("manager",
                passwordEncoder.encode("manager123"),
                "MANAGER",
                "ACCESS_TEST1");

        List<User> users = Arrays.asList(user, admin, manager);
        this.userRepository.saveAll(users);
    }
}
