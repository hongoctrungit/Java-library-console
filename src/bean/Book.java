package bean;

import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id_Book;
	private String name_Book;
	private String name_Author;
	private String name_Publish;
	private String year_Publishing;
	private boolean status;
	private String value;

	public Book(String id_Book, String name_Book, String name_Author, String name_Publish, String year_Publishing,
			boolean status) {
		super();
		this.id_Book = id_Book;
		this.name_Book = name_Book;
		this.name_Author = name_Author;
		this.name_Publish = name_Publish;
		this.year_Publishing = year_Publishing;
		this.status = status;
	}

	public Book() {
		super();
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getId_Book() {
		return id_Book;
	}

	public void setId_Book(String id_Book) {
		this.id_Book = id_Book;
	}

	public String getName_Book() {
		return name_Book;
	}

	public void setName_Book(String name_Book) {
		this.name_Book = name_Book;
	}

	public String getName_Author() {
		return name_Author;
	}

	public void setName_Author(String name_Author) {
		this.name_Author = name_Author;
	}

	public String getName_Publish() {
		return name_Publish;
	}

	public void setName_Publish(String name_Publish) {
		this.name_Publish = name_Publish;
	}

	public String getYear_Publishing() {
		return year_Publishing;
	}

	public void setYear_Publishing(String year_Publishing) {
		this.year_Publishing = year_Publishing;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}