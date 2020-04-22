package seleniumtopics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamicwebtable {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.gecko.driver","C:/Manoj/geckodriver_32 bit.exe");
	    WebDriver driver=new FirefoxDriver();
	    
	    driver.get("https://ui.freecrm.com/");
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mail2manoj16@gmail.com");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@1234");
	    driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a[3]/span")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[8]/div/button/i")).click();
	    Thread.sleep(4000); 
	    Alert alert=driver.switchTo().alert();
	    alert.dismiss();
	    //System.out.print(alert.getText());
	    //driver.findElement(By.className("//button[@class='ui black button']")).click();
	    
	    
	    //alert.dismiss();
	    
	    //Thread.sleep(4000);
	    
	     
	    
	    
	   // driver.findElement(By.xpath("//td[contains(text(),'testt testtt')]/../td[1]")).click();
	      
	    
	    
	    
	   
	}

}
