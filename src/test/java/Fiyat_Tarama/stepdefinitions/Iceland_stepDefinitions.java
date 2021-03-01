package Fiyat_Tarama.stepdefinitions;


import Fiyat_Tarama.utilities.ConfigurationReader;
import Fiyat_Tarama.utilities.Driver;
import Fiyat_Tarama.utilities.ExcelUtil;
import io.cucumber.java.en.*;

public class Iceland_stepDefinitions {
    ExcelUtil excelUtil = new ExcelUtil("C:\\Users\\savsa\\Desktop\\osmanBey\\urun_isimleri.xls", "Sheet1");


    @Given("go to Iceland_website")
    public void go_to_Iceland_website() {
        Driver.getDriver().get(ConfigurationReader.getProperty("iceland"));
        Driver.wait(2);
    }

    @Then("search for Iceland_products")
    public void search_for_Iceland_products() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("write the Iceland_results")
    public void write_the_Iceland_results() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
