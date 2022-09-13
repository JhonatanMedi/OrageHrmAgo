package Orange.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ListsPages {
	
	private WebDriver driver;

	
	public ListsPages(WebDriver driver) {
		this.driver = driver;
	}

	
	public void list(String typesLeave) {
		Actions action = new Actions(driver);
		WebElement lists= driver.findElement(By.xpath("//div[@class = 'oxd-select-wrapper']//div//div[2]"));
		action.moveToElement(lists).click().build().perform();
		
		WebElement typeLeave= lists.findElement(By.xpath("//*[text()='"+typesLeave+"']"));
		action.moveToElement(typeLeave).click().build().perform();
		
	}
}
