package Week4.Day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement findElement = driver.findElement(By.xpath("//Select[@Class='ui-selectonemenu']"));
		Select s = new Select(findElement);
		List<WebElement> options = s.getOptions();
		for(int i=0;i<=options.size();i++)
		{
			if(i==2||i==3)
			{
				options.get(i).click();
			}
		}
		WebElement findElement2 = driver.findElement(By.xpath("//Select[@Class='ui-selectonemenu']"));
		System.out.println(findElement2.getText());

	}

}
