package Week4.Day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ERailTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.erail.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("MS",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("Cape",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		List<WebElement> findElement = driver.findElements(By.xpath("//table[@Class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr//td[2]"));
		for(WebElement each:findElement)
		{
			String text = each.getText();
			System.out.println(text);
		}
		
	}

}
