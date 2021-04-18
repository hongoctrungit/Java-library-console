package model;

import bean.DataReturn;
import bean.IntBook;
import views.ProgramViews;

public class ModelAdd {
	public DataReturn add(int section) {
		IntBook intBook = new IntBook();
		DataReturn dataReturn = new DataReturn();
		switch (section) {
		case 1:
			// them vao dau danh sach
			intBook.setBook();
			database.Database.arrayList.add(0, intBook.getBook());
			dataReturn.setInfomation(1);
			break;
		case 2:
			new ProgramViews().showMenuInformations(3);
			String nameAdd = database.InputData.inputString();
			int index = new ModelCommon().seach(database.Database.arrayList, "name", nameAdd);
			if (index == -1) {
				new ProgramViews().showMenuInformations(4);
			} else {
				intBook.setBook();
				database.Database.arrayList.add(index + 1, intBook.getBook());
				dataReturn.setInfomation(1);
			}
			break;
		case 3:
			// them vao cuoi danh sach
			intBook.setBook();
			database.Database.arrayList.add(database.Database.arrayList.size(), intBook.getBook());
			dataReturn.setInfomation(1);
			break;
		default:
			break;
		}
		return dataReturn;
	}
}