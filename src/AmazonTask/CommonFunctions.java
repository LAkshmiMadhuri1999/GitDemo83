package AmazonTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CommonFunctions {

	public static ChromeDriver driver;
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BMADHURI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	}
	
	public void signUp() throws Exception {
		WebElement hello=driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(hello).build().perform();
		driver.findElement(By.xpath("//a[@class='nav-action-signin-button']//child::span[@class='nav-action-inner']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		Thread.sleep(1000);
	}
}
