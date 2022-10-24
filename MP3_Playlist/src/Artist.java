import java.util.ArrayList;

public class Artist {
	// 아티스트 기본속성 설정
	public final String name;
	private final ArrayList<Album> albumlist = new ArrayList<>();
	
	// 아티스트 스킬 생성
	// 스킬1. 아티스트 창조
	public Artist(String name) {
		this.name = name;
	}
	
	// 스킬2. 앨범 추가
	public void addAlbum(Album album) {
		albumlist.add(album);
	}
	
	// 스킬3. 앨범 고르기
	public ArrayList<Album> getAlbums() {
		return albumlist;
	}
}