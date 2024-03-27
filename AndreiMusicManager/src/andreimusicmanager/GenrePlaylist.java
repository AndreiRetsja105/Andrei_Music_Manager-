/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andreimusicmanager;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import org.w3c.dom.Node;

/**
 *
 * @author arets
 */
public class GenrePlaylist implements GenrePlaylistInterface {
    
 //two arraylist for the both genres 
    private final ArrayList<Node> popPlaylist;
    private final ArrayList<Node> rockPlaylist;
    //variable to keep track of repeat 
    private boolean repeat;

    private static GenrePlaylist instance;

    // Private constructor to prevent instantiation
    private GenrePlaylist() {
        this.popPlaylist = new ArrayList<>();
        this.rockPlaylist = new ArrayList<>();
        this.repeat = false;
    }

    // Method to get the singleton instance
    public static GenrePlaylist getInstance() {
        if (instance == null) {
            instance = new GenrePlaylist();
        }
        return instance;
    }
    
    // Add song to the Hip-Hop playlist
    @Override
    public void addPopSong(Song song) {
        //Node class instance 
        Node newNode = new Node(song);
        //adding the new song
        popPlaylist.add(newNode);
        JOptionPane.showMessageDialog(null, "Adding song to Hip-Hop playlist was successful.");
        //if it is repeat
        if (repeat && popPlaylist.size() > 1) {
            // Link the last song to the first song to make it circular
            popPlaylist.get(popPlaylist.size() - 2).setNext(newNode);
            newNode.setNext(popPlaylist.get(0));
        }
    }

    // Add song to the Piano playlist
    @Override
    public void addRockSong(Song song) {
        //Node class instance 
        Node newNode = new Node(song);
        //adding the new song
        rockPlaylist.add(newNode);
        JOptionPane.showMessageDialog(null, "Adding song to Piano playlist was successful.");
        //if it is repeat
        if (repeat && rockPlaylist.size() > 1) {
            // Link the last song to the first song to make it circular
           rockPlaylist.get(rockPlaylist.size() - 2).setNext(newNode);
            newNode.setNext(rockPlaylist.get(0));
        }
    }

    // Delete song from the Hip-Hop playlist
    @Override
    public void deletePopSong(Song songToDelete) {
        // Check if the list is empty
        if (popPlaylist.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Pop playlist is empty. No song to delete.");
            return;
        }

        // variable to check if the song is found 
        boolean songFound = false;

        // Iterate through the playlist to find and delete the song
        Iterator<Node> iterator = popPlaylist.iterator();
        while (iterator.hasNext()) {
            Node currentNode = iterator.next();
            if (currentNode.getSong().equals(songToDelete)) {
                iterator.remove(); // Remove the song from the playlist
                songFound = true;
                break; // Exit the loop once the song is deleted
            }
        }

        // If the song was found and deleted, notify the user
        if (songFound) {
            JOptionPane.showMessageDialog(null, "Song deleted from Hip-Hop playlist.");
        } else {
            JOptionPane.showMessageDialog(null, "Song not found in Hip-Hop playlist.");
        }
    }
    
    // Delete song from the piano playlist
    @Override
    public void deleteRockSong(Song songToDelete) {
        // Check if the list is empty
        if (rockPlaylist.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Piano playlist is empty. No song to delete.");
            return;
        }

        // variable to check if the song is found 
        boolean songFound = false;

        // Iterate through the playlist to find and delete the song
        Iterator<Node> iterator = rockPlaylist.iterator();
        while (iterator.hasNext()) {
            Node currentNode = iterator.next();
            if (currentNode.getSong().equals(songToDelete)) {
                iterator.remove(); // Remove the song from the playlist
                songFound = true;
                break; // Exit the loop once the song is deleted
            }
        }

        // If the song was found and deleted, notify the user
        if (songFound) {
            JOptionPane.showMessageDialog(null, "Song deleted from Piano playlist.");
        } else {
            JOptionPane.showMessageDialog(null, "Song not found in Piano playlist.");
        }
    }

    // Print the Hip-Hop playlist
    @Override
    public void printPopPlaylist() {
        StringBuilder playlistContent = new StringBuilder("Hip-Hop Playlist:\n");

        // Check if the playlist is empty
        if (popPlaylist.isEmpty()) {
            JOptionPane.showMessageDialog(null, "The Hip-Hop playlist is empty.");
            return;
        }

        // Iterate over each Node in the playlist and append the song information to the StringBuilder
        for (Node node : popPlaylist) {
            // Retrieve the Song object associated with the current Node
            Song song = node.getSong();
            // Append the title and artist of the song to the StringBuilder
            playlistContent.append(song.getTitle()).append(" - ").append(song.getArtist()).append("\n");
        }

        // Show the playlist content in a JOptionPane
        JOptionPane.showMessageDialog(null, playlistContent.toString());
    }

    
    // Print the Piano playlist
    @Override
    public void printRockPlaylist() {
        StringBuilder playlistContent = new StringBuilder("Piano Playlist:\n");

        // Check if the playlist is empty
        if (rockPlaylist.isEmpty()) {
            JOptionPane.showMessageDialog(null, "The Piano playlist is empty.");
            return;
        }

        // Iterate over each Node in the playlist and append the song information to the StringBuilder
        for (Node node : rockPlaylist) {
            // Retrieve the Song object associated with the current Node
            Song song = node.getSong();
            // Append the title and artist of the song to the StringBuilder
            playlistContent.append(song.getTitle()).append(" - ").append(song.getArtist()).append("\n");
        }

        // Show the playlist content using JOptionPane
        JOptionPane.showMessageDialog(null, playlistContent.toString());
    }


    // Count total songs in HIP-HOP
    @Override
    public int countPopSongs() {
        
        JOptionPane.showMessageDialog(null , "The size is: " + popPlaylist.size() );
        return popPlaylist.size();
        
    }

    // Count total songs in Piano
    @Override
    public int countRockSongs() {
        
        JOptionPane.showMessageDialog(null , "The size is: " + rockPlaylist.size() );
        return rockPlaylist.size();
    }

    // Set repeat mode for hiphop
    @Override
    public void setRepeat(boolean repeat) {
        this.repeat = repeat;
        
        if (repeat) {
            // Ensure the last song is linked to the first song for both playlists
            if (!popPlaylist.isEmpty()) {
                Node lastHipHopNode = popPlaylist.get(popPlaylist.size() - 1);
                lastHipHopNode.setNext(popPlaylist.get(0));
            }
            if (!rockPlaylist.isEmpty()) {
                Node lastPianoNode = rockPlaylist.get(rockPlaylist.size() - 1);
                lastPianoNode.setNext(rockPlaylist.get(0));
            }
        }
    }
    
    // Search for a song in the Hip-Hop playlist by title or artist
    @Override
    public void searchPopSong(String title, String artist) {
        if (popPlaylist.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Hip-Hop playlist is empty. No songs to search.");
            return;
        }

        boolean songFound = false;

        // Iterate through the playlist to find the song matching the search term
        for (Node currentNode : popPlaylist) {
            Song currentSong = currentNode.getSong();
            if (currentSong.getTitle().equalsIgnoreCase(title) || currentSong.getArtist().equalsIgnoreCase(artist)) {
                JOptionPane.showMessageDialog(null, "Song found in Hip-Hop playlist: " + currentSong.getTitle() + " - " + currentSong.getArtist());
                songFound = true;
                break;
            }
        }

        if (!songFound) {
            JOptionPane.showMessageDialog(null, "Song not found in Hip-Hop playlist.");
        }
    }

    // Search for a song in the Piano playlist by title or artist
    @Override
    public void searchRockSong(String title, String artist) {
        if (rockPlaylist.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Piano playlist is empty. No songs to search.");
            return;
        }

        boolean songFound = false;

        // Iterate through the playlist to find the song matching the search term
        for (Node currentNode : rockPlaylist) {
            Song currentSong = currentNode.getSong();
            if (currentSong.getTitle().equalsIgnoreCase(title) || currentSong.getArtist().equalsIgnoreCase(artist)) {
                JOptionPane.showMessageDialog(null, "Song found in Piano playlist: " + currentSong.getTitle() + " - " + currentSong.getArtist());
                songFound = true;
                break;
            }
        }

        if (!songFound) {
            JOptionPane.showMessageDialog(null, "Song not found in Piano playlist.");
        }
    } 
    
}
