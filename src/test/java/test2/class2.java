package test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class2 {
	public static String url="https://demo.guru99.com/test/newtours/";
WebDriver driver;

@BeforeTest
public void BT(){
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get(url);
}
@Test(enabled=true,priority=0)
public void testcase1() {
	driver.findElement(By.name("userName")).sendKeys("user");
	driver.findElement(By.name("password")).sendKeys("user");
	driver.findElement(By.name("submit")).click();
}
@Test(enabled=true,priority=1)
public void testcase2() throws InterruptedException{
	driver.findElement(By.linkText("REGISTER")).click();
	//driver.findElement(By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']/input")).sendKeys("kiara");
	Thread.sleep(3000);
	driver.findElement(By.name("firstName")).sendKeys("kiara");
	driver.findElement(By.name("lastName")).sendKeys("sharma");
	driver.findElement(By.name("phone")).sendKeys("10282627");

	driver.findElement(By.id("userName")).sendKeys("test@gmail.com");
	driver.findElement(By.xpath("//*[@name='email']")).sendKeys("test@gmail.com");
	driver.findElement(By.xpath("//*[@type='password']")).sendKeys("tuski");
	driver.findElement(By.xpath("//*[@name='confirmPassword']")).sendKeys("tuski");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	Thread.sleep(3000);
}

@Test(enabled=true,priority=2)
public void testcase3(){

	String title=driver.getTitle();
	String cururl=driver.getCurrentUrl();
	System.out.println("title of page is"+title);	
	System.out.println("url of current page is"+cururl);
	
	//String str="https://demo.guru99.com/test/newtours/register_sucess.php";
	//System.out.println(str);
}
@AfterTest
public void AT() {
//	String title=driver.getTitle();
//	String cururl=driver.getCurrentUrl();
//	System.out.println("title of page is"+title);	System.out.println("url of current page is"+cururl);
	driver.close();
}
}
