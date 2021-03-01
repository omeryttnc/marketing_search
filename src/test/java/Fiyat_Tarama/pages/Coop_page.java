package Fiyat_Tarama.pages;

import Fiyat_Tarama.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coop_page {
    public Coop_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@data-id='search-term']")
    public WebElement search_box;

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement cookies;


    @FindBy(xpath = "//button[@data-testid='search-btn']")
    public WebElement search_button;


    @FindBy(xpath = "//h2[@class='pt__info__description']")
    public WebElement products_after_search;






}
