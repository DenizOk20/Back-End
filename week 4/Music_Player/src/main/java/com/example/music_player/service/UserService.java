package com.example.music_player.service;

import com.example.music_player.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    static List<User> users = new ArrayList<>();

    public static List<User> getUsers() {
        return users;
    }

    public static void setUsers(List<User> users) {
        UserService.users = users;
    }

    public List<User> getAllUsers(){
        return users;
    }

    public String getUserByUserName(String username){
        User founduser =  users.stream().filter(user -> user.getUserName().equals(username)).findAny().orElseThrow();
        return "usernam:" + founduser.getUserName() + " Password: " + founduser.getPassword();
    }

    public String updateUser(Long id, User newUser){
        User foundUser = users.stream().filter(u -> u.getId() == id).findFirst().orElseThrow();

        if(foundUser.getUserName() != null) foundUser.setUserName(newUser.getUserName());
        if(foundUser.getPassword() != null) foundUser.setPassword(newUser.getPassword());

        return foundUser.getId() + "id'li kullanıcı güncellendi.";
    }

    public String deleteUser(Long id){
        User foundUser = users.stream().filter(u -> u.getId() == id).findFirst().orElseThrow();

        users.remove(foundUser);

        return foundUser.getId() + "id'li kullanıcı silindi.";
    }

    public User addUser(User user){
        users.add(user);
        return user;
    }

    public List<User> userControl(String key){
        return users.stream().filter(user -> user.getUserName().contains(key)).toList();
    }
}
