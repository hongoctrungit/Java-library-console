package bean;

public class IntBook {
	Book book = new Book();

	public void setBook() {
		System.out.println("Nhap ma so: ");
		book.setId_Book(database.InputData.inputString());
		System.out.println("Nhap ten sach: ");
		book.setName_Book(database.InputData.inputString());
		System.out.println("Nhap ten tac gia: ");
		book.setName_Author(database.InputData.inputString());
		System.out.println("Nhap ten nha xuat ban: ");
		book.setName_Publish(database.InputData.inputString());
		System.out.println("Nhap nam xuat ban: ");
		book.setYear_Publishing(database.InputData.inputString());
		book.setStatus(true);
	}

	public Book getBook() {
		return this.book;
	}
}