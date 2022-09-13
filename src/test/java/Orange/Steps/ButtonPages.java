package Orange.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {

	@FindBy(how = How.XPATH, using = "//button[@type = 'submit']")
	private WebElement btnLogin;
	
	@FindBy(how = How.XPATH, using = "//a[text() = 'Add Employee']")
	private WebElement btnAddEmploye;
	
	@FindBy(how = How.XPATH, using = "//button[text() = ' Save ']")
	private WebElement btnSave;
	
	@FindBy(how = How.XPATH, using = "//ul//li//a[@href= '/web/index.php/leave/viewLeaveModule']")
	private WebElement btnLeave;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/web/index.php/admin/viewAdminModule']")
	private WebElement btnAdmin;
	
	public ButtonPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void btnLogin() {
		btnLogin.click();
	}
	
	public void btnAddEmploye() {
		btnAddEmploye.click();
	}
	
	public void btnSave() {
		btnSave.isDisplayed();
		btnSave.click();
	}
	
	public void btnLeave() {
		btnLeave.click();
	}
	
	public void btnAdmin() {
		btnAdmin.click();
	}
}
