package week2.day2;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafInformation {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='j_idt88:name']")).sendKeys("Joy");
		driver.findElement(
				By.xpath("//h5[text()='Append Country to this City.']//following::input[@id='j_idt88:j_idt91']"))
				.clear();

		driver.findElement(
				By.xpath("//h5[text()='Append Country to this City.']//following::input[@id='j_idt88:j_idt91']"))
				.sendKeys("TamilNadu");
		try {
			WebElement element = driver.findElement(By
					.xpath("//h5[text()='Verify if text box is disabled']//following::input[@placeholder='Disabled']"));

			boolean isDisabled = element.isDisplayed();
			if (isDisabled) {
				System.out.println("Element is disabled");

			}

		} catch (NoSuchElementException e) {
			System.out.println("Elemenet is not present on page");

			// TODO: handle exception
		}

		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']")).clear();
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']")).sendKeys("Hello");
		WebElement element = driver.findElement(By.xpath(" //input[@id='j_idt88:j_idt97']"));
		String text = element.getAttribute("value");

	}

}
