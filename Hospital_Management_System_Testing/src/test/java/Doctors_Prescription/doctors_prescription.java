package Doctors_Prescription;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class doctors_prescription {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.get("http://localhost/midtermProject/view/Home_Page.php");
	        Thread.sleep(2000);
	        

	        driver.findElement(By.xpath("/html/body/center/a[1]")).click();
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("html/body/doctype/center/form/fieldset/input[1]")).sendKeys("gokugoten1717@gmail.com");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html/body/doctype/center/form/fieldset/input[2]")).sendKeys("12345678@Ab");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html/body/doctype/center/form/fieldset/input[3]")).click();
	        Thread.sleep(2000);
	       
	        		 driver.findElement(By.xpath(" /html/body/doctype/fieldset/form[2]/h3/input[1]")).sendKeys("500");
	        		 Thread.sleep(2000);
	        		 driver.findElement(By.xpath(" /html/body/doctype/h2/a")).click();	
	        		 Thread.sleep(2000);
	        		 driver.findElement(By.xpath("/html/body/h2/a[1]")).click();
	        		 Thread.sleep(2000);
	        		 driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("gokugoten1717@gmail.com");
	        		 Thread.sleep(2000);
	        		 driver.findElement(By.xpath(" /html/body/form/textarea")).sendKeys("Napa Extend 1+0+1; Serjel 1+0+1; Flazyl 1+0+0");
	        		 Thread.sleep(2000);
	        		
	        		driver.findElement(By.xpath(" /html/body/form/input[2]")).click();
	        		Thread.sleep(2000);
	        		driver.findElement(By.xpath(" /html/body/h2/a[3]")).click();
	        		
	        		
	        		 
	        		

	}

}
