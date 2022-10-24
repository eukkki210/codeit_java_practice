import java.util.ArrayList;

public class Album {
    // �ٹ� �⺻�Ӽ� ����
	Artist artist;
	String name;
	int year;
	private final ArrayList<Song> songlist = new ArrayList<>();
	
	// �ٹ� ��ų����
	// ��ų1. �ٹ� â��
	public Album (String name, int year, Artist artist) {
		this.name = name;
		this.year = year;
		this.artist = artist;
	}
	
	// ��ų2. �� �߰�
	void addTrack(Song song) {
		songlist.add(song);
	}
	
	// ��ų3. �� ����
	public Song getTrack(int i) {
		if (i < 1 || i > songlist.size()) {
			return null;
		}
		return songlist.get(i - 1);
	}
}