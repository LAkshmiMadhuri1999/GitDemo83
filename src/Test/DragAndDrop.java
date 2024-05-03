package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BMADHURI\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		WebElement fromElement = driver.findElement(By.cssSelector("div#column-a"));

		
		WebElement toElement = driver.findElement(By.cssSelector("div#column-b"));

		Actions builder = new Actions(driver);
		//Actions ac=new Actions(driver);

		Action dragAndDrop = builder.clickAndHold(fromElement)
		.moveToElement(toElement)
		.release(toElement)
		.build();
		dragAndDrop.perform();
		System.out.println("Success");
		driver.close();
	}

}
