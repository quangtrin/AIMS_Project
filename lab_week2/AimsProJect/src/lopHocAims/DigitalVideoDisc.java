package lopHocAims;

public class DigitalVideoDisc {
	private static int nbDigitalVideoDiscs = 0;
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private int id;
	
	public DigitalVideoDisc() {
		this.id = DigitalVideoDisc.nbDigitalVideoDiscs;
		DigitalVideoDisc.nbDigitalVideoDiscs++;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		
		
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		this();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title) {
		
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void setAll(String tittle, String category, String director, int length, float cost) {
		this.title = tittle;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
	public String toString() {
		return this.id +". DVD - "+ this.title + " - " + this.category + " - " + this.director + " - " + this.length + ": " + this.cost + "$";
	}
	
}
