package com.example.music_player;

import com.example.music_player.model.Song;
import com.example.music_player.model.User;
import com.example.music_player.service.SongService;
import com.example.music_player.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MusicPlayerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicPlayerApplication.class, args);

        User user1 = new User(1L,"Deniz Ök","Denizok","12345");
        User user2 = new User(2L,"Enes Kaya","eneskaya","1357");

        UserService userservice = new UserService();
        SongService songservice = new SongService();
        userservice.addUser(user1);
        userservice.addUser(user2);


        Song song1 = new Song(1L,"Acem Kızı","Selda Bağcan",2000,"Türkü");
        songservice.addSong(song1);



    }

}
