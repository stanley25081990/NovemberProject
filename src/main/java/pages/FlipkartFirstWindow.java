package pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartFirstWindow {
	
	static WebDriver wd;
	static String data1;
	static String parentid;
	
	public static void openbrowser() {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWorkSpace\\Task_CucumberFlipkartTest\\browser\\chromedriver.exe");
//		wd = new ChromeDriver();
		wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public static void enterUrl(String url) {
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get(url);
		 System.out.println(url);
		
		
	}
	
	public static void closePopup() {
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement input = wd.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		input.sendKeys(Keys.ESCAPE);
	}
	
	public static  void samsungSearch() {
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement input = wd.findElement(By.name("q"));
		input.sendKeys("samsung");
		input.sendKeys(Keys.ENTER);
		
	}
	
	public static void getSearchTitle() {
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement input = wd.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]"));
    	String data = input.getText();
    	System.out.println(data);
    	WebElement input1 = wd.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div[1]/div/div"));
    	data1 = input1.getText();
    	System.out.println(data1 + "");
    	
    	
	
	}
	
	public static  void clickFirstLink() {
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement input = wd.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]"));
		input.click();
		
		Set<String> window = wd.getWindowHandles();
		Iterator< String> it = window.iterator();
		
		parentid = it.next();
		System.out.println("the parent id is "+ parentid);
		String childid = it.next();
		System.out.println("the child id is "+ childid);
		
		String str = wd.getCurrentUrl();
		System.out.println(str);
		System.out.println();
		
		wd.switchTo().window(childid);
		String str1 = wd.getCurrentUrl();
		System.out.println(str1);
		
		

	
	}

}
