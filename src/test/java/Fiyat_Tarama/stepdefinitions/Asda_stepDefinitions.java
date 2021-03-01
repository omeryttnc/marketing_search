package Fiyat_Tarama.stepdefinitions;

import Fiyat_Tarama.utilities.ConfigurationReader;
import Fiyat_Tarama.utilities.Driver;
import io.cucumber.java.en.*;

import Fiyat_Tarama.utilities.ExcelUtil;

public class Asda_stepDefinitions {
    ExcelUtil excelUtil = new ExcelUtil("C:\\Users\\savsa\\Desktop\\osmanBey\\urun_isimleri.xls", "Sheet1");


    @Given("go to Asda_website")
    public void go_to_Asda_website() {
        Driver.getDriver().get(ConfigurationReader.getProperty("asda"));
        Driver.wait(2);
    }

    @Then("search for Asda_products")
    public void search_for_Asda_products() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("write the Asda_results")
    public void write_the_Asda_results() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
