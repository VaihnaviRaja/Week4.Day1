package Week4.Day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chitogarh {

	public static void main(String[] args) {
		// 1. Launch the URL https://www.chittorgarh.com/
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//2. Click on stock market
		driver.findElement(By.xpath("//a[text()='STOCK MARKET ']")).click();
		
		//3. Click on NSE bulk Deals
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		
		//4. Get all the Security names
		List<WebElement> findElement = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr//td[3]"));
		for(WebElement each:findElement)
		{	
			String text = each.getText();
			System.out.println(text);
		}
			
		//5. Ensure whether there are duplicate Security namesb

	}

}
