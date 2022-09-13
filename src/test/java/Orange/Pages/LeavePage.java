package Orange.Pages;

import org.openqa.selenium.WebDriver;

import Orange.Steps.ButtonPages;
import Orange.Steps.ListsPages;
import Orange.Steps.Questions;
import Orange.Steps.TablesPages;

public class LeavePage {

	private ButtonPages buttonPages;
	private Questions questions;
	private TablesPages tablesPages;
	private ListsPages listsPages;

	public LeavePage(WebDriver driver) {
		this.buttonPages = new ButtonPages(driver);
		this.questions = new Questions(driver);
		this.tablesPages = new TablesPages(driver);
		this.listsPages = new ListsPages(driver);
	}

	public void llegarLeaveList(String typesLeave) {
		questions.tiempoSegundos(3);
		buttonPages.btnLeave();
		listsPages.list(typesLeave);
	}
	
	public void buscarEmpleado(String nameEmployee,String actions) {
		buttonPages.btnLeave();
		questions.scrollSeach(nameEmployee);
		tablesPages.buscarEmpleado(nameEmployee, actions);
		
	}
}
