public class Song {
	// �� �⺻Ư��
	public final String title;
	// �� �⺻Ư�� - �ٸ� ĳ��
	public final Artist artist;
	public final Album album;
	
	// �� ��ų����
	// ��ų1. �� ����
	public Song (String title, Artist artist, Album album) {
		this.title = title;
		this.artist = artist;
		this.album = album;
	}
	
	// ��ų2. �� �����ֱ�
	public String toString() {
		return title + " - " + artist.name + "\n" + album.name + "(" +album.year + ")";
	}
}