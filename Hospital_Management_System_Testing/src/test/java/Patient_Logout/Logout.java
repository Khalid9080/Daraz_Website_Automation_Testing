package Patient_Logout;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.get("http://localhost/midtermProject/view/Home_Page.php");
	        Thread.sleep(2000);

	        driver.findElement(By.xpath("/html/body/center/a[1]")).click();

	        Thread.sleep(2000); // Adding a sleep interval of 2 seconds

	        driver.findElement(By.xpath("html/body/doctype/center/form/fieldset/input[1]")).sendKeys("Khalid Saifullah");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html/body/doctype/center/form/fieldset/input[2]")).sendKeys("Saifullah9080*");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html/body/doctype/center/form/fieldset/input[3]")).click();

	        Thread.sleep(3000); // Adding a sleep interval of 3 seconds

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        // Scroll down the page by 1000 pixels vertical
	        js.executeScript("window.scrollBy(0,1500)");

	        Thread.sleep(2000); // Adding a sleep interval of 2 seconds

	        driver.findElement(By.xpath("/html/body/header/nav/ul/li[1]/a")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html/body/h2/a")).click();
	        
	        Thread.sleep(2000);
	        		
	        driver.findElement(By.xpath(" /html/body/form/input[1]")).sendKeys("Saifullah");
	        Thread.sleep(2000);
	        
	        		
	        driver.findElement(By.xpath(" /html/body/form/input[2]")).sendKeys("Khalid");
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("/html/body/form/button")).click();
	        
	        
	        		
	        		
	        		
	}

}
