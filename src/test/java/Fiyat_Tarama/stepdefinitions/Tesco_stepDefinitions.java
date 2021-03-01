package Fiyat_Tarama.stepdefinitions;


import Fiyat_Tarama.utilities.ConfigurationReader;
import Fiyat_Tarama.utilities.Driver;
import Fiyat_Tarama.utilities.ExcelUtil;
import io.cucumber.java.en.*;

public class Tesco_stepDefinitions {
    ExcelUtil excelUtil = new ExcelUtil("C:\\Users\\savsa\\Desktop\\osmanBey\\urun_isimleri.xls", "Sheet1");


    @Given("go to Tesco_website")
    public void go_to_Tesco_website() {
        Driver.getDriver().get(ConfigurationReader.getProperty("tesco"));
        Driver.wait(2);
    }

    @Then("search for Tesco_products")
    public void search_for_Tesco_products() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("write the Tesco_results")
    public void write_the_Tesco_results() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
