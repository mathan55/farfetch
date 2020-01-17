package farfetch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class BaseClass {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-Anuth\\farfetch\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.farfetch.com/in/shopping/men/items.aspx");
		WebElement wm = driver.findElement(By.xpath("//a[@data-test='Header_Toggle_Gender249']"));
		wm.click();
		WebElement jew= driver.findElement(By.xpath("//a[@data-tstid='Go_Menu_ShopWomen_Jewelry']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(jew).perform();
        TakesScreenshot tk=(TakesScreenshot)driver;
		File temp=tk.getScreenshotAs(OutputType.FILE);
		File desc=new File("C:\\Users\\Lenovo\\eclipse-Anuth\\farfetch\\Screenshot\\praveen.png");
		FileUtils.copyFile(temp,desc);
		
		
		
	}
		
		
	
}



