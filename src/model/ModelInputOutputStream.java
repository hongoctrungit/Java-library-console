package model;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import bean.Book;
import bean.DataReturn;
import bean.IntBook;
import views.ProgramViews;

public class ModelInputOutputStream {

	DataReturn dataReturn = new DataReturn();

	public DataReturn writefile(ArrayList<bean.Book> book, String filename) {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(filename);
			for (bean.Book book1 : book) {
				String status = "false";
				if (book1.getStatus() == true) {
					status = "true";
				}
				fileWriter.write(book1.getId_Book() + ", " + book1.getName_Book() + ", " + book1.getName_Author() + ", "
						+ book1.getName_Publish() + ", " + book1.getYear_Publishing() + ", " + status + '\n');
				dataReturn.setInfomation(1);
			}
		} catch (IOException e) {

		} finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
				}
			}
		}
		return dataReturn;
	}

	public DataReturn readFile(ArrayList<Book> book, String fileName) {
		try {
			FileReader fileReader = null;
			fileReader = new FileReader(fileName);
			Scanner scan = new Scanner(fileReader);
			while (scan.hasNextLine()) {
				String data = scan.nextLine();
				String[] stringSplit = data.split(",");
				if (stringSplit.length == 6) {
					String id_Book = stringSplit[0];
					String name_Book = stringSplit[1];
					String name_Author = stringSplit[2];
					String name_Publish = stringSplit[3];
					String year_Publishing = stringSplit[4];
					String statusCheck = stringSplit[5];
					boolean status = false;
					if (statusCheck.toLowerCase() == "true") {
						status = true;
					}
					book.add(new Book(id_Book, name_Book, name_Author, name_Publish, year_Publishing, status));
					dataReturn.setInfomation(1);
				}
			}
			scan.close();
			fileReader.close();
		} catch (Exception e) {
			new ProgramViews().showMenuInformations(0);
			new ProgramViews().showMenuCreate(1);
			new ProgramViews().showMenuInformations(1);
			int number = database.InputData.inputInt();
			for (int i = 0; i < number; i++) {
				IntBook intBook = new IntBook();
				intBook.setBook();
				database.Database.arrayList.add(intBook.getBook());
				dataReturn.setInfomation(1);
			}
		}
		return dataReturn;
	}
}