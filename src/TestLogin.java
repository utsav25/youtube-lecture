import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;


@Test
public class TestLogin {
	
	public void loginTest(){
	ProfilesIni list = new ProfilesIni();
	FirefoxProfile profile = list.getProfile("Selenium");
	WebDriver driver = new FirefoxDriver(profile);
	driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	(driver.findElement(By.xpath("//*[@id='email']"))).sendKeys("usrivastav@care.com");
	(driver.findElement(By.xpath("//*[@id='pass']"))).sendKeys("letmein1");
	(driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div/div/div/div/form/table/tbody/tr[2]/td[3]/label/input"))).click();
	System.out.println("just for github");
}
}