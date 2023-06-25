package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.webdriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHome {

		
	webdriver driver;
	
	public GoogleHome(WebDriver driver) {
		this.driver=(webdriver) driver;
		PageFactory.initElements(driver,this);
		
	}
	
	WebElement searchBox = driver.findElement(By.name("q"));

	@FindBy(name="q")
	WebElement SearchBox;
	
	//	searchBox.sendKeys(string);
	
	public void enterSearch(String string) {
		searchBox.sendKeys(string); 
	
}
	 
	 //WebElement SearchBtn =driver.findElement(By.name("btnk"));
		@FindBy(name="btnk")
		WebElement SearchBtn;
	 
		public void clickSearch() {
	 SearchBtn.submit();
		}
	
}