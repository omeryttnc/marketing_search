package Fiyat_Tarama.stepdefinitions;


import Fiyat_Tarama.pages.Aldi_page;
import Fiyat_Tarama.pages.Sainsburys_page;
import Fiyat_Tarama.utilities.ConfigurationReader;
import Fiyat_Tarama.utilities.Driver;
import Fiyat_Tarama.utilities.ExcelUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Aldi_stepDefinitions {
    ExcelUtil excelUtil = new ExcelUtil("C:\\Users\\savsa\\Desktop\\osmanBey\\urun_isimleri.xls", "Sheet1");
    Aldi_page aldi_page = new Aldi_page();

    @Given("go to Aldi_website")
    public void go_to_Aldi_website() {
        Driver.getDriver().get("https://www.aldi.co.uk/c/specialbuys/specialbuyscategories?q=%3Apopular&page=0&firstPlacementTotalCount=1018&secondPlacementTotalCount=988");
        Driver.wait(2);
    }

    @Then("search for Aldi_products")
    public void search_for_Aldi_products() {
//        aldi_page.search_box.sendKeys(excelUtil.getCellData(1, 0));
//        Driver.wait(2);
//        aldi_page.search_button.click();
//        Driver.wait(5);
        System.out.println(" ");
    }

    @Then("write the Aldi_results")
    public void write_the_Aldi_results() {
        List<WebElement> products_amount = Driver.getDriver().findElements(By.xpath("//div//ul//li[@class='category-item__title']"));
        int total_product = products_amount.size();
        System.out.println(total_product);
        for (int i = 1; i < total_product; i++) {

        WebElement products_after_search = Driver.getDriver().findElement(By.xpath("(//div//ul//li[@class='category-item__title'])["+i+"]"));
        String pr_name= products_after_search.getText();
        excelUtil.setCellData(pr_name, i, 1);

          }
    }

}
