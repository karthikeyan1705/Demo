package karthik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.jqueryui.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Demos")).click();
		driver.findElement(By.xpath("//a[text()='Draggable']")).click();
		driver.findElement(By.linkText("Droppable")).click();
		driver.findElement(By.cssSelector("a[href=\'https://jqueryui.com/resizable/\']")).click();
		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
	}

}
