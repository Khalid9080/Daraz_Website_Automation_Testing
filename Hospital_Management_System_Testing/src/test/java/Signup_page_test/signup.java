package Signup_page_test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.get("http://localhost/midtermProject/view/patientView/Registration.php");
	        Thread.sleep(2000);

	        driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/fieldset/table/tbody/tr[1]/td[2]/input")).sendKeys("MAZID");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/fieldset/table/tbody/tr[2]/td[2]/input")).sendKeys("mazid@gmail.com");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/fieldset/table/tbody/tr[3]/td[2]/input")).sendKeys("Mazid");
	        Thread.sleep(1000); // Adding a sleep interval of 3 seconds
	        driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/fieldset/table/tbody/tr[4]/td[2]/input")).sendKeys("Saifullahil");
	        Thread.sleep(1000); // Adding a sleep interval of 3 seconds
	        driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/fieldset/table/tbody/tr[5]/td[2]/input[1]")).click();
	        Thread.sleep(1000); // Adding a sleep interval of 3 seconds
	        driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/fieldset/table/tbody/tr[6]/td[2]/input")).sendKeys("25");
	        Thread.sleep(1000); // Adding a sleep interval of 3 seconds
	        driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/fieldset/table/tbody/tr[7]/td[2]/input")).sendKeys("12/12/2001");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/fieldset/table/tbody/tr[8]/td[2]/input")).sendKeys("85");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/fieldset/table/tbody/tr[9]/td[2]/input")).sendKeys("5 feet 7 inch");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/fieldset/table/tbody/tr[10]/td[2]/input")).sendKeys("O+");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/fieldset/table/tbody/tr[11]/td[2]/input")).sendKeys("Saifullahil9080*");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/fieldset/table/tbody/tr[12]/td[2]/input")).sendKeys("Saifullahil9080*");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/fieldset/table/tbody/tr[13]/td[2]/input")).sendKeys("01710254043");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/fieldset/table/tbody/tr[14]/td[2]/textarea")).sendKeys("Bashundhara Block C, Road no: 05, House no 03, Lift 4a");
	        Thread.sleep(1000);
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        // Scroll down the page by 1000 pixels vertical
	        js.executeScript("window.scrollBy(0,1500)");

	        driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/fieldset/table/tbody/tr[15]/td[2]/input[1]")).click();
	        Thread.sleep(1000);
	        
	        
	        
	        


	}

}
