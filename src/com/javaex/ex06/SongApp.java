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

public class SongApp {

	public static void main(String[] args) {

		/*Song iu = new Song();
		Song bigbank = new Song();
		Song bskbsk = new Song();

		iu.setArtist("아이유");
		iu.setTitle("좋은날");
		iu.setAlbum("Real");
		iu.setYear(2010);
		iu.setTrack(3);
		iu.setComposer("이수만");

		bigbank.setArtist("BIGBANK");
		bigbank.setTitle("거짓말");
		bigbank.setAlbum("Always");
		bigbank.setYear(2007);
		bigbank.setTrack(2);
		bigbank.setComposer("G-DRAGON");

		bskbsk.setArtist("버스커버스커");
		bskbsk.setTitle("벚꽃엔딩");
		bskbsk.setAlbum("버스커버스커1집");
		bskbsk.setYear(2012);
		bskbsk.setTrack(4);
		bskbsk.setComposer("장범준");*/
		
		Song iu = new Song("아이유", "좋은날", "Real", "이수만", 2010, 3);
		Song bigbank = new Song("BIGBANK", "거짓말", "Always", "G-DRAGON", 2007, 2);
		Song bskbsk = new Song("버스커버스커", "벚꽃엔딩", "버스커버스커1집", "장범준", 2012, 4);

		iu.showInfo();
		bigbank.showInfo();
		bskbsk.showInfo();

	}

}
