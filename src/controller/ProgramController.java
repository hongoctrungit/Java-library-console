package controller;

import java.io.IOException;

import bean.DataReturn;
import model.ModelAdd;
import model.ModelCreate;
import model.ModelDelete;
import model.ModelEdit;
import model.ModelInputOutputStream;
import model.ModelPayment;
import model.ModelSeach;
import model.ModelViews;
import views.ProgramViews;

public class ProgramController {
	public static DataReturn controller(int section) throws IOException {
		ProgramViews programViews = new ProgramViews();
		DataReturn dataReturn = new DataReturn();
		switch (section) {
		case 1:
			new ProgramViews().showMenuCreate(2);
			dataReturn = new ModelCreate().create();
			break;
		case 2:
			programViews.showMenuAddBook();
			int add = database.InputData.inputInt();
			dataReturn = new ModelAdd().add(add);
			break;
		case 3:
			programViews.showMenuDeleteBook();
			int delete = database.InputData.inputInt();
			dataReturn = new ModelDelete().delete(delete);
			break;
		case 4:
			programViews.showMenuSeachBook();
			int seach = database.InputData.inputInt();
			dataReturn = new ModelSeach().seach(seach);
			break;
		case 5:
			programViews.showMenuViews();
			int view = database.InputData.inputInt();
			dataReturn = new ModelViews().views(view);
			break;
		case 6:
			programViews.showMenuBorrow();
			int payment = database.InputData.inputInt();
			dataReturn = new ModelPayment().payment(payment);
			break;
		case 7:
			int edit;
			do {
				programViews.showMenuEditBook();
				edit = database.InputData.inputInt();
				dataReturn = new ModelEdit().edit(edit);
			} while (edit != 0);
			break;
		case 8:
			programViews.showMenuInformations(12);
			String nameFile = database.InputData.inputString();
			dataReturn = new ModelInputOutputStream().writefile(database.Database.arrayList, nameFile);
			break;
		default:
			programViews.showMenuInformations(0);
			break;
		}
		return dataReturn;
	}
}