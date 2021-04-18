package main;

import

java.io.IOException;

import bean.DataReturn;
import controller.ProgramController;
import views.ProgramViews;

public class Main {

	public static void main(String[] args) throws IOException {
		ProgramViews programViews = new ProgramViews();
		while (true) {
			programViews.showMenu();
			int section = database.InputData.inputInt();
			DataReturn dataReturn = ProgramController.controller(section);
			programViews.showInformation(dataReturn);
		}
	}
}