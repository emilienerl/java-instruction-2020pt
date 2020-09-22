
public class Album extends Product {

	// fields
	private String artistName;

// constructors
	public Album() {
		super();
		artistName = "";
		count++;
	}

//getter and setters
	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	@Override
	public String toString() {
		return super.toString() + " (" + artistName + ")";
	}
}
