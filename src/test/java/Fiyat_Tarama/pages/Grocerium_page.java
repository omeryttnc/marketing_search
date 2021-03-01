package Fiyat_Tarama.pages;

import Fiyat_Tarama.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

import Fiyat_Tarama.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Grocerium_page {

    public Grocerium_page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//li[@class='dropdown '])[1]")
    public WebElement bakery;

    @FindBy(xpath = "((//li[@class='dropdown '])[1]//ul//li)[1]")
    public WebElement bakery_1;

    @FindBy(xpath = "((//li[@class='dropdown '])[1]//ul//li)[2]")
    public WebElement bakery_2;

    @FindBy(xpath = "((//li[@class='dropdown '])[1]//ul//li)[3]")
    public WebElement bakery_3;

    @FindBy(xpath = "((//li[@class='dropdown '])[1]//ul//li)[4]")
    public WebElement bakery_4;

    @FindBy(xpath = "((//li[@class='dropdown '])[1]//ul//li)[5]")
    public WebElement bakery_5;

    @FindBy(xpath = "((//li[@class='dropdown '])[1]//ul//li)[6]")
    public WebElement bakery_6;

    @FindBy(xpath = "(//li[@class='page-item'])[1]")
    public WebElement sayfa_sayisi_web;

    @FindBy(xpath = "//div[@class='cookie-button']//button[@type='submit']")
    public WebElement cookies_button;

    @FindBy(xpath = "(//li[@class='dropdown '])[2]")
    public WebElement snacks;

    @FindBy(xpath = "(//li[@class='dropdown '])[3]")
    public WebElement drinks;

    @FindBy(xpath = "(//li[@class='dropdown '])[4]")
    public WebElement food_cupboard;

    @FindBy(xpath = "(//li[@class='dropdown '])[5]")
    public WebElement baby;

    @FindBy(xpath = "(//li[@class='dropdown '])[6]")
    public WebElement health_beauty;

    @FindBy(xpath = "(//li[@class='dropdown '])[7]")
    public WebElement household;

    @FindBy(xpath = "(//li[@class='dropdown '])[8]")
    public WebElement tobacco;

    @FindBy(xpath = "(//li[@class='dropdown '])[9]")
    public WebElement pets;

    @FindBy(xpath = "(//input[@id='search_input'])[2]")
    public WebElement search_box;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement search_button;

    @FindBy(xpath = "((//div[@class='product-content clearfix'])[1]//span)[2]")
    public WebElement products_name_after_search;

    @FindBy(xpath = "((//div[@class='product-content clearfix'])[1]//span)[1]")
    public WebElement products_price_after_search;





}
