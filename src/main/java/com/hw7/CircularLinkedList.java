//package com.hw7;
//
//import java.util.Collection;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.ListIterator;
//import java.util.Scanner;    
//

//   public  class CircularLinkedList<E> implements List<E>
//   {  private static class Node
//      {  private Node       next = null;
//         private Song song;
//
//         private Node(Song song)
//         {  this.song = song;  }
//
//         private Node(Song song, Node next)
//         {  this.song = song;  this.next = next;  }
//      } // end class Node
//
////    NOTE:  NOT a head pointer.  That's tail.next, and so not needed.
//      private Node tail = null;
//      private int  size = 0;
//
//      public int size()  {  return size;  }
//
//      public void addFirst ( Song song )
//      {  Node  newNode = new Node(song);
//
//         if ( tail == null )      // empty list
//            tail = newNode;
//         else
//            newNode.next = tail.next;
//         tail.next = newNode;     // however we got here
//         size++;
//      }
//
//      public void addLast ( Song song )
//      {  if ( tail == null )      // empty list
//            addFirst ( song );    // use existing code
//         else
//         {  Node newNode = new Node(song, tail.next);
//
//            tail = tail.next = newNode;
//            size++;
//         }
//      }
//
//      // Remove FIRST instance of the song, using Object.equals(Object)
//      public boolean remove (Song song )
//      {  
//    	  Node current = tail, prev;
//
//         if ( current == null )
//            return false;         // Fail on removal from an empty list
//
//         do                       // Bottom driven for termination
//         {
//            prev = current;       // Keep track of predecessor
//            current = current.next;
//            if ( song.equals(current.song) )
//               break;
//         }  while ( current != tail );
//         // Note that we have TWO ways to get here
//         // Object inequality is faster than invoking the equals method
//         if ( current != tail || song.equals(current.song) )
//         {
//            if ( prev == current )// I.e., one-element list
//               tail = null;
//            else
//            {
//               prev.next = current.next;
//               if ( current == tail )// the tail itself is gone
//                  tail = prev;
//            }
//            size--;
//            return true;
//         }
//         return false;
//      } // end void remove
//
//      public void listFwd()
//      {  StringBuilder text = new StringBuilder("[");
//
//         System.out.println("\nForward listing (" +
//            size + " entries)");
//         if ( tail != null )
//         {  Node curr = tail.next;     // First is outside loop
//
//            text.append(curr.song.getSongName());
//            if (curr != tail)
//               do    // Note bottom-driven loop
//               {
//                  curr = curr.next;       // NOTE:  advance before use
//                  text.append(", " + curr.song.getSongName());
//               }  while ( curr != tail ); // Note:  OBJECT equality
//         }
//         text.append("]");
//         System.out.println (text);
//      } // end void listFwd
//
//      // Algorithm:  StringBuilder.insert(int offset, String str)
//      //             allows reversing the string if offset = 1 (the '[')
//      public void listRvs()
//      {  StringBuilder text = new StringBuilder("[");
//
//         System.out.println("\nReversed listing (" +
//            size + " entries)");
//         if ( tail != null )
//         {  Node curr = tail.next;     // First is outside loop
//
//            text.append(curr.song.toString());
//
//            if (curr != tail)
//               do    // Note bottom-driven loop
//               {  curr = curr.next;       // NOTE:  advance before use
//                  text.insert(1, curr.song.toString()+", ");
//               }  while ( curr != tail ); // Note:  OBJECT equality
//         }
//         text.append("]");
//         System.out.println (text);
//      } // end void listRvs
//      
//      public static void main ( String[] args )
//      {  
//
//    	  CircularLinkedList list = new CircularLinkedList();
//
//         Song s1 = new Song("song1name","title1",2,"songfile");
//         list.addLast (s1);
//         list.addLast (new Song("song2name","title2",2,"song2file"));
//         list.addLast (new Song("song3name","title3",2,"song3file"));
//         list.addLast (new Song("song4name","title4",2,"song4file"));
//         list.listFwd();
////         list.listRvs();
//         System.out.println(list.tail.next.song.getSongName());
//
//         list.remove(s1);
//         System.out.println(list.tail.next.song.getSongName());
//         
//         System.out.println("\nEnter strings to remove, end with empty.");
//         
//         LinkedList test1 = new LinkedList();
//         test1.add("a");
//         test1.add("d");
//         test1.add("b");
//         
//
//      }
//
//	public boolean add(Object arg0) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	public void add(int arg0, Object arg1) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public boolean addAll(Collection arg0) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	public boolean addAll(int arg0, Collection arg1) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	public void clear() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public boolean contains(Object arg0) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	public boolean containsAll(Collection arg0) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	public E get(int arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public int indexOf(Object arg0) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	public boolean isEmpty() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	public Iterator iterator() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public int lastIndexOf(Object arg0) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	public ListIterator listIterator() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public ListIterator listIterator(int arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public boolean remove(Object arg0) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	public E remove(int arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public boolean removeAll(Collection arg0) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	public boolean retainAll(Collection arg0) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	public Object set(int arg0, Object arg1) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public List subList(int arg0, int arg1) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public Object[] toArray() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public Object[] toArray(Object[] arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	} 
//   } 
//
//
//
