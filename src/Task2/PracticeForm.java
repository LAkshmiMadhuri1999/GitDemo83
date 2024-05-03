package Task2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class PracticeForm extends CommonFunctions{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PracticeForm ob=new PracticeForm();
		ob.launchBrowser();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.name("firstname")).sendKeys("Madhuri");
		driver.findElement(By.name("lastname")).sendKeys("B");
		driver.findElement(By.xpath("//input[@value='Female']")).click();		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//input[@value='2']//following::input[@type='text']")).sendKeys("08-08-2021");
		driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();		
		driver.findElement(By.xpath("//input[@name='photo']")).sendKeys("C:\\Users\\BMADHURI\\Pictures\\Camera Roll\\taskfile\\photoflower.avif");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Selenium Webdriver']")).click();
		Select drp=new Select(driver.findElement(By.name("continents")));
		drp.selectByVisibleText("North America");
		Thread.sleep(2000);	
		js.executeScript("window.scrollBy(0,150)");		
		Select drp1=new Select(driver.findElement(By.name("selenium_commands")));
		drp1.selectByVisibleText("Browser Commands");
		driver.findElement(By.name("submit")).click();
		Alert a=driver.switchTo().alert();
		String alertmsg=driver.switchTo().alert().getText();
		System.out.println(alertmsg);
		a.dismiss();
		System.out.println("Success");
		driver.close();
	}

}
