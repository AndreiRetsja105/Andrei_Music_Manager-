/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andreimusicmanager;

import java.util.Objects;

/**
 *
 * @author arets
 */
public class Song {
    
       private String title, artist, album ;

    // Constructor
    public Song(String title, String artist, String album) {
        this.title = title;
        this.artist = artist;
        this.album = album;
    }

    // Getters and setters
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    // hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(title, artist, album);
    }
    
    @Override
   //The method to compare Title , Artist , and Album attributes = Using the Objects for a equals
    public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    Song other = (Song) obj;
    return Objects.equals(this.title, other.title) &&
           Objects.equals(this.artist, other.artist) &&
           Objects.equals(this.album, other.album);
}
    
    // toString method
    @Override
    public String toString() {
        return "Song{" + "Title: " + title + ", Artist: " + artist + ", Album: " + album + '}';
    }
}