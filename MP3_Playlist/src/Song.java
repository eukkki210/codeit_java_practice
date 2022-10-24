public class Song {
	// 송 기본특성
	public final String title;
	// 송 기본특성 - 다른 캐릭
	public final Artist artist;
	public final Album album;
	
	// 송 스킬생성
	// 스킬1. 송 참조
	public Song (String title, Artist artist, Album album) {
		this.title = title;
		this.artist = artist;
		this.album = album;
	}
	
	// 스킬2. 송 보여주기
	public String toString() {
		return title + " - " + artist.name + "\n" + album.name + "(" +album.year + ")";
	}
}