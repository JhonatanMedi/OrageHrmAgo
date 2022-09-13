package Orange.Pages;

import org.openqa.selenium.WebDriver;

import Orange.Steps.ButtonPages;
import Orange.Steps.Questions;
import Orange.Steps.TablesPages;

public class AdminPage {

	private ButtonPages buttonPages;
	private Questions questions;
	private TablesPages tablesPages;

	public AdminPage(WebDriver driver) {
		this.buttonPages = new ButtonPages(driver);
		this.questions = new Questions(driver);
		this.tablesPages = new TablesPages(driver);
	}

	public void eliminarUsuario(String nameUser) {
		buttonPages.btnAdmin();
		questions.scrollSeachUser(nameUser);
		tablesPages.buscarUsuario(nameUser);
	}
}
