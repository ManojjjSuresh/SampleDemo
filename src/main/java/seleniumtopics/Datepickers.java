package seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Datepickers {

	public static void main(String[] args) throws InterruptedException {
		
		String month="April 2020";
		String day="25";


		System.setProperty("webdriver.gecko.driver","C:/Manoj/geckodriver_32 bit.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.spicejet.com/Default.aspx");
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
	    driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[1]/div[2]/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[2]/li[2]/a")).click();
	    driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[1]/li[8]/a")).click();
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[4]/td[4]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_view_date2\"]")).click();
	    
	   
	    String text=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div")).getText();
	    System.out.println(text);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[5]/td[5]/a")).click(); 
	    
	    
	    	    
	}

}
