package model;

import java.util.ArrayList;

import bean.DataReturn;
import views.ProgramViews;

public class ModelViews {

	ProgramViews programViews = new ProgramViews();
	DataReturn dataReturn = new DataReturn();

	public DataReturn views(int select) {
		switch (select) {
		case 1:
			// xem toan bo danh muc
			forOut(database.Database.arrayList);
			dataReturn.setInfomation(1);
			break;
		case 2:
			// xem nhung cuong sach dang cho muon
			programViews.showMenuInformations(9);
			for (int i = 0; i < database.Database.arrayList.size(); i++) {
				if (database.Database.arrayList.get(i).getStatus() != true) {
					programViews.showInforBook(database.Database.arrayList.get(i));
				}
			}
			dataReturn.setInfomation(1);
			break;
		case 3:
			// xem nhung cuon sach chua cho muon
			programViews.showMenuInformations(8);
			for (int i = 0; i < database.Database.arrayList.size(); i++) {
				if (database.Database.arrayList.get(i).getStatus() == true) {
					programViews.showInforBook(database.Database.arrayList.get(i));
				}
			}
			dataReturn.setInfomation(1);
			break;
		case 4:
			// xem danh sach theo thu tu
			programViews.showMenuView1();
			int select1 = database.InputData.inputInt();
			views1(select1);
			dataReturn.setInfomation(1);
		default:
			break;
		}
		return dataReturn;
	}

	public void forOut(ArrayList<bean.Book> book) {
		if (book.isEmpty()) {
			programViews.showMenuInformations(2);
		} else {
			for (int i = 0; i < book.size(); i++) {
				programViews.showInforBook(book.get(i));
			}
		}
	}

	public void views1(int select) {
		ModelCommon modelCommon = new ModelCommon();
		switch (select) {
		case 1:
			// xem theo van alphabet ten sach
			ArrayList<bean.Book> book = modelCommon.sort(database.Database.arrayList, "name");
			forOut(book);
			break;
		case 2:
			// xem theo van alphabet ten tac gia
			ArrayList<bean.Book> book1 = modelCommon.sort(database.Database.arrayList, "author");
			forOut(book1);
			break;
		case 3:
			// xem theo van alphabet ten nha xuat ban
			ArrayList<bean.Book> book2 = modelCommon.sort(database.Database.arrayList, "publisher");
			forOut(book2);
			break;
		case 4:
			// xem theo thu tu xuat ban gan nhat
			ArrayList<bean.Book> book3 = modelCommon.sort(database.Database.arrayList, "year");
			forOut(book3);
			break;
		default:
			break;
		}
	}
}