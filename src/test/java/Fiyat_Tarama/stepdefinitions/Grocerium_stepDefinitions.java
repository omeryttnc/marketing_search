package Fiyat_Tarama.stepdefinitions;


import Fiyat_Tarama.pages.Aldi_page;
import Fiyat_Tarama.pages.Grocerium_page;
import Fiyat_Tarama.utilities.ConfigurationReader;
import Fiyat_Tarama.utilities.Driver;
import Fiyat_Tarama.utilities.ExcelUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Grocerium_stepDefinitions {
    ExcelUtil excelUtil = new ExcelUtil("C:\\Users\\savsa\\Desktop\\osmanBey\\urun_isimleri.xls", "Sheet1");
    Grocerium_page grocerium_page = new Grocerium_page();

    @Given("go to Grocerium_website")
    public void go_to_Aldi_website() {
        Driver.getDriver().get(ConfigurationReader.getProperty("grocerium"));
        Driver.wait(2);
        grocerium_page.cookies_button.click();
    }

    @Then("search for Grocerium_products")
    public void search_for_Aldi_products() {
        grocerium_page.search_box.sendKeys(excelUtil.getCellData(1, 0));
        Driver.wait(2);
        grocerium_page.search_button.click();
        Driver.wait(5);

    }

    @Then("write the Grocerium_results")
    public void write_the_Aldi_results() {
        List<WebElement> productNames = Driver.getDriver().findElements(By.xpath("//div[@class='product-content clearfix']//span[2]"));
        for (WebElement w : productNames
        ) {
            System.out.println(w.getText());

        }
        List<WebElement> productprice = Driver.getDriver().findElements(By.xpath("//div[@class='product-content clearfix']//span[2]"));
        for (WebElement w : productprice
        ) {
            System.out.println(w.getText());

        }
    }

    @Then("bakery")
    public void bakery() {
        Driver.hover(grocerium_page.bakery);
        Driver.wait(2);
        grocerium_page.bakery_1.click();
        List<WebElement> baker_1_price = Driver.getDriver().findElements(By.xpath("//div[@class='product-content clearfix']//span[2]"));
        int total_anount_product = baker_1_price.size();
        List<WebElement> sayfaSayisi = Driver.getDriver().findElements(By.xpath("//li[@class='page-item']"));
        int sayfa_sayisi = sayfaSayisi.size();
        int count = 1;
        System.out.println(sayfa_sayisi);
        do {
            System.out.println("en once " + count);
            for (int i = 1; i <= total_anount_product; i++) {
                System.out.print(Driver.getDriver().findElement(By.xpath("(//div[@class='product-content clearfix'])[" + i + "]//span[1]")).getText());
                System.out.print(" ");
                System.out.println(Driver.getDriver().findElement(By.xpath("(//div[@class='product-content clearfix'])[" + i + "]//span[2]")).getText());

            }
            WebElement sayfa = Driver.getDriver().findElement(By.xpath("(//li[@class='page-item'])[" + count + "]"));
            sayfa.click();
            System.out.println("once " + count);
            count+=2;
            System.out.println("sonra " + count);
        } while (count <= sayfa_sayisi);
        Driver.wait(10);

    }


    @Then("snacks")
    public void snacks() {
        System.out.println("  ");
    }

}


