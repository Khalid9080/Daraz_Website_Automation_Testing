package Delete_User;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class delete_user {

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
        
        driver.findElement(By.xpath("html/body/doctype/center/form/fieldset/input[1]")).sendKeys("pavel");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/doctype/center/form/fieldset/input[2]")).sendKeys("Po123456");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/doctype/center/form/fieldset/input[3]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("/html/body/nav/ul/li[1]/a")).click();
        Thread.sleep(2000);
        
        
        
        driver.findElement(By.xpath("/html/body/nav/ul/li[3]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/fieldset/input[1]")).sendKeys("SAIFULLAH");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/fieldset/input[2]")).click();
        
	}

}
