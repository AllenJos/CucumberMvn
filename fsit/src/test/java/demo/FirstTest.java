package demo;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FirstTest {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  WebElement un = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		un.sendKeys(n);
		driver.findElement(By.id("txtPassword")).sendKeys(s);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "linda.anderson", "linda.anderson" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\FSIT\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.close();
  }

}
