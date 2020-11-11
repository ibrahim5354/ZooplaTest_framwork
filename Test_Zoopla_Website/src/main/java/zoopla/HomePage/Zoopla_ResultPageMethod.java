package zoopla.HomePage;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import zoopla.pageFactory.Zoopla_pageFactory;

public class Zoopla_ResultPageMethod  extends Zoopla_pageFactory{

	public Zoopla_ResultPageMethod() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public void number(){
		Select num = new Select (length);
		num.selectByIndex(3);
	}
	public void PriceDecending(){
		Select price = new Select(ResultSort);
		price.selectByIndex(1);
		for(WebElement pr:prices){
			System.out.println(pr.getText());
		}
	}
	public  void clickOn5th() throws IOException, InterruptedException{
		WebElement fith = prices.get(60);
		fith.click();
		}
	}
