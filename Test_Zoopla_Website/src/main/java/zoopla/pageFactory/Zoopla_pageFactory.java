package zoopla.pageFactory;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import zoopla.Base.TestBase;

public class Zoopla_pageFactory extends TestBase{
public Zoopla_pageFactory() throws IOException {
		PageFactory.initElements(driver, this);
	}
	/***************page factory for  Zoopla_SearchPage****************************/
    @FindBy(xpath = "//*[@id='cookie-consent-form']/div/div/div/button[2]")
	protected
    WebElement DeleteCookie;
    @FindBy(id="search-input-location")
	protected
	WebElement searchProperty;
	@FindBy(id="search-submit")
	protected
	WebElement searchButton;
	/***************************end*****************************************/
	/***************page factory for  Zoopla_house preference****************************/
	@FindBy(xpath = "//*[@id='form-search-and-refine']/div[1]/div/div[1]/button")
	protected
	WebElement withIn_Mile;
	
	@FindBy(id="radius")
	protected
	WebElement mile;
	
	@FindBy(xpath="//*[@id='form-search-and-refine']/div[1]/div/div[2]/button")
	protected
	WebElement propertyType;
	
	//@FindBy(xpath="//*[@id='form-search-and-refine']/div[1]/div/div[2]/div/div[1]")
	@FindBy(xpath="//*[@id='form-search-and-refine']/div[1]/div/div[2]/div/div[1]")
	protected
	WebElement selectProperty;
	
	@FindBy(xpath="//button[@value='Search']")
	protected
	WebElement sButton;
	/***************************end*****************************************/
	
	
	/***************page factory for  Zoopla_ResultPageMethod****************************/
	@FindBy(xpath="//select[@name='results_sort']")
	protected
	WebElement ResultSort;
	
	@FindBy(xpath= "//a[contains(@class,'listing-results-price text-price')]")
	protected
	List<WebElement> prices;
	
	@FindBy(xpath="//select[@name='page_size']")
	protected
	WebElement length;
	/***************************end*****************************************/
	
	/***************page factory for  Zoopla_AgentMethod****************************/
	@FindBy(xpath="//div[@class='ui-agent__logo']/img[@class='js-lazy-loaded']")
	protected
	WebElement Logo;

	@FindBy(xpath="//h4[@class='ui-agent__name']")
	protected
	List<WebElement> agentDetail;

	@FindBy(xpath = "//p[contains(@class,'ui-agent__tel ui-agent__text')]/a[@class='ui-link']")
	protected
	List<WebElement>phoneNumber;

	@FindBy(xpath="//*[@id='dp-sticky-element']/div/div[1]/a/div[1]/img")
	protected
	WebElement agencyPage;

	@FindBy(xpath="//p[@class='ui-pricing__main-price ui-text-t4']")
	protected
	List<WebElement> housePrice;

	@FindBy(xpath="//h1[@class='ui-property-summary__title ui-title-subgroup']")
	protected
	WebElement BedRooms;

	@FindBy(xpath="//h2[@class='ui-property-summary__address']")
	protected
	WebElement houseLocation;
	/***************************end*****************************************/


}
