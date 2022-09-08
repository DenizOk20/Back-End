package com.example.music_player.service;

import com.example.music_player.model.Song;

import java.util.ArrayList;
import java.util.List;

public class SongService {

    List<Song> songList = new ArrayList<>();

    public List<Song> getAllSongs(){
        return  songList;
    }

    public Song getSongById(Long id){
        return songList.stream().filter(song -> song.getId() == id).findFirst().orElseThrow();
    }

    public String addSong(Song song){
        if (songList.size()< 20){
            songList.add(song);
            return song.getId() + "id'li şarkı eklendi.";
        }
        return "Müzik eklemek için boş alan yok.";
    }

    public String updateSong(Long id, Song newSong){
        Song foundSong = songList.stream().filter(song -> song.getId() == id).findFirst().orElseThrow();

        foundSong.setSongName(newSong.getSongName());
        return foundSong.getId() + "id'li şarkı güncellendi.";
    }
    public String deleteSong(Long id){

        Song foundSong = songList.stream().filter(song -> song.getId() == id).findFirst().orElseThrow();
        songList.remove(foundSong);

        return  foundSong.getId() + "id'li şarkı silindi.";
    }


}
