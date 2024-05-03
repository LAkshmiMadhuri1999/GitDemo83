package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LaunchingBrowsers {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BMADHURI\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		//driver.get("https://www.browserstack.com/");

		//Actions a = new Actions(driver);


		//Double click on element

		//WebElement trialaction = driver.findElement(By.xpath("//a[@id='free-trial-link-anchor']"));

		//a.doubleClick(trialaction).perform();
		Thread.sleep(3000);
		System.out.println("Success");
		driver.close();
	}
}
