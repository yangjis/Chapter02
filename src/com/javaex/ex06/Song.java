package com.javaex.ex06;

/*Song 클래스를 만드세요 Song 클래스는 다음과 같은 필드를 가지고 있습니다.
노래의 제목을 나타내는 title
가수를 나타내는 artist
노래가 속한 앨범 제목을 나타내는 album
노래의 작곡가를 나타내는 composer
노래가 발표된 연도를 나타내는 year
노래가 속한 앨범에서 트랙 번호를 나타내는 track
1)필드의 접근을 제한하고 getter/setter 메소드를 통해 접근하세요.
2)노래정보를 출력하는 showInfo()메소드를 작성하세요.*/



/*2.생성자를 사용해보자.*/


public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public Song(String title, String artist, String album, String composer, int year, int track) {
	  this.title = title;
	  this.artist = artist;
	  this.album = album;
	  this.composer = composer;
	  this.year = year;
	  this.track = track;
	}
	
	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getArtist() {
		return artist;
	}



	public void setArtist(String artist) {
		this.artist = artist;
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



	public void showInfo() {
		System.out.println(artist + ", " + title + "(" + album + ", " + year + ", " + track + "번 track, " + composer + " 작곡)");
	}
	
	
}
