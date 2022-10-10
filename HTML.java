package Week4.Day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTML {

	public static void main(String[] args) {
		// 1. Launch the URL https://html.com/tags/table/
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//2. Get the count of number of rows
		List<WebElement> findElement = driver.findElements(By.xpath("//div[@class='render']//tr"));
		int rows = findElement.size();
		System.out.println("No. of Rows:"+rows);
		//3. Get the count of number of columns
		List<WebElement> findElement1 = driver.findElements(By.xpath("//div[@class='render']//th"));
		int col= findElement1.size();
		System.out.println("No. of columns :" +col);
	}

}
