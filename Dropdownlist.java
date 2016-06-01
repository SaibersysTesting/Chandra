import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;          

public class Dropdownlist {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.golfclubs.com");
		driver.findElement(By.id("node_id")).click();
		Select selectByValue = new Select(driver.findElement(By.id("node_id")));
		              selectByValue.selectByValue("2UNDR");
		              Thread.sleep(5000);
		// select the second dropdown using "select by visible text"
       Select selectByVisibleText = new Select (driver.findElement(By.id("node_id")));
	      selectByVisibleText.selectByVisibleText("Cobra");
		  Thread.sleep(5000);
		
		// select the third dropdown using "select by index"
		 Select selectByIndex = new Select(driver.findElement(By.id("node_id")));
		              selectByIndex.selectByIndex(2);
		     Thread.sleep(5000);       
		       }
}
