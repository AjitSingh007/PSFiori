package testing;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class A 
{
	@Test
	public void test1()
	{
		System.setProperty("webdriver.gecko.driver","./div2/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://login.naukri.com/nLogin/Login.php");
	Reporter.log("Hi",true);
	System.out.println("Hellow");
	}

}
