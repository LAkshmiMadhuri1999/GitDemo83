package AmazonTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EmailValidate extends CommonFunctions{

	public static void main(String[] args) throws Exception {
		EmailValidate ob=new EmailValidate();
		ob.launchBrowser();
		ob.signUp();
		
	
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Madhuri");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("9234567881");
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("madhuri.com");
		driver.findElement(By.id("ap_password")).sendKeys("madhuri48");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(1000);
		WebElement m1 = driver.findElement(By.xpath("//input[@id='ap_email']//following::div[@id='auth-email-invalid-email-alert']//div[@class='a-alert-content']"));
	      String msg1 = m1.getText();
	      System.out.println("Error message is: "+ msg1);
		System.out.println("success");
		driver.close();
	}

}
