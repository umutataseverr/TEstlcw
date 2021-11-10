package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SelectProduct {
    public static void main (String[] arg) {
    }

    public void ProductRan(WebDriver driver){
        List<WebElement> allLinks = driver.findElements(By.className("picture-box"));
        Random random = new Random();
        WebElement randomLink = allLinks.get(random.nextInt(allLinks.size()));
        randomLink.click();



    }

    public void ProductOp(WebDriver driver){

        driver.findElement(By.className("option-size")).click();
        //driver.findElement(By.id("option-size")).click();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       driver.findElement(By.id("pd_add_to_cart")).click();


    }




}
