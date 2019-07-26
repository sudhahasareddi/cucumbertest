package testme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class test {
	WebDriver driver= null;
	@Given("The Login page is open")
	public void the_Login_page_is_open() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\BrowserAndDrivers\\chromedriver_win32\\chromedriver.exe" );
	  driver= new ChromeDriver();
	  String url ="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
	  driver.get(url);
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.xpath("//a[@href='login.htm']")).click();
	  
	    
	}

	@When("user enters username as lalitha")
	public void user_enters_username_as_lalitha() {
		  driver.findElement(By.id("userName")).sendKeys("lalitha");
	}

	@When("user enters password as password{int}")
	public void user_enters_password_as_password(Integer int1) {
		  driver.findElement(By.id("password")).sendKeys("password123");
		  driver.findElement(By.xpath("//input[@name='Login']")).click();
	    
	}

	@Then("homepage is open")
	public void homepage_is_open() {
	   System.out.println("home page");
	}


}
