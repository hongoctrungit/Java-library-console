package model;

import java.util.ArrayList;

import bean.DataReturn;
import views.ProgramViews;

public class ModelSeach {
	public DataReturn seach(int select) {
		ProgramViews programViews = new ProgramViews();
		DataReturn dataReturn = new DataReturn();
		switch (select) {
		case 1:
			// tim kiem theo ten sach
			programViews.showMenuInformations(3);
			String nameBook = database.InputData.inputString();
			ArrayList<Integer> indName = new ModelCommon().seachAll(database.Database.arrayList, "name", nameBook);
			if (!indName.isEmpty()) {
				for (int i = 0; i < indName.size(); i++) {
					programViews.showInforBook(database.Database.arrayList.get(indName.get(i)));
				}
				dataReturn.setInfomation(1);
			}
			break;
		case 2:
			// tim kiem theo ten tac gia
			programViews.showMenuInformations(5);
			String nAuthor = database.InputData.inputString();
			ArrayList<Integer> indAuthor = new ModelCommon().seachAll(database.Database.arrayList, "author", nAuthor);
			if (!indAuthor.isEmpty()) {
				for (int i = 0; i < indAuthor.size(); i++) {
					programViews.showInforBook(database.Database.arrayList.get(indAuthor.get(i)));
				}
				dataReturn.setInfomation(1);
			}
			break;
		case 3:
			// tim kiem theo ten nha xuat ban
			programViews.showMenuInformations(6);
			String nPublisher = database.InputData.inputString();
			ArrayList<Integer> indPl = new ModelCommon().seachAll(database.Database.arrayList, "publisher", nPublisher);
			if (!indPl.isEmpty()) {
				for (int i = 0; i < indPl.size(); i++) {
					programViews.showInforBook(database.Database.arrayList.get(indPl.get(i)));
				}
				dataReturn.setInfomation(1);
			}
			break;
		default:
			break;
		}
		return dataReturn;
	}
}