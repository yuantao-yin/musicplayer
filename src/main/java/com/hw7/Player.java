package com.hw7;

import java.util.ArrayList;

public class Player {

	private ArrayList<Playlist> plist;
	private Playlist currentPlaylist;
	private Song currentSong;
	
	public void addPlaylist(Playlist list){
		plist.add(list);
		if(currentPlaylist == null){
			currentPlaylist = list;
		}
	}
	
	public void removePlaylist(Playlist list){
		
	}
	
	public Playlist getCurrentPlaylist(){
		
		return null;
	}
	
	public Playlist getPlaylistByName(String name) throws NotFoundException{
		
		return null;
	}
	
	public void setCurrentPlaylist(Playlist list){
		this.currentPlaylist = list;
	}
	
	public Song getCurrentSong(){
		return currentSong;
	}
	
}
