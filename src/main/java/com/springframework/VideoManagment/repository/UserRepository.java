package com.springframework.VideoManagment.repository;

import com.springframework.VideoManagment.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User  findByUserNameOrEmail(String userName, String email);
}