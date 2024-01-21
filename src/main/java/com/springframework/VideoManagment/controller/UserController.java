package com.springframework.VideoManagment.controller;

import com.springframework.VideoManagment.dto.UserDto;
import com.springframework.VideoManagment.model.User;
import com.springframework.VideoManagment.service.implementation.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {


    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }



    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestParam String userName, @RequestParam String email) {
        try {
            User newUser = userService.createUser(userName, email);
            return new ResponseEntity<>(newUser, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


  /*  @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody UserDto userDto) {
        try {
            User newUser = userService.createUser(userDto.getUserName(), userDto.getEmail());
            return new ResponseEntity<>(newUser, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }*/

}
