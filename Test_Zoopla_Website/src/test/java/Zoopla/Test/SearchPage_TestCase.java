package Zoopla.Test;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import zoopla.Base.TestBase;
import zoopla.HomePage.Zoopla_AgentDetailsMethod;
import zoopla.HomePage.Zoopla_HousePreference;
import zoopla.HomePage.Zoopla_ResultPageMethod;
import zoopla.HomePage.Zoopla_SearchPageMethod;
import zoopla.pageFactory.Zoopla_pageFactory;

public class SearchPage_TestCase  extends TestBase{
	Zoopla_SearchPageMethod sp;
	Zoopla_ResultPageMethod rp;
	Zoopla_AgentDetailsMethod ff;
	Zoopla_HousePreference ml;
	
	
	@BeforeTest
	public void init() throws IOException, InterruptedException{
		Intialization();
	    sp = new Zoopla_SearchPageMethod();
	    rp = new Zoopla_ResultPageMethod();
	    ff = new Zoopla_AgentDetailsMethod();
	    ml = new Zoopla_HousePreference();
		}
	
	public SearchPage_TestCase() throws IOException {
		super();
		}
	@Test
	public void asearchTest() throws InterruptedException, IOException{
		sp.EnterLocation("coventry");
		ml.SelectMile();
		ml.Mile();
		ml.property();
		ml.property2();
		ml.serButton();
		rp.number();
		rp.PriceDecending();
		rp.clickOn5th();
		System.out.println("************************************************");
		System.out.println("Agent Logo :" + " "+ ff.logoDisplay());
		System.out.println("Agent Name :" + " "+ff.getAgentDetail());
		System.out.println("Agent number :" + " "+ff.getPhoneNumber());
		System.out.println("number of BedRooms : " + " "+ff.bed());
		System.out.println("House Location: " + " "+ff.area());
		System.out.println("price of the House is : " + " "+ff.Hprice());
		System.out.println("************************************************");
		ff.agency();
		ff.Title();
		
		
		
		}
	
	
		
		
	
}
