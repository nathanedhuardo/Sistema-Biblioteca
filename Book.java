package SistemadeBiblioteca;

public class Book {
    private int id;
    private String title;
    private String author;
    private int yearPublication;
    private String genre;
    private boolean available; 
	
    public Book(int id, String title, String author, int yearPublication, String genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
        this.genre = genre;
        this.available = true; 
    }
	
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getYearPublication() {
		return yearPublication;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setYearPublication(int yearPublication) {
		this.yearPublication = yearPublication;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
