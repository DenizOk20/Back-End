package com.example.music_player.controller;


import com.example.music_player.model.User;
import com.example.music_player.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")

public class UserController {


    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody User newUser){
        return userService.updateUser(id,newUser);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id){
        return  userService.deleteUser(id);
    }
}
