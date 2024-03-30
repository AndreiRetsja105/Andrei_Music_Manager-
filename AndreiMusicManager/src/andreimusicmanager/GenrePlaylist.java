/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andreimusicmanager;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author arets
 */
    public class GenrePlaylist implements GenrePlaylistInterface {
    
    // ArrayLists to store songs for both genres 
    private final ArrayList<Node> popPlaylist;
    private final ArrayList<Node> rockPlaylist;
   

    // Private constructor to prevent instantiation
    private GenrePlaylist() {
    // Initialize playlists and set repeat mode to false by default
        this.popPlaylist = new ArrayList<>();
        this.rockPlaylist = new ArrayList<>();
        this.repeat = false;
    }

    
    // Variable to keep track of repeat mode 
    private boolean repeat;
    private static GenrePlaylist instance;
    
    
    // Method to get the singleton instance
    public static GenrePlaylist getInstance() {
        // Create a new instance if it doesn't exist
        if (instance == null) {
            instance = new GenrePlaylist();
        }
        return instance;
    } 
    
    
    // Method to add the last song to the specified genre playlist
    public void moveLastSongToGenre(String genre) {
        Node lastNode = null;
        ArrayList<Node> targetPlaylist = null;

        // Determine the target playlist based on the specified genre
        if (genre.equalsIgnoreCase("Pop")) {
            lastNode = !popPlaylist.isEmpty() ? popPlaylist.get(popPlaylist.size() - 1) : null;
            targetPlaylist = popPlaylist;
        } else if (genre.equalsIgnoreCase("Rock")) {
            lastNode = !rockPlaylist.isEmpty() ? rockPlaylist.get(rockPlaylist.size() - 1) : null;
            targetPlaylist = rockPlaylist;
        } else {
            JOptionPane.showMessageDialog(null, "Invalid genre. Please enter 'Pop' or 'Rock'");
            return;
        }
        // Check if the last song exists
        if (lastNode != null) {
            // Remove the last song from its current playlist
            targetPlaylist.remove(lastNode);
            // Add the last song to the specified genre playlist
            if (lastNode != null) {
                if (genre.equalsIgnoreCase("Pop")) {
                    popPlaylist.add(lastNode);
                } else if (genre.equalsIgnoreCase("Rock")) {
                    rockPlaylist.add(lastNode);
                }
                JOptionPane.showMessageDialog(null, "Last song moved to " + genre + " playlist");
            }
        } else {
            JOptionPane.showMessageDialog(null, "There are no songs in the specified genre playlist");
        }
    }
    
    
    // Add song to the Pop playlist
    @Override
    public void addPopSong(Song song) {
        // Create a new Node for the song
        Node newNode = new Node(song) {};
    
        // Add the new song to the Pop playlist
        popPlaylist.add(newNode);
        // Display a message indicating successful addition
        JOptionPane.showMessageDialog(null, "Song was added to Pop playlist ");
        // If repeat mode is enabled and there is more than one song, make the playlist circular
        if (repeat && popPlaylist.size() > 1) {
            popPlaylist.get(popPlaylist.size() - 2).setNext(newNode);
            newNode.setNext(popPlaylist.get(0));
        }
    }

    // Add song to the Rock playlist
    @Override
    public void addRockSong(Song song) {
        // Create a new Node for the song
        Node newNode = new Node(song);
        // Add the new song to the Rock playlist
        rockPlaylist.add(newNode);
        // Display a message indicating successful addition
        JOptionPane.showMessageDialog(null, "Song was added to Rock playlist ");
        // If repeat mode is enabled and there is more than one song, make the playlist circular
        if (repeat && rockPlaylist.size() > 1) {
            rockPlaylist.get(rockPlaylist.size() - 2).setNext(newNode);
            newNode.setNext(rockPlaylist.get(0));
        }
    }

    @Override
    public void deletePopSong(Song songToDelete) {
    // Check if the Pop playlist is empty
    if (popPlaylist.isEmpty()) {
        System.out.println("The Pop Playlist is empty");
        JOptionPane.showMessageDialog(null, "The Pop Playlist is empty ");
        return;
        }
        boolean songFound = false;
        Iterator<Node> iterator = popPlaylist.iterator();
        while (iterator.hasNext()) {
            Node currentNode = iterator.next();
            if (currentNode.getSong().equals(songToDelete)) {
                iterator.remove(); // Remove the song from the playlist
                songFound = true;
                break; // Exit the loop once the song is deleted
            }
        }
        if (songFound) {
            System.out.println("Song deleted from Pop Playlist");
            JOptionPane.showMessageDialog(null, "Song deleted from Pop Playlist");
        } else {
            System.out.println("Song not found in Pop Playlist");
            JOptionPane.showMessageDialog(null, "Song not found in Pop Playlist");
        }
    }
    
    
    // Delete song from the Rock playlist
    @Override
    public void deleteRockSong(Song songToDelete) {
        // Check if the Rock playlist is empty
        if (rockPlaylist.isEmpty()) {
            System.out.println("The Rock Playlist is empty");
            JOptionPane.showMessageDialog(null, " The Rock Playlist is empty ");
            return;
        }
        boolean songFound = false;
        Iterator<Node> iterator = rockPlaylist.iterator();
        while (iterator.hasNext()) {
            Node currentNode = iterator.next();
            if (currentNode.getSong().equals(songToDelete)) {
                iterator.remove(); // Remove the song from the playlist
                songFound = true;
                break; // Exit the loop once the song is deleted
            }
        }
        if (songFound) {
            System.out.println("Song deleted from Rock Playlist");
            JOptionPane.showMessageDialog(null, " Song deleted from Playlist ");
        } else {
            System.out.println(" Song not found in Playlist");
            JOptionPane.showMessageDialog(null, " Song not found in Playlist ");
        }
    }

    // Print the Pop playlist
    @Override
    public void printPopPlaylist() {
        StringBuilder playlistContent = new StringBuilder("Pop Playlist:\n");
        // Check if the playlist is empty
        if (popPlaylist.isEmpty()) {
            JOptionPane.showMessageDialog(null, "The Pop playlist is empty.");
            return;
        }
        // Iterate over each Node in the playlist and append the song information to the StringBuilder
        for (Node node : popPlaylist) {
            // Retrieve the Song object associated with the current Node
            Song song = node.getSong();
            // Append the title and artist of the song to the StringBuilder
            playlistContent.append(" Title : ").append(song.getTitle()).append(" Artist : ").append(song.getArtist()).append(" Album : ").append(song.getAlbum()).append("\n");
        }
        JOptionPane.showMessageDialog(null, playlistContent.toString());
    }

    
    // Print the Rock playlist
    @Override
    public void printRockPlaylist() {
        StringBuilder playlistContent = new StringBuilder("Rock Playlist:\n");
        // Check if the playlist is empty
        if (rockPlaylist.isEmpty()) {
            JOptionPane.showMessageDialog(null, "The Rock Playlist is empty.");
            return;
        }
        // Iterate over each Node in the playlist and append the song information to the StringBuilder
        for (Node node : rockPlaylist) {
            // Retrieve the Song object associated with the current Node
            Song song = node.getSong();
            // Append the title , artist ,and Album of the song to the StringBuilder
            playlistContent.append(" Title : ").append(song.getTitle()).append(" Artist : ").append(song.getArtist()).append(" Album : ").append(song.getAlbum()).append("\n");
        }
        JOptionPane.showMessageDialog(null, playlistContent.toString());
    }


    // Count total songs in Pop
    @Override
    public int countPopSongs() {
        // Display the size of the Pop playlist
        JOptionPane.showMessageDialog(null , "Songs in PlayList: " + popPlaylist.size() );
        return popPlaylist.size();
    }

    // Count total songs in Rock
    @Override
    public int countRockSongs() {
        // Display the size of the Rock playlist
        JOptionPane.showMessageDialog(null , "Songs in PlayList: " + rockPlaylist.size() );
        return rockPlaylist.size();
    }

    
    // Method to search for a song in the Pop playlist by title, artist, or album
    @Override
    public void searchPopSong(String title, String artist, String album) {
        // Check if the Rock playlist is empty
        if (popPlaylist.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Playlist is empty, add song to search");
            return;
        }
        boolean songFound = false;
        // The playlist iterate to find the song matching,  the search term
        for (Node currentNode : popPlaylist) {
            // Retrieve the current song from the node
            Song currentSong = currentNode.getSong();
            // Check if the current song matches the search criteria
            if (currentSong.getTitle().equalsIgnoreCase(title) || currentSong.getArtist().equalsIgnoreCase(artist) || currentSong.getAlbum().equalsIgnoreCase(album))  {
                // Display a message indicating that the song is found
                JOptionPane.showMessageDialog(null, " Song found in  playlist: " + currentSong.getTitle() + " - " + currentSong.getArtist()+ " - " + currentSong.getAlbum());
                songFound = true;
                break;
            }
        }
        if (!songFound) {    // The song is not Found 
            JOptionPane.showMessageDialog(null, "Song is not found ");
        }
    }

    
    // Method to search for a song in the Rock playlist by title, artist, or album
    @Override
    public void searchRockSong(String title, String artist, String album) {
        // Check if the Rock playlist is empty
        if (rockPlaylist.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Playlist is empty, add song to search");
            return;
        }
        boolean songFound = false;
        // The playlist iterate to find the song matching,  the search term
        for (Node currentNode : rockPlaylist) {
            // Retrieve the current song from the node
            Song currentSong = currentNode.getSong();
            // Check if the current song matches the search criteria
            if (currentSong.getTitle().equalsIgnoreCase(title) || currentSong.getArtist().equalsIgnoreCase(artist) || currentSong.getAlbum().equalsIgnoreCase(album))  {
                // Display a message indicating that the song is found
                JOptionPane.showMessageDialog(null, "Song found in  playlist: " + currentSong.getTitle() + " - " + currentSong.getArtist()+ " - " + currentSong.getAlbum());
                songFound = true;
                break; // Exit the loop since the song is found
            }
        }
        if (!songFound) {    // The song is not Found 
            JOptionPane.showMessageDialog(null, "Song is not found ");
        }
    } 

    
     // Set repeat mode for Pop
    @Override
    public void setRepeat(boolean repeat) {
        // Set the repeat mode based on the input parameter
        this.repeat = repeat;
        
        // If repeat mode is enabled, ensure the last song is linked to the first song for both playlists
        if (repeat) {
             // Check if the Pop playlist is not empty
            if (!popPlaylist.isEmpty()) {
                // Get the last node in the Pop playlist
                Node lastPopNode = popPlaylist.get(popPlaylist.size() - 1);
                lastPopNode.setNext(popPlaylist.get(0));
            }
            if (!rockPlaylist.isEmpty()) {
                // Get the last node in the Rock playlist
                Node lastRockNode = rockPlaylist.get(rockPlaylist.size() - 1);
                 // Link the last node to the first node to make the playlist circular
                lastRockNode.setNext(rockPlaylist.get(0));
            }
        }
    }  
}
