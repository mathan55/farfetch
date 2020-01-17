package farfetch;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MainClass  {
	
	public static void main(String[] args) throws IOException {
		launchChromeBrowser();
		
		loadUrl("");
		
		maximize();
		
		
		WebElement wm = driver.findElement(By.xpath("//a[@data-test='Header_Toggle_Gender249']"));
		wm.click();
		
		WebElement jew= driver.findElement(By.xpath("//a[@data-tstid='Go_Menu_ShopWomen_Jewelry']"));
		Select s=new Select(jew);
		jew.isSelected();
		
		
		
		
		Screenshot();
		

		
	}

		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


