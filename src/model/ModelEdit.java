package model;

import bean.DataReturn;
import views.ProgramViews;

public class ModelEdit {
	public DataReturn edit(int section) {
		DataReturn dataReturn = new DataReturn();
		ProgramViews programViews = new ProgramViews();
		ModelCommon modelCommon = new ModelCommon();
		switch (section) {
		case 1:
			programViews.showMenuInformations(7);
			String id = database.InputData.inputString();
			int indexID = new ModelCommon().seach(database.Database.arrayList, "id", id);
			modelCommon.edit(database.Database.arrayList, "id", id, indexID);
			break;
		case 2:
			programViews.showMenuInformations(3);
			String name = database.InputData.inputString();
			int indexName = new ModelCommon().seach(database.Database.arrayList, "name",  name);
			modelCommon.edit(database.Database.arrayList, "name", name, indexName);
			break;
		case 3:
			programViews.showMenuInformations(5);
			String author = database.InputData.inputString();
			int indexAuthor = new ModelCommon().seach(database.Database.arrayList, "author",  author);
			modelCommon.edit(database.Database.arrayList, "author", author, indexAuthor);
			break;
		case 4:
			programViews.showMenuInformations(6);
			String publisher = database.InputData.inputString();
			int indexPublisher = new ModelCommon().seach(database.Database.arrayList, "publisher", publisher);
			modelCommon.edit(database.Database.arrayList, "publisher", publisher, indexPublisher);
			break;
		case 5:
			programViews.showMenuInformations(10);
			String year = database.InputData.inputString();
			int indexYear = new ModelCommon().seach(database.Database.arrayList, "year", year);
			modelCommon.edit(database.Database.arrayList, "year", year, indexYear);
			break;
		default:
			break;
		}
		return dataReturn;
	}
}