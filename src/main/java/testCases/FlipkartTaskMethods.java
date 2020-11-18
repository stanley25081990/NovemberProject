package testCases;
	
	import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FlipkartFirstWindow;
	import pages.FlipkartSecondWindow;

	
	public class FlipkartTaskMethods {

		
	    @Given("^open firefox browser$")
	    public void open_firefox_browser() {
	    FlipkartFirstWindow.openbrowser();
	       		        
	    }

	    @When("^enter URL as (.*)$")
	    public void enter_url(String url)  {
	        FlipkartFirstWindow.enterUrl(url);
	
	    }
	    	
	    @Then("^close popup$")
	    public void close_popup()  {
	    	FlipkartFirstWindow.closePopup();
	     
	    }
	    
	    
	    @When("^type samsung in search box and hit enter$")
	    public void type_samsung_in_search_box_and_hit_enter()  {
	    	FlipkartFirstWindow.samsungSearch();
	    	
	    }
	    
	    @Then("^get the title and price of the first link$")
	    public void get_the_title_and_price_of_the_first_link() {
	        FlipkartFirstWindow.getSearchTitle();
	    	
	    }
	    	    

	    @When("^click the first link$")
	    public void click_the_first_link()  {
	    	 FlipkartFirstWindow.clickFirstLink();    	
	       
	    }
	    
	    @Then("^switch to the first window$")
	    public void switch_to_the_first_window()  {
	    	FlipkartSecondWindow.switchToChild();
	      
	    }
	    
	    @Then("^get the title and price of the searched mobile$")
	    public void get_the_title_and_price_of_the_searched_mobile() {
	    	FlipkartSecondWindow.getChildTitle();
	     
	    }

	    @When("^price of the searched mobile matches with the source$")
	    public void price_of_the_searched_mobile_matches_with_the_source()  {
	    	System.out.println("Comparing the price of the displayed mobile with the previous clicked one");
	    	
	        
	    }

	    @Then("^click on go to cart$")
	    public void click_on_go_to_cart() {
	    	
	    	
	       FlipkartSecondWindow.compareChildAndSource();
	    	
	       
	    }

	    
	    @When("^price of the added cart is same as previous$")
	    public void price_of_the_added_cart_is_same_as_previous()  {
	    	
	    	FlipkartSecondWindow.getFinalNameAndPrice();
	        
	    }

	    
	    @Then("^click on place order$")
	    public void click_on_place_order()  {
	    	FlipkartSecondWindow.clickOnPlaceOrder();
	    	
	       
	    }

	}


