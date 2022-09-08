package com.example.music_player.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class User {

    private Long id;
    private String fullName;
    private String userName;
    private String password;



    private List<Song> userSongs = new ArrayList<>();

    public User(Long id, String fullName, String userName, String password){
        this.id = id;
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
    }
}
