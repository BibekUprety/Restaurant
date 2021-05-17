package com.resturant.management.user.service.impl;

import com.resturant.management.user.model.User;
import com.resturant.management.user.repository.UserRepository;
import com.resturant.management.user.service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        String pwd = user.getPassword();
        String encryptedPwd = new BCryptPasswordEncoder().encode(pwd);
        user.setPassword(encryptedPwd);
        return userRepository.save(user);
    }
}
