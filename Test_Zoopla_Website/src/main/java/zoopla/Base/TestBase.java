package zoopla.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	String FilePath = System.getProperty("user.dir")+"\\src\\main\\resources\\configuration\\config.properties";
	Properties prop;
	FileInputStream ip;
	public static WebDriver driver;

	public TestBase() throws IOException{
		prop = new Properties();
		ip = new FileInputStream(FilePath);
		prop.load(ip);
	}

	public void Intialization(){
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		Long implicit= Long.parseLong(prop.getProperty("implicitWait"));
		Long PageLoad = Long.parseLong(prop.getProperty("PageLoadWait"));

		if(browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else 
			if(browser.equalsIgnoreCase("firefox")){
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			
		driver.manage().timeouts().implicitlyWait(implicit,TimeUnit.MINUTES);
		driver.manage().timeouts().pageLoadTimeout(PageLoad, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
	}
}
