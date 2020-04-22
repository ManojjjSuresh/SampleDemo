package seleniumtopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mousemovements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:/Manoj/geckodriver_32 bit.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.spicejet.com/Default.aspx");
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
	    driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[1]/div[2]/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[2]/li[2]/a")).click();
	    
	    /*driver.findElement(By.xpath("/html/body/div[15]/form/div[2]/div/div[1]/div/div/div/ul/li[4]/a/span[2]")).click();
	    Thread.sleep(3000);
	    Select select=new Select(driver.findElement(By.xpath("//*[@id=\"FlifoSearchInputSearchView_originStation\"]")));
	    select.selectByVisibleText("Ajmer (KQH)");*/
	    
	    
	   /* Select select=new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_DropDownListCurrency\"]")));
	    select.selectByVisibleText("USD");
	    
	   Select select1=new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")));
	   select1.selectByValue("Goa (GOI)");*/
	    
	    
	    /*Actions action=new Actions(driver);
	    action.moveToElement(driver.findElement(By.xpath("//*[@id=\"ctl00_HyperLinkLogin\"]"))).build().perform();
	    Thread.sleep(5000);
	    Actions action1=new Actions(driver);
	    action1.moveToElement(driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div[1]/div[2]/div[2]/div/ul/li[15]/ul/li[2]/a"))).build().perform();*/
	    
	    
	    
	   // List <WebElement> linklist=driver.findElements(By.tagName("a"));
	   // System.out.println(linklist.size());
	    
	    
	

	    
	    
	    
	  
	    

	}

}
