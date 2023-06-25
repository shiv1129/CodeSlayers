package advance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



	public class DragandDrop{

		public void main(String[] args) {
			 
			WebDriverManager.chromedriver().setup(); 
			WebDriver driver = new ChromeDriver();
	        //driver.get("https://the-internet.herokuapp.com/dropdown");
	        //driver.get("https://www.amazon.com/?tag=amazusnavi-20&hvadid=589152046215&hvpos=&hvnetw=g&hvrand=15738227056468154121&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9004398&hvtargid=kwd-10573980&ref=pd_sl_7j18redljs_e&hydadcr=28883_14580410");
		     driver.manage().window().maximize();}}
		     
	

