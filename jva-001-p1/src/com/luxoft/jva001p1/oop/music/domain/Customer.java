package com.luxoft.jva001p1.oop.music.domain;

import java.util.ArrayList;
import java.util.List;

public class Customer
{
    private String name;
    private List<Song> songs;

    public Customer()
    {
        this.songs = new ArrayList<>();
    }

    public Customer(String name)
    {
        this();
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Song> getSongs()
    {
        return songs;
    }

    public void addSong(Song song)
    {
        this.songs.add(song);
    }

    public void addSongs(List<Song> songs)
    {
        this.songs.addAll(songs);
    }
}
