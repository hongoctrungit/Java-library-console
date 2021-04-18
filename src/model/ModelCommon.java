package model;

import java.util.ArrayList;

import bean.DataReturn;
import database.Database;

public class ModelCommon {

	public ArrayList<bean.Book> sort(ArrayList<bean.Book> book, String type) {
		for (int i = 0; i < book.size() - 1; i++) {
			for (int j = i + 1; j < book.size(); j++) {
				switch (type) {
				case "name":
					if (book.get(i).getName_Book().compareTo(book.get(j).getName_Book()) > 0) {
						swap(book, i, j);
					}
					break;
				case "author":
					if (book.get(i).getName_Author().compareTo(book.get(j).getName_Author()) > 0) {
						swap(book, i, j);
					}
					break;
				case "publisher":
					if (book.get(i).getName_Publish().compareTo(book.get(j).getName_Publish()) > 0) {
						swap(book, i, j);
					}
					break;
				case "year":
					if (book.get(i).getYear_Publishing().compareTo(book.get(j).getYear_Publishing()) < 0) {
						swap(book, i, j);
					}
					break;
				}
			}
		}
		return book;
	}

	public void swap(ArrayList<bean.Book> book, int i, int j) {
		bean.Book temp = book.get(i);
		book.set(i, book.get(j));
		book.set(j, temp);
	}

	public void edit(ArrayList<bean.Book> book, String type, String value, int index) {
		DataReturn dataReturn = new DataReturn();
		if (index != -1) {
			switch (type) {
			case "id":
				book.get(index).setId_Book(value);
				break;
			case "name":
				book.get(index).setName_Author(value);
				break;
			case "author":
				book.get(index).setName_Author(value);
				break;
			case "publisher":
				book.get(index).setName_Publish(value);
				break;
			case "year":
				book.get(index).setYear_Publishing(value);
				break;
			}
			dataReturn.setInfomation(1);
		}
	}

	public int seach(ArrayList<bean.Book> book, String type, String value) {
		int indexReturn = -1;
		for (int i = 0; i < book.size(); i++) {
			switch (type) {
			case "id":
				book.get(i).setValue(book.get(i).getId_Book());
				break;
			case "name":
				book.get(i).setValue(book.get(i).getName_Book());
				break;
			case "author":
				book.get(i).setValue(book.get(i).getName_Author());
				break;
			case "publisher":
				book.get(i).setValue(book.get(i).getName_Publish());
				break;
			case "year":
				book.get(i).setValue(book.get(i).getYear_Publishing());
				break;
			default:
				break;
			}
			if (book.get(i).getValue().equals(value)) {
				indexReturn = i;
				break;
			}
		}
		return indexReturn;
	}

	public ArrayList<Integer> seachAll(ArrayList<bean.Book> book, String type, String value) {
		ArrayList<Integer> arrReturn = new ArrayList<>();
		for (int i = 0; i < book.size(); i++) {
			switch (type) {
			case "id":
				book.get(i).setValue(book.get(i).getId_Book());
				break;
			case "name":
				book.get(i).setValue(book.get(i).getName_Book());
				break;
			case "author":
				book.get(i).setValue(book.get(i).getName_Author());
				break;
			case "publisher":
				book.get(i).setValue(book.get(i).getName_Publish());
				break;
			case "year":
				book.get(i).setValue(book.get(i).getYear_Publishing());
				break;
			default:
				break;
			}
			if (book.get(i).getValue().equals(value)) {
				arrReturn.add(i);
			}
		}
		return arrReturn;
	}

	public void addBook(ArrayList<bean.Book> book, bean.Book addBook, int index) {
		for (int i = book.size(); i > index; i--) {
		}
	}
}