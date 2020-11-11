package zoopla.HomePage;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import zoopla.pageFactory.Zoopla_pageFactory;

public class Zoopla_AgentDetailsMethod extends Zoopla_pageFactory {
	public Zoopla_AgentDetailsMethod() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public boolean logoDisplay() {
		if (Logo.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public String getAgentDetail() {
		WebElement agent = agentDetail.get(0);
		return agent.getText();
	}

	public String getPhoneNumber() {
		WebElement phone = phoneNumber.get(0);
		return phone.getAttribute("href").split(":")[1];
	}

	public String Hprice() {
		WebElement hpr = housePrice.get(0);
		return hpr.getText();
	}

	public String bed() {
		String rm = BedRooms.getText();
		return rm;
	}

	public String area() {
		String lc = houseLocation.getText();
		return lc;
	}

	public void agency() {
		agencyPage.click();
	}

	public void Title() {
		System.out.println(driver.getTitle());
	}
}
