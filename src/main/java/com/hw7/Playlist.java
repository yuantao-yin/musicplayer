package com.hw7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class Playlist {

	private LinkedList<Song> list;
	private Song nextSong = null;
	private String playlistName;
	
	public Playlist(String name){
		this.playlistName = name;
		list = new LinkedList<Song>();
	}
	
	public void setPlaylistName(String name){
		playlistName = name;
	}

	
	public void addSong(Song s){
		if(nextSong == null){
			nextSong = s;
		}
		list.add(s);
	}
	
	public void removeSong(Song s){
		//TODO: try to use getSong(name, artist) method based on requirement
		//If this song is the next song in the list, the song following the song to be removed should be set to the next song.
		if(list.size() >= 2 && s.equals(nextSong)){
			int newNextSongIndex = list.lastIndexOf(s) + 1;
			if(list.get(newNextSongIndex)!= null){
				nextSong = list.get(newNextSongIndex);
			} else {
				nextSong = list.get(1);
			}
		}
		list.remove(s);
		
	}
	
	public Song getSong(String name, String artist) throws NotFoundException{
		Song temp = null;
		for( Song song : list){
			if(song.getSongName().equals(name) && song.getArtistName().equals(artist)){
				temp = song;
			}
		}
		if(temp == null){
			throw new NotFoundException();
		}
		return temp;
	}
	
	public Song getNextSong(){
		return nextSong;
	}
	
	public void setNextSong(Song s){
		// what we can return here? I change Song to void.
		nextSong = s;
	}

	public void sortBySongName(){
		Collections.sort(list, new NameComparator());
	}
	
	public void sortBySongArtist(){
		Collections.sort(list, new ArtistComparator());
	}
	
	public void sortBySongPlays(){
		//TODO
		
	}
	
	public void sortBySongLength(){
		//TODO
	}
	
	public String getPlaylistName(){
		return playlistName;
	}
	
	public class NameComparator implements Comparator<Song> {
        public int compare(Song s1, Song s2) {
            return (s1.getSongName().compareTo(s2.getSongName()));
        }
	}
	
	public class ArtistComparator implements Comparator<Song> {
        public int compare(Song s1, Song s2) {
            return (s1.getArtistName().compareTo(s2.getArtistName()));
        }
	}
	
	public static void main ( String[] args )
    {
		Playlist pl = new Playlist("PlayList1");
		Song s1 = new Song("song1name","title1",2,"song2file");
		
		Song s3 = new Song("song3name","title3",2,"song2file");
		Song s2 = new Song("song2name","title2",2,"song2file");
		
		pl.addSong(s1);
		pl.addSong(s2);
		pl.addSong(s3);
		System.out.println(pl.nextSong.getSongName());
		System.out.println(pl.getNextSong().getSongName());
		pl.sortBySongName();
		
    }

}
