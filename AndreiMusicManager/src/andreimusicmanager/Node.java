/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andreimusicmanager;

/**
 *
 * @author arets
 */
public class Node {
    
    private Object element;
    private Node next, prev;
    private Song song;

    public Node(Song newSong) {
    this.element = null;
    this.next = null;
    this.prev = null;
    this.song = newSong;

    }

    public Node(Object element, Node next, Node prev, Song song) {
        this.element = element;
        this.next = next;
        this.prev = prev;
        this.song = song;
    }

// Getters and setters for the element, next, prev, and song properties
    
    // Getter and setter for the element property
    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    // Getter and setter for the next property
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    // Getter and setter for the prev property
    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    // Getter and setter for the song property
    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }
  
}