/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andreimusicmanager;

/**
 *
 * @author arets
 */
public class Song {
    
    private String name, artist, album ;

    public Song(String name, String artist, String album ) {
        this.name = name;
        this.artist = artist;
        this.album = album;
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlbum(String album) {
        this.album = album;
    }


    public String getName() {
        return name;
    }

    public String getAlbum() {
        return album;
    }

    @Override
    public String toString() {
        return "Song{" + "name=" + name + ", artist=" + artist + ", album=" + album + '}';
    }
    
}
