import java.util.ArrayList;

public class Album {
    // 앨범 기본속성 설정
	Artist artist;
	String name;
	int year;
	private final ArrayList<Song> songlist = new ArrayList<>();
	
	// 앨범 스킬생성
	// 스킬1. 앨범 창조
	public Album (String name, int year, Artist artist) {
		this.name = name;
		this.year = year;
		this.artist = artist;
	}
	
	// 스킬2. 송 추가
	void addTrack(Song song) {
		songlist.add(song);
	}
	
	// 스킬3. 송 고르기
	public Song getTrack(int i) {
		if (i < 1 || i > songlist.size()) {
			return null;
		}
		return songlist.get(i - 1);
	}
}