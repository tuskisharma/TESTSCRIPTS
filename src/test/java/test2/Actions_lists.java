package test2;

import java.sql.Time;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_lists {
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String url2="https://www.youtube.com/";
	WebDriver driver;
	@BeforeTest
	public void BT() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get(url);
		 driver.manage().window().fullscreen();
	}
    @Test(enabled=true)
    public void windowhandle() {
		 driver.getWindowHandle();
		 driver.switchTo().newWindow(WindowType.WINDOW);
		 driver.navigate().to(url2);;
	}
	@Test(enabled=true,priority=0)
	public void testcase1()throws InterruptedException{
		Thread.sleep(3000);
		WebElement u=driver.findElement(By.xpath("//*[@placeholder='Username']"));
		if(u.isEnabled()){
			u.sendKeys("Admin");
		}
		WebElement u1=driver.findElement(By.name("password"));
		if(u1.isEnabled()){
			u1.sendKeys("admin123");
		}
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@class='oxd-grid-item oxd-grid-item--gutters']//div//div//input")).sendKeys("Charlie Carter");
		WebElement u3=driver.findElements(By.xpath("//*[@class='oxd-select-text-input']")).get(1);
        act.click(u3).build().perform();
        Thread.sleep(3000);
        act.sendKeys(u3,Keys.ARROW_DOWN).click().perform();
        Thread.sleep(3000);
        act.sendKeys(u3,Keys.ARROW_DOWN).click().perform();
        act.sendKeys(u3,Keys.ARROW_DOWN).click().perform();
        act.sendKeys(u3,Keys.ENTER).click().build().perform();
        Thread.sleep(3000);
	}
        
        @Test(enabled=true,priority=1)
        public void testcase2() throws InterruptedException {
        	Thread.sleep(3000);
      driver.findElement(By.xpath("//*[@type='submit']")).click();
      List<WebElement> li= driver.findElements(By.tagName("a"));
      System.out.println("total number of links "+li.size());
      for(int i=0;i<li.size();i++) {
    	  System.out.println(li.get(i).getText());
    	  System.out.println(li.get(i).getAttribute("href"));
      }
       
        }
		
//		WebElement u2=driver.findElement(By.xpath("//*[@class='oxd-select-text-input']"));
//        act.click(u2).build().perform();
//        act.sendKeys(u2,Keys.ARROW_DOWN).click().perform();
		
		
//	    List<WebElement> tu=driver.findElements(By.xpath("//*[@class='oxd-table-card']"));
//	    System.out.println(tu.get(3).getText());
//	    System.out.println(tu.size());
//		Thread.sleep(3000);
//	    driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(3).click();
//		Thread.sleep(3000);
//		driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(3).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
//		Thread.sleep(3000);
	}


