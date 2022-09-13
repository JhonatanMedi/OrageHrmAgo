package Orange.Steps;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ibm.icu.text.SimpleDateFormat;

import net.thucydides.core.annotations.Step;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;

public class Questions {

	private WebDriver driver;
	
	public Questions(WebDriver driver) {
		this.driver = driver;
	}

	@Step
	public void screenShot() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String filename = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		File dest = new File("C:\\Users\\Jhonatan\\Documents\\Capturas\\" + filename + ".png");
		try {
			FileUtils.copyFile(scr, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
	
	public void tiempoSegundos(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void assertValidateEmployee(String name, String apellido) {
		String employee = driver.findElement(By.xpath("//div[@class = 'orangehrm-edit-employee-name']//h6")).getText();
		Assert.assertEquals(employee, name + " "+ apellido);
	}
	
	public void scrollSeach(String nameEmployee) {

		WebElement result = driver.findElement(By.xpath("//div[@role = 'cell']//..//div[3]//div[text()='"+nameEmployee+"']"));
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView();", result);

	}
	
	public void scrollSeachUser(String nameUser) {

		WebElement result = driver.findElement(By.xpath("//div[@role='cell']//div[text()='"+nameUser+"']"));
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView();", result);

	}

}