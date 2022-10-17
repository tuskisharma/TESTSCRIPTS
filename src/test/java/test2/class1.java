package test2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class1 {
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;
	@BeforeTest
	public void BT() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test(enabled=true,priority=0)
	public void testcase1() throws InterruptedException{
		Thread.sleep(1000);
		//String beforelogin=driver.getTitle();
		WebElement u=driver.findElement(By.xpath("//*[@placeholder='Username']"));
		if(u.isDisplayed()) {
			u.sendKeys("Admin");
		}
		WebElement u1=driver.findElement(By.name("password"));
		if(u1.isEnabled()) {
			u1.sendKeys("admin123");
		}
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
		@Test(enabled=true,priority=1)
		public void testcase2() throws InterruptedException{
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
		Thread.sleep(3000);
		 driver.findElements(By.xpath("//*[@class='oxd-table-body oxd-card-table-body']")).get(3).click();
		 Thread.sleep(3000);
		 driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(3).click();
		 Thread.sleep(3000);
		 driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(3).click();
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
		Thread.sleep(3000);
		}
		
		
	

	@Test(enabled=false,priority=1)	
	public void testcase3() {
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[10]/a")).click();
		driver.findElement(By.xpath("//*[@class='oxd-form']/div[3]/div/div/input")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
    
		
		
	
//		String afterlogin=driver.getTitle();
//		if(beforelogin.equals(afterlogin)) {
//			System.out.println("logout from page");
//		}
//		else {
//			System.out.println("title is not same");
//		}
	
		
	@Test(enabled=false, priority=3)
		public void testcase4() throws InterruptedException{
			
			driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
			
		}
	@Test(enabled=false,priority=2)
	public void testcase5() throws InterruptedException {
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-grid-item oxd-grid-item--gutters']//div//div//input")).sendKeys("tushar");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Job Titles")).click();
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-form']/div/div/div/input")).sendKeys("new manager");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
	
	}
	@AfterTest(enabled=false)
	public void AT() throws InterruptedException{
		Thread.sleep(3000);
		driver.quit();
	}
	
	
		
	

}
