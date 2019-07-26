package testme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class parameter {
WebDriver driver =null;

@Given("the login page is open")
public void the_login_page_is_open() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\BrowserAndDrivers\\chromedriver_win32\\chromedriver.exe" );
	  driver= new ChromeDriver();
	  String url ="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
	  driver.get(url);
	  driver.manage().window().maximize();
	  
	  
    
}

@When("User clicks on signin link")
public void user_clicks_on_signin_link() {
	driver.findElement(By.xpath("//a[@href='login.htm']")).click();
    
}

@When("Enter {string} and  {string}")
public void enter_and(String username, String password) {
	driver.findElement(By.id("userName")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	  driver.findElement(By.xpath("//input[@name='Login']")).click();
	
  
}

@Then("Message is displayed login successfully")
public void message_is_displayed_login_successfully() {
	System.out.println("login page");
  
}

}
