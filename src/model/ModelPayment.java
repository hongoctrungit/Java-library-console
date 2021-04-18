package model;

import bean.DataReturn;
import views.ProgramViews;

public class ModelPayment {
	public DataReturn payment(int section) {
		ProgramViews programViews = new ProgramViews();
		DataReturn dataReturn = new DataReturn();
		switch (section) {
		case 1:
			// hien thi danh sach, xong cho chon 1 cuon theo ten sach
			new ModelViews().views(3);
			programViews.showMenuInformations(3);
			String nameBookPayment = database.InputData.inputString();
			int payName = new ModelCommon().seach(database.Database.arrayList, "name", nameBookPayment);
			if(payName != -1) {
				database.Database.arrayList.get(payName).setStatus(false);
				dataReturn.setInfomation(1);
			}
			break;
		case 2:
			// nhap ma so sach can tra
			programViews.showMenuInformations(7);
			String idPayment = database.InputData.inputString();
			int IDPay = new ModelCommon().seach(database.Database.arrayList, "id", idPayment);
			if(IDPay != -1) {
				database.Database.arrayList.get(IDPay).setStatus(true);
				dataReturn.setInfomation(1);
			}
			break;
		default:
			break;
		}
		return dataReturn;
	}
}