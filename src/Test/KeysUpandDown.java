package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysUpandDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BMADHURI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.navigate().to("https://www.google.com");
		driver.get("https://demowebshop.tricentis.com/");
		
	    Actions a = new Actions(driver);
	    a.keyDown(Keys.SHIFT);
	    WebElement ele=driver.findElement(By.linkText("Search"));
	      //enter text with keyDown() SHIFT key ,keyUp() then build() ,perform()
	    a.click(ele).build().perform();

	    System.out.println("Success");
		driver.close();
	}

}
