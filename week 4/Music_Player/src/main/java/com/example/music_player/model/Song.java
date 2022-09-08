package com.example.music_player.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Song {

    private Long id;
    private String songName;
    private String singer;
    private Integer year;
    private String category;

    public Song(Long id, String songName,String singer ,Integer year,String category){
        this.id = id;
        this.songName = songName;
        this.singer = singer;
        this.year = year;
        this.category = category;
    }

}
