package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class pomtestng {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\BrowserAndDrivers\\chromedriver_win32\\chromedriver.exe" );
	  WebDriver driver= new ChromeDriver();
	  String url ="http://demowebshop.tricentis.com";
	  driver.get(url);
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
	  imple2 locateelements= PageFactory.initElements(driver,imple2.class);
	  locateelements.loginMethod("shreya21@gmail.com","password123");
	  
	  
	  
  }
}
