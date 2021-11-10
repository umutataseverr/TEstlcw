package SeleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Start {

	public static void main (String[] arg) {



		WebDriver driver = new ChromeDriver();
		Enter_Site newEnterSite = new Enter_Site();
		newEnterSite.PrepareSite(driver);



		LoginSite newLoginSite = new LoginSite();
		newLoginSite.PrepareLogin(driver);
		newLoginSite.EnterCredential(driver,"umut.atasever98@outlook.com", "Umut1234");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		newLoginSite.validateLogin(driver);

		SearchProduct newSearchProduct =new SearchProduct();
		newSearchProduct.Search(driver, "pantolan");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		newSearchProduct.ScrollBar(driver);
		SelectProduct newProduct = new SelectProduct();
		newProduct.ProductRan(driver);
		newProduct.ProductOp(driver);
		BaskekPage newCart = new BaskekPage();
		newCart.EnterCart(driver);
		

	}
	
	
	
}
