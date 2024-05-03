package AmazonTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PasswordValidate extends CommonFunctions{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PasswordValidate ob=new PasswordValidate();
		ob.launchBrowser();
		ob.signUp();
		
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Madhuri");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("9234567881");
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("madhuri@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("(//input[@id='ap_customer_name']//following::div[@style='display: block;']//div[@class='a-alert-content'])[1]")).getText());
		//System.out.println(driver.findElement(By.xpath("//input[@id='ap_password']//following::div[@style='display: block;']//div[@class='a-alert-content']")).getText());
//	    driver.findElement(By.id("ap_password")).sendKeys("ma");
//	    driver.findElement(By.xpath("//input[@id='continue']")).click();
//	    System.out.println(driver.findElement(By.xpath("//input[@id='ap_password']//following::div[@style='display: block;']//div[@class='a-alert-content']")).getText());
	    System.out.println("success");
		driver.close();
	}

}
