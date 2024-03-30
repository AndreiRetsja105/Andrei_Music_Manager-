/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package andreimusicmanager;

/**
 *
 * @author arets
 */
public interface GenrePlaylistInterface {
    
    int countPopSongs();
    int countRockSongs();
    void printPopPlaylist();
    void printRockPlaylist();
    void addPopSong(Song song);
    void addRockSong(Song song);
    void deletePopSong(Song song);
    void deleteRockSong(Song song);
    void searchPopSong(String title, String artist, String album );
    void searchRockSong(String title, String artist, String album );
    void setRepeat(boolean repeat);
}
