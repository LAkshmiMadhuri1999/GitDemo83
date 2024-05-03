package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BMADHURI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Madhuri");
		driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("9234567881");
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("madhuri123@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		WebElement m = driver.findElement(By.xpath("//div[@id='auth-password-missing-alert']//following::div[1]"));
	      String msg = m.getText();
	      System.out.println("Error message is: "+ msg);
		System.out.println("success");
		driver.close();
	}

}
