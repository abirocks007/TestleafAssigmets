package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Max");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("joy");
		driver.findElement(By.xpath("//input[contains(@id,'u_2_g_')]")).sendKeys("9566656578");
		driver.findElement(By.xpath("//input[contains(@id,'password_step_input')]")).sendKeys("PA33word!");
		WebElement element1 = driver.findElement(By.xpath("//select[@id='day']"));
		Select selec1 = new Select(element1);
		selec1.selectByIndex(2);
		WebElement element2 = driver.findElement(By.xpath("//select[@id='month']"));
		Select selec2 = new Select(element2);
		selec2.selectByIndex(4);
		WebElement element3 = driver.findElement(By.xpath("//select[@id='year']"));
		Select selec3 = new Select(element3);
		selec3.selectByIndex(6);
		driver.findElement(By.xpath("//input[contains(@id,'u_2_4_')]")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();

	}

}
