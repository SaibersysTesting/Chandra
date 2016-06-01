package Gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mail {
public static void main(String[]args){
	
WebDriver driver = new FirefoxDriver();

driver.get("https://www.indeed.com");
driver.findElement(By.id("what")).sendKeys("Selenium");
driver.findElement(By.id("where")).clear();
driver.findElement(By.id("where")).sendKeys("Dallas");
driver.findElement(By.linkText("Post your resume")).click();


// System.out.println(driver.getTitle());
// System.out.println(driver.findElement(By.id("searchCount")).getText());

}
}
