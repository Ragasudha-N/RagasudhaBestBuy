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

    @FindBy(xpath = "//button[@aria-label='Menu']")//w
    private WebElement menuButton;

    @FindBy(xpath = "//ul[@class='hamburger-menu-flyout-list']")//w
    private WebElement menuList;

    @FindBy(xpath = "//input[@aria-label='Type to search. Navigate forward to hear suggestions']")//w
    private WebElement searchInputField;

    @FindBy(xpath = "//button[@aria-label='submit search']")
    private WebElement searchButton;

    @FindBy(css = ".search-title")
    private WebElement searchResults;

    @FindBy(xpath = "//div[@class='no-results-message']")
    private WebElement noResultsMessage;

    @FindBy(xpath = "//*[@id=\"shop-header-31818558\"]/div/div[1]/header/div[2]/div/nav/div/div/ul")
    private WebElement categoryList;

    @FindBy(xpath = "//a[@class='category-link']")
    private WebElement categoryLink;

    public Menupage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void clickMenuButton() {
        wait.until(ExpectedConditions.elementToBeClickable(menuButton));
        menuButton.click();
    }

    public boolean isMenuListVisible() {
        return wait.until(ExpectedConditions.visibilityOf(menuList)).isDisplayed();
    }

    public void clickSearchButton() {
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButton.click();
    }

    public void enterSearchTerm(String searchTerm) {
        wait.until(ExpectedConditions.visibilityOf(searchInputField));
        searchInputField.sendKeys(searchTerm);
    }

    public void submitSearch() {
        searchInputField.submit();
    }

    public boolean areSearchResultsVisible() {
        return wait.until(ExpectedConditions.visibilityOf(searchResults)).isDisplayed();
    }

    public boolean isNoResultsMessageVisible() {
        return wait.until(ExpectedConditions.visibilityOf(noResultsMessage)).isDisplayed();
    }

    public void selectCategory(String category) {
        wait.until(ExpectedConditions.visibilityOf(categoryList));
        driver.findElement(By.xpath("//a[contains(text(),'" + category + "')]")).click();
    }

    public boolean areCategoryResultsVisible() {
        return wait.until(ExpectedConditions.visibilityOf(searchResults)).isDisplayed();
    }

    /*public void clickInvalidCategory() {
        // Attempt to click an invalid category
        driver.findElement(By.xpath("//a[@class='invalid-category-link']")).click();
    }*/

    public boolean isErrorPageVisible() {
        // Check if error page is visible
        return wait.until(ExpectedConditions.titleContains("Error Page"));
    }

    public void emptySearchInput() {
        wait.until(ExpectedConditions.visibilityOf(searchInputField));
        searchInputField.clear();
        searchInputField.submit();
    }

    public boolean isSearchInputFieldEmpty() {
        return wait.until(ExpectedConditions.visibilityOf(searchInputField)).getText().isEmpty();
    }
}