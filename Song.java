package playList;

public class Song {
	private String name;
	private double duration;
	
	public Song(String name, double duration) {
		this.name = name;
		this.duration = duration;
	}
	
	public String getTitle() {
		return name;
	}

	@Override
	public String toString() {
		return this.name + ": " + this.duration;
	}
	
	
}
