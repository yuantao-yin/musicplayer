package com.hw7;

import java.util.Comparator;

public class Song implements Comparable{
	
	private String songName;
	private String artistName;
	private int length;
	private String fileName;
	private int numPlays;
	
	public Song(String name, String artist, int length, String filename){
		this.songName = name;
		this.artistName = artist;
		this.length = length;
		this.fileName = filename;
	}
	
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public int getNumPlays() {
		return numPlays;
	}
	public void setNumPlays(int numPlays) {
		this.numPlays = numPlays;
	}
	
	public void incrementNumPlays(){
		
	}

	public int compareTo(Object o) {
		Song sg = (Song)o;
		if(this.songName == sg.songName && this.artistName == sg.artistName){
			return 0;
		} else {
			return -1;
		}
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((artistName == null) ? 0 : artistName.hashCode());
		result = prime * result
				+ ((songName == null) ? 0 : songName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		if (artistName == null) {
			if (other.artistName != null)
				return false;
		} else if (!artistName.equals(other.artistName))
			return false;
		if (songName == null) {
			if (other.songName != null)
				return false;
		} else if (!songName.equals(other.songName))
			return false;
		return true;
	}
	


	
	
}
