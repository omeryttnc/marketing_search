package Fiyat_Tarama.stepdefinitions;


import Fiyat_Tarama.utilities.ConfigurationReader;
import Fiyat_Tarama.utilities.Driver;
import Fiyat_Tarama.utilities.ExcelUtil;
import io.cucumber.java.en.*;

public class Waitrose_stepDefinitions {
    ExcelUtil excelUtil = new ExcelUtil("C:\\Users\\savsa\\Desktop\\osmanBey\\urun_isimleri.xls", "Sheet1");

    @Given("go to Waitrose_website")
    public void go_to_Waitrose_website() {
        Driver.getDriver().get(ConfigurationReader.getProperty("waitrose"));
        Driver.wait(2);
    }

    @Then("search for Waitrose_products")
    public void search_for_Waitrose_products() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("write the Waitrose_results")
    public void write_the_Waitrose_results() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
