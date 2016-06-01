package Sanaty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class testfunction {

		public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.carmax.com/");
		Actions builder = new Actions(driver);
		WebElement menuElement = driver.findElement(By.linkText("Sell Us Your Car"));
		builder.moveToElement(menuElement).build().perform();
		driver.findElement(By.linkText("FAQ")).click();


		}


		}


