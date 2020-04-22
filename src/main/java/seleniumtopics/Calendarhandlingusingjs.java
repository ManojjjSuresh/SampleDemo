package seleniumtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendarhandlingusingjs {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.gecko.driver","C:/Manoj/geckodriver_32 bit.exe");
	    WebDriver driver=new FirefoxDriver();
	    Thread.sleep(5000);
	    //driver.get("https://www.makemytrip.com/flights/airlines.html");
	    driver.get("https://www.makemytrip.com/flights/airlines.html");
	    Thread.sleep(5000);
	    
	    WebElement date = driver.findElement(By.className("//div[@class='modify-search-input-box date']"));
	    String dateval = "Wed, 8 Apr 20";   
	    selectdatebyJS(driver,date,dateval); 
	    
	}


public static void selectdatebyJS(WebDriver driver, WebElement element, String dateval) {
	 
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	js.executeScript("arguments[0].setAttribute(('value','"+dateval+"');", element);
}
}
