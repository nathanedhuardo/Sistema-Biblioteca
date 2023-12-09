package SistemadeBiblioteca;
import java.util.Date;

public class Loan {
	
	private int id;
	private int bookId;
	private Date loanDate;
	private Date returnDate;
	
	public Loan() {
	}
	
	public Loan(int bookId, Date loanDate, Date returnDate) {
		this.bookId = bookId;
		this.loanDate = loanDate;
		this.returnDate = returnDate;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.bookId = id;
	}
	
	public int getBookId() {
		return bookId;
	}
	
	public Date getLoanDate() {
		return loanDate;
	}
	
	public void setRoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}
	
	public Date getReturnDate() {
		return returnDate;
	}
	
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	
}
