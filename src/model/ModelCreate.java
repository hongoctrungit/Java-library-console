package model;

import java.io.IOException;

import bean.DataReturn;
import views.ProgramViews;

public class ModelCreate {
	public DataReturn create() throws IOException {
		
		ProgramViews programViews = new ProgramViews();
		DataReturn dataReturn = new DataReturn();
		
		programViews.showMenuInformations(12);
		
		String fileName = database.InputData.inputString();
		dataReturn = new ModelInputOutputStream().readFile(database.Database.arrayList, fileName);
		return dataReturn;
	}
}