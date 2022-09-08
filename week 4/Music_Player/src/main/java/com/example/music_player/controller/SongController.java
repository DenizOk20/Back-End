package com.example.music_player.controller;

import com.example.music_player.model.Song;
import com.example.music_player.service.SongService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/songs")
public class SongController {

    SongService songService;
    @GetMapping
    public List<Song> getAllSongs(){
        return songService.getAllSongs();
    }

    public Song getSongById(Long id){
        return songService.getSongById(id);
    }

    @PostMapping
    public String addSong(Song newSong){
        return songService.addSong(newSong);
    }

    @PutMapping
    public String updateSong(Long id,Song newSong){
       return songService.updateSong(id,newSong);
    }

    @DeleteMapping
    public String deleteSong(Long id){
        return songService.deleteSong(id);
    }
}
