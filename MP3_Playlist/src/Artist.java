import java.util.ArrayList;

public class Artist {
	// ��Ƽ��Ʈ �⺻�Ӽ� ����
	public final String name;
	private final ArrayList<Album> albumlist = new ArrayList<>();
	
	// ��Ƽ��Ʈ ��ų ����
	// ��ų1. ��Ƽ��Ʈ â��
	public Artist(String name) {
		this.name = name;
	}
	
	// ��ų2. �ٹ� �߰�
	public void addAlbum(Album album) {
		albumlist.add(album);
	}
	
	// ��ų3. �ٹ� ����
	public ArrayList<Album> getAlbums() {
		return albumlist;
	}
}