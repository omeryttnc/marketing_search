package Fiyat_Tarama.stepdefinitions;


import Fiyat_Tarama.pages.Sainsburys_page;
import Fiyat_Tarama.utilities.ConfigurationReader;
import Fiyat_Tarama.utilities.Driver;
import Fiyat_Tarama.utilities.ExcelUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Sainsbury_stepDefinitions {
    Sainsburys_page sainsburyspage = new Sainsburys_page();
    ExcelUtil excelUtil = new ExcelUtil("C:\\Users\\savsa\\Desktop\\osmanBey\\urun_isimleri.xls", "Sheet1");

    @Given("go to Sainsbury_website")
    public void go_to_website() {
        Driver.getDriver().get(ConfigurationReader.getProperty("sainsburry"));
        Driver.wait(2);
        sainsburyspage.cookies.click();
        Driver.wait(2);
    }

    @Then("search for Sainsbury_products")
    public void search_for_products() {
        sainsburyspage.search_box.sendKeys(excelUtil.getCellData(2, 0));
        Driver.wait(2);
        sainsburyspage.search_button.click();
        Driver.wait(5);

    }

    @Then("write the Sainsbury_results")
    public void write_the_results() {
        List<WebElement> products_after_search = Driver.getDriver().findElements(By.xpath("//h2[@class='pt__info__description']"));
int size = products_after_search.size()-4;

        System.out.println(size);
        for (int i = 1; i <=size ; i++) {
            System.out.println(products_after_search.get(i).getText());
        }


    }


}
