package com.example.songr.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String artist;
    private int songCount;
    private int length;
    private String imgUrl;

    @OneToMany(mappedBy = "album", fetch = FetchType.EAGER)
    private List<Song> songs;

    public Album() {
    }

    public Album(String title, String artist, int songCount, int length, String imgUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imgUrl = imgUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
