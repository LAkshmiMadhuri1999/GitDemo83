package Task3;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ColumnElements {
    public static void main(String[] args) throws Throwable {  
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\BMADHURI\\Downloads\\chromedriver_win32\\chromedriver.exe");  
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/web-table-element.php#google_vignette");
        List<WebElement> totRows = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
        System.out.println("Total No of rows in the table is " +totRows.size());
        for(int i=1;i<totRows.size();i++)
        {
            driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]"));            
            List<WebElement> totCols = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr["+i+"]//td"));
            System.out.println("Row "+i+ " Tot cols "+totCols.size());
            for(int j=1;j<totCols.size();j++)
            {
                WebElement col1 =  driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr["+i+"]/td[1]"));

                if((col1.getText()).contains("HDIL"))
                {
                    WebElement col =  driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr["+i+"]/td["+j+"]"));
                    System.out.println(col.getText());
                }
                else
                    break;
            }

        }

 

    }

}