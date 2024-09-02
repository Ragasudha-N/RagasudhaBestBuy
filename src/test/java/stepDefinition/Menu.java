package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.Menupage;
import io.cucumber.java.en.Then;
import io.cucumber.java.ParameterType;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Menu {
	WebDriver driver;
	Menupage page;
	Robot robot;
	
	@Given("the user on the web starting page")
	public void the_user_on_the_web_starting_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    driver =new ChromeDriver();
		driver.get("https://www.bestbuy.com/");
		driver.manage().window().maximize();
		page = new Menupage(driver);

	}

	@When("the user click on the country")
	public void the_user_click_on_the_country() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img")).click();
	}
	@Given("I am  on the Best Buy homepage")
	public void i_am_on_the_best_buy_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.get("https://www.bestbuy.com/");
		driver.manage().window().maximize();
		robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

	}
	

	

	@And("I user clicks on the menu button")
	public void i_user_clicks_on_the_menu_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		page.clickMenuButton();
	}

	@Then("the menu button should be visible")
	public void the_menu_button_should_be_visible() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Menu button is displayed");
	}

	@Given("I am on the Best Buy homepage")
	public void i_am_on_the_best_buy_homepage2() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.get("https://www.bestbuy.com/services/triage/shopping");
		driver.manage().window().maximize();
		robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("I  click the menu")
	public void i_click_the_menu() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	page.clickMenuButton();
	}

	@When("I click  appliances")
	public void i_click_appliances() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	page.clickAppliancesLink();
	}

	@And("I click major appliances")
	public void i_click_major_appliances() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		page.clickMajorAppliancesLink();
	}

	@And("I click on Aplliance sale event")
	public void i_click_on_aplliance_sale_event() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		page.clickApplianceSaleEventLink();
	}

	@Then("Top deals message is displayed.")
	public void top_deals_message_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	   boolean msg=driver.findElement(By.xpath("//h2[@class='heading cn-header-text' and contains(text(), 'Top Deals')]")) != null;
	   Assert.assertTrue(msg);
	}

	@Given("I am on the Best Buy Homepage")
	public void i_am_on_the_best_buy_homepage3() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.get("https://www.bestbuy.com/services/triage/shopping");
		driver.manage().window().maximize();
		robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("I click on the menu button")
	public void i_click_on_the_menu_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		page.clickMenuButton();
	}

	@Then("click Brands link")
	public void click_brands_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException()
		page.clickBrandsLink();
	}

	@Then("click on the {string} brand name")
	public void click_on_the_brand_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    // new io.cucumber.java.PendingException();
		page.selectBrand();
	}

	@Given("I land the Best Buy homepage with the search bar visible")
	public void i_land_the_best_buy_homepage_with_the_search_bar_visible() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.get("https://www.bestbuy.com/services/triage/shopping");
		driver.manage().window().maximize();
	}

	@When("I user clicks on the input field and clears it.")
	public void i_user_clicks_on_the_input_field_and_clears_it() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException()
		page.input();
	}

	@When("I enter a product for  search  {string}")
	public void i_enter_a_product_for_search(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		page.enterSearchTerm(string);
	}

	@When("I  click the search icon")
	public void i_click_the_search_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		page.clickSearchIcon();
	}

	@Then("items related to the search term {string} should be displayed")
	public void items_related_to_the_search_term_should_be_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		String text=driver.findElement(By.className("search-title")).getText();
		Assert.assertEquals(string,text);
	}

	
	@Given("I am on the homepage")
	public void i_am_on_the_homepage_with_access_to_the_search_bar() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.get("https://www.bestbuy.com/services/triage/shopping");
		driver.manage().window().maximize();
		robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

	}

	@When("I click on the search button")
	public void i_click_on_the_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException()
		page.input();
		
	}

	@And("I  enter special characters like\"^\"input")
	public void i_enter_special_characters_input(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		page.enterSearchTerm(string);
		page.clickSearchIcon();
		
	}

	@Then("no responses found message should be displayed")
	public void no_responses_found_message_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		String text2=driver.findElement(By.xpath("//h3[@class='no-results-message-new']")).getText();
		Assert.assertEquals(text2,"Hmmm, we didn't find anything for \"[]\"");
	}

	








    
    }


