package Fiyat_Tarama.pages;

import Fiyat_Tarama.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google_page {
    public Google_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@title='Search']")
    public WebElement search_box;

    @FindBy(xpath = "(//span[@class='RveJvd snByac'])[3]")
    public WebElement pop_up;



    @FindBy(xpath = "(//input[@value='Google Search'])[2]")
    public WebElement search_button;


    @FindBy(xpath = "//div[@class='TbwUpd NJjxre']//cite[@class='iUh30 Zu0yb qLRx3b tjvcx']")
    public WebElement site_adi;

    @FindBy(xpath = "//div[@class='yuRUbf']//a")
    public WebElement link_adi;






}
