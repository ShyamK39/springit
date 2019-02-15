package com.vega.springit.service;

import com.vega.springit.domain.User;
import com.vega.springit.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private final Logger logger = LoggerFactory.getLogger(UserService.class);
    //private final RoleService roleService;
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        //this.roleService = roleService;
        this.userRepository = userRepository;
    }

    public User register(User user) {
        return user;
    }

    public User save(User user) {
        userRepository.save(user);
        return user;
    }

    @Transactional
    public void saveUsers(User... users) {
        for (User user : users) {
            logger.info("Saving User: " + user.getEmail());
            userRepository.save(user);
        }
    }

}
