package Fiyat_Tarama.stepdefinitions;


import Fiyat_Tarama.utilities.ConfigurationReader;
import Fiyat_Tarama.utilities.Driver;
import Fiyat_Tarama.utilities.ExcelUtil;
import io.cucumber.java.en.*;

public class Beelivery_stepDefinitions {
    ExcelUtil excelUtil = new ExcelUtil("C:\\Users\\savsa\\Desktop\\osmanBey\\urun_isimleri.xls", "Sheet1");


    @Given("go to Beelivery_website")
    public void go_to_Beelivery_website() {
        Driver.getDriver().get(ConfigurationReader.getProperty("beelivery"));
        Driver.wait(2);
    }

    @Then("search for Beelivery_products")
    public void search_for_Beelivery_products() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("write the Beelivery_results")
    public void write_the_Beelivery_results() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
