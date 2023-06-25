package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCheckBoxes {
public static void main(String[] args) {
	 
	WebDriverManager.chromedriver().setup(); 
	WebDriver driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/checkboxes");
    driver.manage().window().maximize();
    
    WebElement chk1 = driver.findElement(By.xpath("//input{@type='checkbox'}) {1}"));
    
    if (chk1.isSelected()==true);
    	System.out.println("checkbox1 is selected");
   
    
    	System.out.println("CheckBox1 is not selected");
    
    chk1.click();
    
    if (chk1.isSelected()==true)
    	System.out.println("checkbox2 is selected");
    else
    System.out.println("CheckBox2 is not selected");
    
    driver.close();
}
}