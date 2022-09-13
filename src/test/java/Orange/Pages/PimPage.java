package Orange.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Orange.Steps.ButtonPages;
import Orange.Steps.Questions;

public class PimPage {
	
	private ButtonPages buttonPages;
	private Questions questions;
	
	@FindBy(how = How.NAME, using = "firstName")
	private WebElement txtPrimerNombre;
	
	@FindBy(how = How.NAME, using = "lastName")
	private WebElement txtApellido;
	
	public PimPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
		this.questions = new Questions(driver);
	}

	
	public void agregarEmpleado() {
		buttonPages.btnAddEmploye();
		questions.tiempoSegundos(1);
		questions.screenShot();
		
	}
	
	public void diligenciarAddEmployee(String name, String apellido) {
		txtPrimerNombre.sendKeys(name);
		txtApellido.sendKeys(apellido);
		buttonPages.btnSave();
		questions.tiempoSegundos(5);
		questions.assertValidateEmployee(name,apellido);
	}
}
