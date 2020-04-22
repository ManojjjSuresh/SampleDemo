package seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriverbasics {

	public static void main(String[] args) {

	System.setProperty("webdriver.gecko.driver","C:/Manoj/geckodriver_32 bit.exe");
    WebDriver driver=new FirefoxDriver();
	//driver.get("http://google.com");
	 driver.get("https://www.amazon.in/ap/register?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_newcust");
	 //driver.close();
	 
	 driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("Manoj");
	 
	 driver.findElement(By.id("ap_phone_number")).sendKeys("9500737545");
	 
	 driver.findElement(By.name("secondaryLoginClaim")).sendKeys("manoj2060@gmail.com");
	 
	 // driver.findElement(By.id("ap_password")).sendKeys("1234567890");
	 driver.findElement(By.cssSelector("#ap_password")).sendKeys("123456");
	 
	 //driver.findElement(By.id("continue")).click();
	 
	 //driver.findElement(By.linkText("Sign in")).click();
	 
	// driver.findElement(By.linkText("Conditions of Use")).click();
	 
	 
	 
	 
	
	 
   
    
   /*System.setProperty("webdriver.chrome.driver","C:/Manoj/chromedriver_win32 (1).exe"); 
   WebDriver driver= new ChromeDriver();
   driver.get("http://google"); */
		

	}

}
