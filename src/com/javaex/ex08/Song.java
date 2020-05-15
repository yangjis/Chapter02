package com.javaex.ex08;

public class Song {
	
	private String artist;
	private String title;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public Song(String artist, String title, String album, String composer, int year) {
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.composer = composer;
		this.year = year;
	}
	
	public Song(String artist, String title, String album, String composer, int year, int track) {
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	@Override
	public String toString() {
		return "Song [artist=" + artist + ", title=" + title + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
}
