package pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Menupage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//button[@aria-label='Menu']")
    private WebElement menuButton;

    

    @FindBy(xpath = "//*[@id=\"shop-header-3675153\"]/div/div[1]/header/div[2]/div/nav/div/div/ul/li[5]/button")
    private WebElement appliancesLink;

    @FindBy(xpath = "//*[@id=\"shop-header-3675153\"]/div/div[1]/header/div[2]/div/nav/div/div/ul/li[2]/button")
    private WebElement majorAppliancesLink;

    @FindBy(xpath = "//*[@id=\"shop-header-3675153\"]/div/div[1]/header/div[2]/div/nav/div/div/ul/li[2]/a")
    private WebElement applianceSaleEventLink;

    @FindBy(xpath = "//*[@id=\"shop-header-3675153\"]/div/div[1]/header/div[2]/div/nav/div/div/ul/li[3]/button")
    private WebElement brandsLink;
    
    @FindBy(xpath="//*[@id=\"shop-header-30509266\"]/div/div[1]/header/div[2]/div/nav/div/div/ul/li[2]/a")
    private WebElement Brandname;

    @FindBy(xpath = "//*[@id=\"gh-search-input\"]")
    private WebElement searchInputField;

    @FindBy(xpath = "//button[@aria-label='submit search']")
    private WebElement searchIcon;

    public Menupage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // 10 seconds timeout
    }

    public void clickMenuButton() {
        wait.until(ExpectedConditions.elementToBeClickable(menuButton));
        menuButton.click();
    }

    

    public void clickAppliancesLink() {
        wait.until(ExpectedConditions.elementToBeClickable(appliancesLink));
        appliancesLink.click();
    }

    public void clickMajorAppliancesLink() {
        wait.until(ExpectedConditions.elementToBeClickable(majorAppliancesLink));
        majorAppliancesLink.click();
    }

    public void clickApplianceSaleEventLink() {
        wait.until(ExpectedConditions.elementToBeClickable(applianceSaleEventLink));
        applianceSaleEventLink.click();
    }

    public void clickBrandsLink() {
        wait.until(ExpectedConditions.elementToBeClickable(brandsLink));
        brandsLink.click();
    }

    public void selectBrand() {
        wait.until(ExpectedConditions.elementToBeClickable(Brandname));
        Brandname.click();
    }
    public void input() {
        wait.until(ExpectedConditions.elementToBeClickable(searchInputField));
        searchInputField.clear();
        
    }
    public void enterSearchTerm(String searchTerm) {
        wait.until(ExpectedConditions.elementToBeClickable(searchInputField));
        //searchInputField.clear();
        searchInputField.sendKeys(searchTerm);
    }

    public void clickSearchIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(searchIcon));
        searchIcon.click();
    }
}