package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Loginsteps {

	WebDriver driver;


	@Given("user is already on login page")
	public void user_is_already_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("cz");
		driver.manage().window().maximize();

	}

	@When("title of login page is Free CRM")
	public void title_of_login_page_is_free_crm() {

		String title= driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Free CRM software for customer relationship management, sales, and support.", title);
	}





	@When("user enters  {string} and {string}")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}



	@When("click on login button")
	public void click_on_login_button() {

		WebElement login=driver.findElement(By.xpath("//input[@value='Login']"));

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", login);

	}

	@Then("user is on homepage")
	public void user_is_on_homepage() {

		String title=driver.getTitle();
		System.out.println("Home page title ::" + title);
		Assert.assertEquals("CRMPRO", title);


	}


	@Then("user moves to contacts page")
	public void user_moves_to_contacts_page() {

		driver.switchTo().frame(0);
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@title='Contacts']"))).build().perform();
		driver.findElement(By.xpath("//a[text()='New Contact']")).click();



	}
	@Then("user enters contact details {string} and {string} and {string}")
	public void user_enters_and_and(String firstname, String lastname, String position) {

		driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.id("surname")).sendKeys(lastname);
		driver.findElement(By.id("company_position")).sendKeys(position);
		driver.findElement(By.xpath("//input[@value='Save']")).click();

	}



	@Then("close the browser")
	public void close_the_browser() {

		driver.quit();
	}

}
