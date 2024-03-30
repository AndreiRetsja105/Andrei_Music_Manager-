/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package andreimusicmanager;

/**
 *
 * @author arets
 */
public interface LikedSongsInterface {
    
    int countSongs();                                               // Counts the total number of songs in the playlist.
    void addSong();                                                 // Adds a new song to the playlist.
    void deleteSong();                                              // Deletes a song from the playlist.
    void printPlaylist();                                           // Prints the contents of the playlist.
    void addLastSongToGenre();                                      // Adds the last played song to the corresponding genre playlist.
    void searchSong(String title, String artist, String album);     // The title , artist , and album of the song to search for.
    void setRepeat();                                               // Sets repeat mode for the playlist.
    void setNotRepeat();                                            // Sets repeat mode off for the playlist.
}
