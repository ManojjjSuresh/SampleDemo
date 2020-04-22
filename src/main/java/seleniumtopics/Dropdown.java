package seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver","C:/Manoj/geckodriver_32 bit.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.spicejet.com/Default.aspx");
	    
	    Select select=new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_DropDownListCurrency\"]")));
	    select.selectByVisibleText("Select");
	    
	    driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[2]/table/tbody/tr/td[2]/label")).click();
	    
	    
	    
	    
	    
		
		
		

	}

}
