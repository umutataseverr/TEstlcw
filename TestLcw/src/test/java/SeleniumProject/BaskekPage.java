package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaskekPage {


    public void EnterCart(WebDriver driver) {

        driver.findElement(By.className("header-cart")).click();
        WebElement ekle=driver.findElement(By.name("data-quantity"));
        ekle.clear();
        ekle.sendKeys("2");


    }
}
