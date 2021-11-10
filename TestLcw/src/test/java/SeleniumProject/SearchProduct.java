package SeleniumProject;

import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;


public class SearchProduct {

	public static void main (String[] arg) {			
	}
	public void Search(WebDriver driver ,String product) {

		WebElement tb_product = driver.findElement(By.className("searchBox"));

			tb_product.clear();

			tb_product.sendKeys(product);
			driver.findElement(By.className("searchButton")).click();

	}

	public void ScrollBar(WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		driver.findElement(By.className("lazy-load-button")).click();

	}
	
	
	
}
