package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pom {

	public static void main(String[]args)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\BrowserAndDrivers\\chromedriver_win32\\chromedriver.exe" );
		  WebDriver driver= new ChromeDriver();
		  PageClass Pobject = new PageClass(driver);
		  
		  String url ="http://demowebshop.tricentis.com";
		  driver.get(url);
		  driver.manage().window().maximize();
		  Pobject.clicklink();
		  String username="shreya21@gmail.com";
		  Pobject.typename(username);
		  String password="password123";
		  Pobject.typepassword(password);
		  Pobject.clickonlogin();
		  System.out.println("the title of the page is"+driver.getTitle());
		  
		  
	}
	
	
}
