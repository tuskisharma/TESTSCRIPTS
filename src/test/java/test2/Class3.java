package test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class3  {
	public static String url="https://demo.nopcommerce.com/";
	WebDriver driver;
	@BeforeTest
	public void BT(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	@Test(enabled=false,priority=0)
	public void testcase1()throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//*[@class='male']/input")).click();
		driver.findElement(By.name("FirstName")).sendKeys("tushar");
		driver.findElement(By.name("LastName")).sendKeys("sharma");
	
	}
	@Test(enabled=false,priority=1)
	public void testcase2() throws InterruptedException{
		Thread.sleep(3000);
		Select s=new Select(driver.findElement(By.name("DateOfBirthDay")));
		s.selectByValue("10");
		Thread.sleep(3000);
		Select s1=new Select(driver.findElement(By.name("DateOfBirthMonth")));
		s1.selectByValue("6");
		Thread.sleep(3000);
		Select s2=new Select(driver.findElement(By.name("DateOfBirthYear")));
		s2.selectByValue("1995");
		Thread.sleep(3000);
		driver.findElement(By.name("Email")).sendKeys("test2@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("test@123");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("test@123");
		driver.findElement(By.name("register-button")).click();
		WebElement  u=driver.findElement(By.xpath("//*[@class='buttons']/a"));
		u.click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log out")).click();
		
	}
	@Test(enabled=true,priority=0)
	public void tescase3() throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("test2@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("Password")).sendKeys("test@123");
		Thread.sleep(3000);
		driver.findElement(By.name("RememberMe")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='button-1 login-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='top-menu notmobile']/li[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@alt='Picture for category Camera & photo']")).click();
	}
	

		
	

	@Test(enabled=true,priority=1)
	public void testcase4() throws InterruptedException @SuppressWarnings{
		driver.getWindowHandle();
		Thread.sleep(3000);
		Select t=new Select(driver.findElement(By.name("customerCurrency")));
		t.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='button-2 product-box-add-to-cart-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-button-14")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		act.click(driver.findElement(By.linkText("Log out"))).build().perform();
	}



