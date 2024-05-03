package AmazonTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NameValidate extends CommonFunctions{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		NameValidate ob=new NameValidate();
		ob.launchBrowser();
		ob.signUp();
		
		
		//driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("9234567881");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("madhuri123@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("madhuri48");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(1000);
		
		WebElement m1 = driver.findElement(By.xpath("(//input[@id='ap_customer_name']//following::div[@style='display: block;']//div[@class='a-alert-content'])[2]"));
	      String msg1 = m1.getText();
	      System.out.println("Error message is: "+ msg1);    
		System.out.println("success");
		driver.close();
	}

}
