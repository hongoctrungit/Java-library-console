package model;

import bean.DataReturn;
import views.ProgramViews;

public class ModelDelete {
	public DataReturn delete(int section) {
		ProgramViews programViews = new ProgramViews();
		DataReturn dataReturn = new DataReturn();
		switch (section) {
		case 1:
			// ma so
			programViews.showMenuInformations(7);
			String id = database.InputData.inputString();
			int resId = new ModelCommon().seach(database.Database.arrayList, "id", id);
			if (resId != -1) {
				database.Database.arrayList.remove(resId);
				dataReturn.setInfomation(1);
			}
			break;
		case 2:
			// ten sach
			programViews.showMenuInformations(3);
			String name = database.InputData.inputString();
			int resName = new ModelCommon().seach(database.Database.arrayList, "name", name);
			if (resName != -1) {
				database.Database.arrayList.remove(resName);
				dataReturn.setInfomation(1);
			}
			break;
		case 3:
			// ten tac gia
			programViews.showMenuInformations(5);
			String author = database.InputData.inputString();
			int resAuthor = new ModelCommon().seach(database.Database.arrayList, "author", author);
			if (resAuthor != -1) {
				database.Database.arrayList.remove(resAuthor);
				dataReturn.setInfomation(1);
			}
			break;
		case 4:
			// cuon sach dau danh sach
			database.Database.arrayList.remove(0);
			dataReturn.setInfomation(1);
			break;
		case 5:
			// cuon sach sau cuon sach
			programViews.showMenuInformations(3);
			String name1 = database.InputData.inputString();
			int resName1 = new ModelCommon().seach(database.Database.arrayList, "name", name1);
			if (resName1 != -1) {
				database.Database.arrayList.remove(resName1);
				dataReturn.setInfomation(1);
			}
			break;
		case 6:
			// cuon sach cuoi danh sach
			int index = database.Database.arrayList.size();
			database.Database.arrayList.remove(index - 1);
			dataReturn.setInfomation(1);
			break;
		default:
			break;
		}
		return dataReturn;
	}
}