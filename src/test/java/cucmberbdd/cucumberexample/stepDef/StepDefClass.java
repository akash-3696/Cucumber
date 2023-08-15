package cucmberbdd.cucumberexample.stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefClass {
	WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("Step 1: User is on login page");
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	    
	    
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String uname, String password) {
	    System.out.println("Step 2: Entering username and pswd");
//	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//	    driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.name("username")).sendKeys(uname);
	    driver.findElement(By.name("password")).sendKeys(password);
	}

	@And("click on login button")
	public void click_on_login_button() {
	    System.out.println("Step 3: Using clicking on Login button");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("user should land on home page")
	public void user_should_land_on_home_page() {
	    System.out.println("Landed on Home Page");
	    driver.close();
	}

}
