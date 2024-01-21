package com.springframework.VideoManagment.service.implementation;


import com.springframework.VideoManagment.model.User;
import com.springframework.VideoManagment.repository.ContentRepository;
import com.springframework.VideoManagment.repository.RatingRepository;
import com.springframework.VideoManagment.repository.UserRepository;
import com.springframework.VideoManagment.service.interfaces.UserService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final ContentRepository contentRepository;
    private final RatingRepository ratingRepository;


    public UserServiceImpl(UserRepository userRepository, ContentRepository contentRepository, RatingRepository ratingRepository) {
        this.userRepository = userRepository;
        this.contentRepository = contentRepository;
        this.ratingRepository = ratingRepository;
    }
    @Override
    public Optional<User> findById(Long userId) {
        return userRepository.findById(userId);
    }

    @Override
    public Set<User> findAll() {
        Set<User> users = new HashSet<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Set<User> saveAll(Set<User> users) {
        Set<User> saved_users = new HashSet<>();
        userRepository.saveAll(users).forEach(saved_users::add);
        return saved_users;
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public void deleteById(Long userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public void deleteAll(Set<User> users) {
        userRepository.deleteAll(users);
    }

    //############################################

    public Optional<User> findByUserNameOrEmail(String userName, String email) {
        return Optional.ofNullable(userRepository.findByUserNameOrEmail(userName, email));
    }



    public User createUser(String userName, String email) {
        if (userName == null || email == null) {
            throw new IllegalArgumentException("Invalid Input Data!");
        }
        // Check if a user with the given username or email already exists
        User existingUser = userRepository.findByUserNameOrEmail(userName, email);
        if (existingUser != null) {
            throw new IllegalArgumentException("User with the given username or email already exists!");
        }
        // If not, create a new user
        User newUser = new User();
        newUser.setUserName(userName);
        newUser.setEmail(email);

        return userRepository.save(newUser);
    }


}
