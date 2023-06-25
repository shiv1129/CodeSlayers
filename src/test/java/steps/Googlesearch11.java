package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.Googlebase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GoogleHome;

public class Googlesearch11 extends Googlebase{

	GoogleHome gh;
	
	WebDriver driver;
	private char[] results;
	
	@Given("I am on a google homepage")
	public void i_am_on_a_google_homepage() {
 
		lauchBroswer();
	}
		
		//   WebDriverManager.chromedriver().setup();
	  // driver = new ChromeDriver();
	   //
	   
	//driver.get("https://www.google.com/");
	  // driver.manage().window().maximize();
	{
	}
 
	@When("I enter search {string}") 
	public void  enter_a_search(String string) {
	    
		gh = new GoogleHome(driver);
		gh.enterSearch("string");
		
		
		//Identify the web elements (Finding the locator) & named it
		
	//	WebElement searchBox;
	//searchBox = driver.findElement(By.name("q"));
	
		//Performing Action
	//	searchBox.sendKeys(string);
	}

	
	@When("I click on google search button")
	public void i_click_on_google_search_button() {
	   gh.clickSearch();
	   
		
		
		
		
		//	WebElement SearchBtn;
		//SearchBtn = driver.findElement(By.name("btnk"));
	   // Searchbtn.click();
	
	//   WebElement SearchBtn =driver.findElement(By.name("btnk"));
	//SearchBtn.submit();
	
	}
	

	@Then("I recieved related search result")
	public void i_recieved_related_search_result() {
	  
		
		
		WebElement resultstats;
		resultstats = driver.findElement(By.id("result-stats"));
		
		String displayresult  = resultstats.getText();
		
		//String results = resultstats.getText();
		
		
		System.out.println("========================");
	   System.out.println(results);
		System.out.println("========================");
	  
		closeBroswer();
	}
	    }  
	

	
	
	

