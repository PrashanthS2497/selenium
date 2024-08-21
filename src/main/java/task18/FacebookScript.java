package task18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookScript {

	public static void main(String[] args) 
	{
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Load the url
		driver.navigate().to("https://www.facebook.com/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Click create new account button
		driver.findElement(By.linkText("Create new account")).click();
		
		//enter first and last name
		driver.findElement(By.name("firstname")).sendKeys("Prash");
		driver.findElement(By.name("lastname")).sendKeys("s");
		
		//enter email
		driver.findElement(By.name("reg_email__")).sendKeys("prash@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("prash@gmail.com");
		
		//enter pwd
		driver.findElement(By.name("reg_passwd__")).sendKeys("abc@123");
		
		Select dropdown =new Select(driver.findElement(By.name("birthday_day")));
				dropdown.selectByVisibleText("24");
				
		Select dropdown1=new Select(driver.findElement(By.name("birthday_month")));
		dropdown1.selectByVisibleText("November");
		
		Select dropdown2=new Select(driver.findElement(By.name("birthday_year")));
		dropdown2.selectByVisibleText("1997");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.name("websubmit")).click();
				

	}

}
