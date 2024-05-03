package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Taskkact {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BMADHURI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).build().perform();
		driver.findElement(By.xpath("//a[@class='nav-action-signin-button']//child::span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Madhuri");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("9234567881");
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("madhuri123@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(2000);
		//WebElement m = driver.findElement(By.xpath("//div[@id='auth-password-missing-alert']//following::div[1]"));
		WebElement m = driver.findElement(By.xpath("//input[@id='ap_password']//following::div[6]"));
	      String msg = m.getText();
	      System.out.println("Error message is: "+ msg);
		System.out.println("success");
		driver.close();
	}

}
