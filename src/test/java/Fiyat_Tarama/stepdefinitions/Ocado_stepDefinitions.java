package Fiyat_Tarama.stepdefinitions;


import Fiyat_Tarama.utilities.ConfigurationReader;
import Fiyat_Tarama.utilities.Driver;
import Fiyat_Tarama.utilities.ExcelUtil;
import io.cucumber.java.en.*;

public class Ocado_stepDefinitions {
    ExcelUtil excelUtil = new ExcelUtil("C:\\Users\\savsa\\Desktop\\osmanBey\\urun_isimleri.xls", "Sheet1");

    @Given("go to Ocado_website")
    public void go_to_Ocado_website() {
        Driver.getDriver().get(ConfigurationReader.getProperty("ocado"));
        Driver.wait(2);
    }

    @Then("search for Ocado_products")
    public void search_for_Ocado_products() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("write the Ocado_results")
    public void write_the_Ocado_results() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
