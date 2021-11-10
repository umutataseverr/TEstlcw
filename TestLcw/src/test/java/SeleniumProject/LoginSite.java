package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import junit.framework.Assert;

public class LoginSite {

	
	public static void main (String[] arg) {			
	}
	
	public void PrepareLogin(WebDriver driver) {
		driver.findElement(By.className("dropdown-toggle")).click();

	}
	public void EnterCredential(WebDriver driver, String username, String password) {

		WebElement tb_username = driver.findElement(By.name("LoginEmail"));
		tb_username.sendKeys(username);
		WebElement tb_password = driver.findElement(By.name("Password"));
		tb_password.sendKeys(password);
		driver.findElement(By.id("loginLink")).click();
	}
	public void validateLogin(WebDriver driver) {

		System.out.print("VALIDATION");
		WebElement loggedIn = driver.findElement(By.className("dropdown-label"));
		Assert.assertEquals(loggedIn.getText(),"Hesabım");

	}
}
