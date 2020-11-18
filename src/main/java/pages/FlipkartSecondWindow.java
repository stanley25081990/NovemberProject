package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class FlipkartSecondWindow extends FlipkartFirstWindow {
	
	
	static String dataprice;
	
	public static void switchToChild() {
			System.out.println("The Child window page has reached");
	
	String str = wd.getCurrentUrl();
	System.out.println(str);

	}
	
	public static void getChildTitle() {
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		WebElement input = wd.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/h1/span"));
		String data2 = input.getText();
		System.out.println(data2);
		WebElement input1 = wd.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div[4]/div[1]/div/div[1]"));
		dataprice = input1.getText();
		System.out.println(dataprice + "");
		
		
	}
	
	public static void compareChildAndSource() {
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		System.out.println(data1);
		System.out.println(dataprice);
		if(data1.equals(dataprice)) {
			System.out.println("price value is perfectly matched");
			
//			WebElement pincode = wd.findElement(By.id("pincodeInputId"));
//			pincode.sendKeys(""+600059);
//			WebElement check = wd.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[8]/div/div/div[1]/div[2]/div/div[2]/div[1]/span"));
//			check.click();
			WebElement input1 = wd.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button"));
			input1.click();
	
		}
		
	}
	
	public static void getFinalNameAndPrice() {
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		WebElement input2 = wd.findElement(By.xpath("(//div[@class='_2-uG6-']//child::a[@class='_2Kn22P gBNbID'])[1]"));
		String data2 = input2.getText();
		System.out.println(data2);
		WebElement input3 = wd.findElement(By.xpath("//div[@class='_3fSRat']//child::span[@class='_2-ut7f _1WpvJ7']"));
		String data3 = input3.getText();
		System.out.println(data3);
		int i = 1/0;

	}
	
	public static void clickOnPlaceOrder() {
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		WebElement input4 = wd.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/form/button/span"));
		input4.click();
		wd.close();
		wd.switchTo().window(parentid);
		wd.close();
		
		
	}

}
