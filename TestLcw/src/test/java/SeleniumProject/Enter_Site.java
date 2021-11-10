package SeleniumProject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class Enter_Site {

	public static void main (String[] arg) {
		
	}
	public void PrepareSite(WebDriver driver) 
	{

		driver.get("https://www.lcwaikiki.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.className("homepage-popup-gender")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    //driver.findElement(By.id("logo")).click();
		
	}
}
