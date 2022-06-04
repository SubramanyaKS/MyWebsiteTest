package test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MyTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		ChromeOptions  options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("start-maximized");
		options.addArguments("--enable-automation");
		options.addArguments("test-type=browsers");
		options.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver();
		driver.get("https://subramanyaks.github.io/"); 
		Thread.sleep(10000);
		System.out.println("Successfully getting the Home Page");
		driver.manage().window().maximize();
		System.out.println("The chrome window is maximized");
		Thread.sleep(3000);
		driver.findElement(By.linkText("PROJECT")).click();
		Thread.sleep(5000);
		System.out.println("Successfully get into Project");
		WebElement element=driver.findElement(By.id("main"));
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].scrollIntoView()", element);
		//Actions actions = new Actions(driver);
		//actions.moveToElement(element).click().build().perform();
		Thread.sleep(5000);
		System.out.println("Successfully get into Home");
		WebElement element1=driver.findElement(By.id("contact"));
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("arguments[0].scrollIntoView()", element1);
		System.out.println("Successfully get into Contact");
		
		
	}

}
