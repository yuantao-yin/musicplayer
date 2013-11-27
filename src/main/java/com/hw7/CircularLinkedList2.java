package com.hw7;

import java.util.*;
/*************************************************************
 *  Code for a circular linked list. 
 *  No Remove Methods.
 *
 *************************************************************/

public class CircularLinkedList2 {

   // the header in the circular linked list
   private SongLinkedList start;

   // helper linked-list data type
   private class SongLinkedList {
       private Song song;
       private SongLinkedList next;

       public SongLinkedList(Song s) {
           this.song = s;
           this.next = null;
       }
   }

   // create an empty quote
   public CircularLinkedList2() {
       start = null;
   }
  
   // add a song to the list
   public void addSong(Song s) {
       SongLinkedList newSong = new SongLinkedList(s);

       // degenerate case for empty Quote
       if (start == null) {
         start = newSong;
         start.next = start;
       }

       // otherwise
       else {

           // find the current last song
           SongLinkedList SongLinkedList = start;
           do {
              SongLinkedList = SongLinkedList.next;
           } while (SongLinkedList.next != start);

           // insert new song
           newSong.next = start;
           SongLinkedList.next = newSong;
       }
   }
   
   //remove a song from list
   public void removeSong(Song s) {
	   
   }
  
   // number of songs
   public int count() {

       // empty quote
       if (start == null) return 0;

       SongLinkedList SongLinkedList = start;
       int total = 0;
       do {
           total++;
           SongLinkedList = SongLinkedList.next;
       } while (SongLinkedList != start);
       return total;
   }
  
  
   // show the linked list   
   public String toString() {
       String s = "";
       if (start == null) return s;

       SongLinkedList SongLinkedList = start;
       do {
           s = s + SongLinkedList.song.getSongName() + " ";
           SongLinkedList = SongLinkedList.next;
       } while (SongLinkedList != start);
       return s;
   }
          
   // test client   
   public static void main(String[] args) { 
	   CircularLinkedList2 q = new CircularLinkedList2();
       q.addSong(new Song("song1name","title",2,"songfile"));
       q.addSong(new Song("song2name","title2",2,"song2file"));
       q.addSong(new Song("song3name","title3",2,"song3file"));

       System.out.println(q);
       System.out.println(q.count());

       System.out.println(q.start.next.next.next.song.getSongName());
       
   }
}
