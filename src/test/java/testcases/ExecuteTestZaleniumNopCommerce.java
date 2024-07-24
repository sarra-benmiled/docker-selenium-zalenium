package testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ExecuteTestZaleniumNopCommerce {
	
	public void runTest2() throws MalformedURLException, InterruptedException {
		
		System.out.println("Thread wich is running " +Thread.currentThread().getId());
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName( BrowserType.FIREFOX);
		//cap.setPlatform(Platform.WIN10);
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
