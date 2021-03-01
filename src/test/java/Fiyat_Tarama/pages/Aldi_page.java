package Fiyat_Tarama.pages;

import Fiyat_Tarama.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Aldi_page {
    public Aldi_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "typeahead")
    public WebElement search_box;



    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement search_button;


    @FindBy(xpath = "//div//ul//li[@class='category-item__title']")
    public WebElement products_after_search;






}
