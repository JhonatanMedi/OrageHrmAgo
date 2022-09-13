package Orange.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Orange.Steps.ButtonPages;

public class LoginPage {

	private ButtonPages buttonPages;
	
	// buscando un elemento en el html de tipo XPATH
	@FindBy(how = How.NAME, using = "username")
	// esto es una variable de tipo WebElement
	private WebElement inputUserName;
	
	@FindBy(how = How.NAME, using = "password")
	private WebElement txtpassword;

	// esto es un constructor
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
	}

	//esto es un metodo
	public void diligencieLogin(String user, String pass) {
		inputUserName.sendKeys(user);
		txtpassword.sendKeys(pass);
		buttonPages.btnLogin();
	}
}