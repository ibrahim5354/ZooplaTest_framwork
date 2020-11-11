package zoopla.HomePage;
import java.io.IOException;
import org.openqa.selenium.support.PageFactory;

import zoopla.pageFactory.Zoopla_pageFactory;

public class Zoopla_SearchPageMethod  extends  Zoopla_pageFactory{
	
	public Zoopla_SearchPageMethod() throws IOException {
		PageFactory.initElements(driver, this); //inizalize
	}

	public void EnterLocation(String Location) throws InterruptedException, IOException{		
		
		DeleteCookie.click();
		Thread.sleep(5000);
		searchProperty.sendKeys(Location);
		searchButton.click();
		
	}
	

}
