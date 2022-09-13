package Orange.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TablesPages {
	
	private WebDriver driver;
	
	public TablesPages(WebDriver driver) {
		this.driver = driver;
	}
	
	public void buscarEmpleado(String nameEmployee,String actions) {
		Actions action = new Actions(driver);
		WebElement lists= driver.findElement(By.xpath("//div[@role = 'cell']//..//div[3]//div[text()='"+nameEmployee+"']//..//..//div[9]//div//button[text()=' Approve ']"));
	
		
		WebElement list= lists.findElement(By.xpath("//..//..//div[9]//div//button[text()=' Approve ']"));
		action.moveToElement(list).click().build().perform();
	}

	
	public void buscarUsuario(String nameUser) {
		Actions action = new Actions(driver);
		WebElement lists = driver.findElement(By.xpath("//div[@role='cell']//div[text()='" + nameUser + "']"));
			WebElement list= lists.findElement(By.xpath("//..//..//div[6]//div//button"));
		action.moveToElement(list).click().build().perform();
	}
}
