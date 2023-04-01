package PracticeTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;



public class SampleTest {

	@Test
	
	

public void SampleTestScript()

{
		
//		FirefoxOptions options=new FirefoxOptions();
//		//ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
	
		//  System.setProperty("webdriver.chrome.driver",  "C:\\Users\\91840\\.m2\\repository\\webdriver\\chromedriver\\win32\\111.0.5563.64\\chromedriver.exe");
		  
		  
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\91840\\.m2\\repository\\webdriver\\geckodriver\\win64\\0.31.0\\geckodriver.exe");
		  
			//ChromeDriver driver = new ChromeDriver(options);
		  
		 // FirefoxDriver driver=new FirefoxDriver(options);
		  
		  
		//Now you can Initialize marionette driver to launch firefox
		 // DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		//  capabilities.setCapability("marionette", true);
		  WebDriver driver = new FirefoxDriver();
	        driver.get("https://www.google.com");

	        driver.close();


   // WebDriver driver = new ChromeDriver();
   //  driver.get("https://www.google.com");


}

}  



	

