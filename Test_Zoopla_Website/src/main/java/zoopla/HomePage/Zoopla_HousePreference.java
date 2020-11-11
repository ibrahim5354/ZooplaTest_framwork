package zoopla.HomePage;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import zoopla.pageFactory.Zoopla_pageFactory;

public class Zoopla_HousePreference extends Zoopla_pageFactory {
	public Zoopla_HousePreference() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public void SelectMile() {
		withIn_Mile.click();
	}

	public void Mile() {
		Select ml = new Select(mile);
		ml.selectByIndex(5);
	}

	public void property() {
		propertyType.click();
	}

	
	public void property2() {
		selectProperty.click();
		}
	
	public void serButton(){
		 sButton.click();
		
	}


	

}
