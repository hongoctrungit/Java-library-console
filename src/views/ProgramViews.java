package views;

import bean.Book;
import bean.DataReturn;

public class ProgramViews {

	public void showInforBook(Book book) {
		System.out.println("Ma so sach: " + book.getId_Book());
		System.out.println("Ten sach: " + book.getName_Book());
		System.out.println("Ten tac gia: " + book.getName_Author());
		System.out.println("Nha xuat ban: " + book.getName_Publish());
		System.out.println("Nam xuat ban: " + book.getYear_Publishing());
		System.out.println("Trang thai: " + book.getStatus());
		System.out.println("------------------------------");
	}

	public void showMenu() {
		System.out.println("------------Menu-------------");
		if (database.Database.arrayList.isEmpty()) {
			System.out.println("1. Khoi tao");
		} else {
			System.out.println("2. Them mot cuon sach vao danh sach");
			System.out.println("3. Xoa mot cuon sach khoi danh sach");
			System.out.println("4. Tim kiem danh sach");
			System.out.println("5. Xem danh sach");
			System.out.println("6. Muon tra sach");
			System.out.println("7. Chinh sua noi dung sach");
			System.out.println("8. Luu file");
		}
		System.out.println("------------end!-------------");
	}

	public void showMenuCreate(int section) {
		switch (section) {
		case 1:
			System.out.println("Khoi tao danh sach");
			break;
		case 2:
			System.out.println("Doc file da luu");
			break;
		}

	}

	public void showMenuAddBook() {
		System.out.println("1. Them vao dau danh sach");
		System.out.println("2. Them vao sau cuon sach");
		System.out.println("3. Them vao cuoi danh sach");
	}

	public void showMenuDeleteBook() {
		System.out.println("1. Xoa theo ma so sach");
		System.out.println("2. Xoa theo ten sach");
		System.out.println("3. Xoa theo ten tac gia");
		System.out.println("4. Xoa theo sau cuon sach co ma so");
		System.out.println("5. Xoa sach o cuoi danh sach");
	}

	public void showMenuSeachBook() {
		System.out.println("1. Tim kiem theo ten sach");
		System.out.println("2. Tim kiem theo ten tac gia");
		System.out.println("3. Tim kiem theo ten nha xuat ban");
	}

	public void showMenuViews() {
		System.out.println("1. Xem toan bo danh muc trong sach");
		System.out.println("2. Xem nhung cuong sach dang cho muon");
		System.out.println("3. Xem nhung cuong sach chua cho muon");
		System.out.println("4. Xem danh sach theo thu tu");
	}

	public void showMenuView1() {

		System.out.println("1. Xem theo van alphabet theo ten sach");
		System.out.println("2. Xem theo van alphabet theo ten tac gia");
		System.out.println("3. Xem theo van alphabet theo ten nha xuat ban");
		System.out.println("4. Sach duoc xuat ban moi nhat");
	}

	public void showMenuBorrow() {
		System.out.println("1. Muon sach");
		System.out.println("2. Tra sach");
	}

	public void showMenuEditBook() {
		System.out.println("1. Chinh sua ma so sach:");
		System.out.println("2. Chinh sua ten sach:");
		System.out.println("3. Chinh sua ten tac gia:");
		System.out.println("4. Chinh sua nha xuat ban:");
		System.out.println("5. Chinh sua nam xuat ban:");
		System.out.println("0. Hoan thanh!");
	}

	public void showMenuInformations(int request) {
		switch (request) {
		case 0:
			System.out.println("Khong ton tai");
			break;
		case 1:
			System.out.println("Nhap so luong sach :");
			break;
		case 2:
			System.out.println("Danh sach trong!");
			break;
		case 3:
			System.out.println("Nhap ten cuon sach :");
			break;
		case 4:
			System.out.println("Ten vua nhap khong trung voi cuon sach nao!");
			break;
		case 5:
			System.out.println("Nhap vao ten tac gia :");
			break;
		case 6:
			System.out.println("Nhap vao ten nha xuat ban :");
			break;
		case 7:
			System.out.println("Nhap vao ma so: ");
			break;
		case 8:
			System.out.println("Danh sach sach chua cho muon");
			break;
		case 9:
			System.out.println("Danh sach sach da cho muon");
			break;
		case 10:
			System.out.println("Nhap nam xuat ban :");
			break;
		case 11:
			System.out.println("Nhap moi :");
			break;
		case 12:
			System.out.println("Nhap ten file :");
			break;
		default:
			break;
		}
	}

	public void showInformation(DataReturn dataReturn) {
		if (dataReturn.getInfomation() == 1) {
			System.out.println("Thanh cong");
		} else {
			System.err.println("That bai!");
		}
	}
}