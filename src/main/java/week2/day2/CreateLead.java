package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();

		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TATA");

		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Mathews");

		driver.findElement(By.xpath("//input[contains(@id,'firstNameLocal')]")).sendKeys("George");

		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("joy");

		driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']")).sendKeys("Max");

		WebElement e = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));

		Select select = new Select(e);

		select.selectByVisibleText("New York");
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();

		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//a[text()='Edit']")).click();

		// input[@id='ext-gen614']

		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();

		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Infosys");

		driver.findElement(By.xpath("//input[@id='updateLeadForm_firstName']")).clear();

		driver.findElement(By.xpath("//input[@id='updateLeadForm_firstName']")).sendKeys("Mathews123");
		driver.findElement(By.xpath("//input[@id='updateLeadForm_lastName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_lastName']")).sendKeys("Daniel");
		driver.findElement(By.xpath("//input[@id='updateLeadForm_firstNameLocal']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_firstNameLocal']")).sendKeys("Ashok");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println(driver.getTitle());

	}

}
