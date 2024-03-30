/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andreimusicmanager;

import static andreimusicmanager.MusicManagerGUI.albumTF;
import static andreimusicmanager.MusicManagerGUI.artistTF;
import static andreimusicmanager.MusicManagerGUI.titleTF;
import static java.lang.ProcessHandle.current;
import static java.util.concurrent.ThreadLocalRandom.current;
import static javax.security.auth.Subject.current;
import javax.swing.JOptionPane;

/**
 *
 * @author arets
 */
public class LikedSongs implements LikedSongsInterface {
    
    private Node head;
    private boolean repeat;

    //constructor 
    public LikedSongs() {
        this.head = null;
        this.repeat = false;
    }

    
    
    @Override
    public void addSong() {
    //if the repeat is activated that means the last node is connected to the head and this might result to errors 
    if (repeat) {
        JOptionPane.showMessageDialog(null, " Deactivate the repeat mode ");
        System.out.println(" Repeat is activated ");
        return;
    }
    
    //taking user input 
    String title = titleTF.getText();
    String artist = artistTF.getText();
    String album = albumTF.getText(); // Fixed typo here

    // Checking Title, artist or Album is empty
    if (title.isEmpty() || artist.isEmpty() || album.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Enter the Title, Artist, and Album");
        return;
    }

    // Create a new song
    Song newSong = new Song(title, artist, album);
    Node newNode = new Node(newSong);
   
    // Add the new song to the list
    if (head == null) {
    // If the list is empty, make the new song the head
        head = newNode;
        JOptionPane.showMessageDialog(null, " Song added ");
        MusicManagerGUI.repeatTOGGLE2.setEnabled(true);
        if (repeat) {
            head.setNext(head); 
        }
    } else {
        // If the list is not empty, find the last node and add the new song after it
        Node last = getLastNode();
        if (last != null) {
            last.setNext(newNode);
            JOptionPane.showMessageDialog(null, " Song added to Liked List ");
            MusicManagerGUI.repeatTOGGLE2.setEnabled(true);
            if (repeat) {
                newNode.setNext(head); // Pointing the last node to the head to create a circular list
                head = newNode; // Update the head to the newly added node to maintain circularity
            }
        } else {
            // Handle the case where last node is null
            JOptionPane.showMessageDialog(null, " The Node is null ");
        }
    }
    }

    // Helper method to find the last node in the list
    private Node getLastNode() {
    if (head == null) {
        return null;
    }
    Node current = head;
    while (current.getNext() != null) {
        current = current.getNext();
    }
    return current;
    }


    @Override
    public void printPlaylist() {
    // Check if the repeat mode is activated
    if (repeat) {
        JOptionPane.showMessageDialog(null, "Deactivate the repeat mode");
        System.out.println("repeat is activated");
        return;
    }
    if (head == null) {
        JOptionPane.showMessageDialog(null, "There are no songs in the list");
        return;
    }
    // Start from the first node
    Node current = head;
    StringBuilder playlistContent = new StringBuilder();
    while (current != null) {
        if (current.getSong() != null) {
            playlistContent.append("Title: ").append(current.getSong().getTitle())
                            .append(" Artist: ").append(current.getSong().getArtist())
                            .append(" Album: ").append(current.getSong().getAlbum())
                            .append("\n");
        }
        current = current.getNext();
    }
    JOptionPane.showMessageDialog(null, playlistContent.toString());
    }


    @Override
    public void deleteSong() {
    //if the repeat is activated that means the last node is connected to the head and this might result to errors 
    if (repeat) {
        JOptionPane.showMessageDialog(null, " Deactivate the repeat mode ");
        System.out.println("repeat is activated");
        return;
    } else {
        //checking if the list is empty first 
        if (head == null) {
            JOptionPane.showMessageDialog(null, "The Liked list is empty");
            return;
        }
        String title = titleTF.getText();
        String artist = artistTF.getText();
        String album = albumTF.getText();
        
        //start from the head 
        Node current = head;
        Node prev = null;
        boolean deletionSuccess = false;
        do {
            // Check if current node has a non-null song associated with it
            if (current.getSong() != null) {
                // Check if the song's title, artist, or album matches the input
                if (current.getSong().getTitle().equalsIgnoreCase(title) || 
                    current.getSong().getArtist().equalsIgnoreCase(artist) || 
                    current.getSong().getAlbum().equalsIgnoreCase(album)) {
                    if (prev == null) {
                        head = head.getNext();
                        JOptionPane.showMessageDialog(null, "Removed Successfully ");
                        deletionSuccess = true;
                        //if it is on repeat we need to keep the circle 
                        if (repeat) {
                            Node last = getLastNode();
                            last.setNext(head); // Updating the last node's next reference
                        }
                    } else {
                        prev.setNext(current.getNext());
                        JOptionPane.showMessageDialog(null, "Removed Successfully ");
                        deletionSuccess = true;
                    }
                    break; // Exit the loop once deletion is successful
                }
            }
            prev = current;
            current = current.getNext();
        } while (current != head && current != null); // Stop when we reach the head again or if current is null (end of list)

        if (!deletionSuccess) {
            JOptionPane.showMessageDialog(null, "Wrong Spellings or Song not found");
        }
    }
  }
    
   @Override
   public int countSongs() {
       //if the repeat is activated that means the last node is connected to the head and this might result to errors 
       if (repeat) {
           JOptionPane.showMessageDialog(null, " Deactivate the repeat mode ");
           System.out.println(" Repeat is activated ");
           return 0;
       } else {
           //check if there is noting in the list 
           if (head == null) {
               JOptionPane.showMessageDialog(null, " The list is empty.");
               return 0;
           }

           //using a variable to track the number of the nodes 
           int count = 0;
           //start from the beginning 
           Node current = head;
           do {
               count++;
               current = current.getNext();
               //assuming the repeat mode is off, this will make the last node pointing to null in this case breaking the loop when it is null 
               if (current == null) { // Add a null check here
                   
                   break; // Exit the loop if current is null
                   
               }
           } while (current != head);

           JOptionPane.showMessageDialog(null, " The Liked songs : " + count);
           return count;
       }
   }

    @Override
    public void setRepeat() {
        //calling the method and assign it to the last 
        Node last = connectingLastNodeToFirst();
        // Updating the last node's next reference to make the list circular
        last.setNext(head); 
        JOptionPane.showMessageDialog(null, "The repeat mode is activated.");
        //keep track of the variable that it is settled to false by the constructor
        this.repeat = true;
        
    }
    
    private Node connectingLastNodeToFirst() {
       //check if the list is empty
       if (head == null) {
           System.out.println("List is empty!");
           return null; // Return null if the list is empty
       }

       //start from the beginning 
       Node current = head;
       while (current.getNext() != null && current.getNext() != head) {
           current = current.getNext();
       }
       System.out.println("Last song point to first song");
       return current;
   }
    
    @Override
    public void setNotRepeat () {
        
        // Disable repeat mode
        Node last = getOffRepeating();
        last.setNext(null); // Update the last node's next reference to null
        JOptionPane.showMessageDialog(null, "The repeat mode is deactivated ");
        this.repeat = false;
        
    }
    
    //getting of repeat 
    private Node getOffRepeating() {
        int count = 0;
        
        if (head == null) {
            System.out.println("List is empty!");
            return null; // Return null if the list is empty
        }
        //start from the beginning 
        Node current = head;
        while (current.getNext() != head ) {
            count ++ ;
            current = current.getNext();
        }
        System.out.println(" Last Node to null");
        return current;
    }
    
    public void searchSong(String title, String artist) {
    // Check if the repeat mode is activated
    if (repeat) {
        JOptionPane.showMessageDialog(null, "The repeat mode is deactivated");
        System.out.println("Repeat mode is activated");
        return;
    }
    
    // Checking if the list is empty 
    if (head == null) {
        JOptionPane.showMessageDialog(null, "The Liked List is empty");
        return;
    }

    boolean found = false;
    StringBuilder result = new StringBuilder();

    // Start from the beginning 
    Node current = head;
    do {
        if (current != null && current.getSong() != null) {
            Song currentSong = current.getSong();
            if (currentSong.getTitle().equalsIgnoreCase(title) || currentSong.getArtist().equalsIgnoreCase(artist)) {
                result.append("Title: ").append(currentSong.getTitle()).append(", Artist: ").append(currentSong.getArtist()).append("\n");
                found = true;
            }
            current = current.getNext();
        }
    } while (current != head); // Stop when we reach the head again

    if (found) {
        JOptionPane.showMessageDialog(null, "The results:\n" + result.toString());
    } else {
        JOptionPane.showMessageDialog(null, "No songs found matching the criteria");
    }
    }

  
    @Override
    public void addLastSongToGenre() {  // The method to add the last song to the genre playlist
    // This code should be similar to the one provided earlier
    // Take user input for the genre (Pop or Rock)
    String userInput = JOptionPane.showInputDialog(null, "Add the genre Pop or Rock :");
    //if the repeat is activated that means the last node is connected to the head and this might result to errors 
    if (repeat) {
        JOptionPane.showMessageDialog(null, " The repeat mode is deactivated ");
        System.out.println("Repeat is activated");
        return;
    } 
    // Find the last node in the list
    Node lastNode = getLastNode();
    if (userInput == null) {
        // User cancelled the operation
        return;
    }
    switch (userInput.toLowerCase()) {
        case "pop" -> {
            // Check if the playlist is empty
            if (head == null) {
                JOptionPane.showMessageDialog(null, "Liked songs list is empty!");
                return;
            }
            if (lastNode == null) {
                // Something went wrong, handle error
                JOptionPane.showMessageDialog(null, " Last Node is not found ");
                return;
            }
            if (repeat) {
                JOptionPane.showMessageDialog(null, "Repeat mode is activated");
                System.out.println("Repeat is activated");
            } else {
                // Add the last song to the Pop playlist
                GenrePlaylist.getInstance().addPopSong(lastNode.getSong());
                //deleting it after it is successfully added 
                deleteLastSong();
            }
        }
        
        case "rock" -> {
            // Check if the playlist is empty
            if (head == null) {
                JOptionPane.showMessageDialog(null, "Liked Songs list is empty!");
                return;
            }
            if (lastNode == null) {
                // Something went wrong, handle error
                JOptionPane.showMessageDialog(null, " Last Node is not found ");
                return;
            }
            if (repeat) {
                JOptionPane.showMessageDialog(null, "Repeat mode is activated");
                System.out.println(" Repeat is activated");
            } else {
                // Add the last song to the Piano playlist
                GenrePlaylist.getInstance().addRockSong(lastNode.getSong());
                //deleting it after it is successfully added 
                deleteLastSong();
            }
        }
        default -> JOptionPane.showMessageDialog(null, " Invalid Genre ");
        }
    }
    
    
    // Method to delete the last song from the liked songs list
    private void deleteLastSong() {
        Node currentNode = head;
        Node previousNode = null;

        // Traverse to the last node
        while (currentNode.getNext() != null) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }

        // Remove the last node
        if (previousNode == null) {
            // If there's only one node in the list
            head = null;
        } else {
            previousNode.setNext(null);
        }
    }

   @Override
public void searchSong(String title, String artist, String album) {
    if (repeat) {
        JOptionPane.showMessageDialog(null, "The repeat mode is deactivated");
        System.out.println("Repeat mode is activated");
        return;
    } else {
        if (head == null) {
            JOptionPane.showMessageDialog(null, "The Liked List is empty");
            return;
        }

        boolean found = false;
        StringBuilder result = new StringBuilder();

        Node current = head;
        do {
            if (current != null && current.getSong() != null) {
                Song currentSong = current.getSong();
                if (currentSong.getTitle().equalsIgnoreCase(title) &&
                    currentSong.getArtist().equalsIgnoreCase(artist) &&
                    currentSong.getAlbum().equalsIgnoreCase(album)) {
                    result.append("Title: ").append(currentSong.getTitle())
                          .append(", Artist: ").append(currentSong.getArtist())
                          .append(", Album: ").append(currentSong.getAlbum())
                          .append("\n");
                    found = true;
                }
                current = current.getNext();
            }
        } while (current != head && current != null);

        if (found) {
            JOptionPane.showMessageDialog(null, "The results: \n" + result.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No songs found matching the criteria");
        }
    }
}

}
