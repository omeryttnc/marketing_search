package Fiyat_Tarama.stepdefinitions;


import Fiyat_Tarama.pages.Google_page;
import Fiyat_Tarama.utilities.ConfigurationReader;
import Fiyat_Tarama.utilities.Driver;
import Fiyat_Tarama.utilities.ExcelUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.HashMap;

public class Google_stepDefinitions {
    ExcelUtil excelUtil = new ExcelUtil("C:\\Users\\savsa\\Desktop\\osmanBey\\urun_isimleri.xls", "Sheet1");
    Google_page google_page = new Google_page();

    @Given("genel kod")
    public void genel_kod() {
        int allData = excelUtil.rowCount();
        HashMap<Integer, Integer> site_numaralari = new HashMap<>();
        site_numaralari.put(1, 1);
        site_numaralari.put(2, 2);
        site_numaralari.put(3, 3);
        site_numaralari.put(4, 4);
        site_numaralari.put(5, 5);
        site_numaralari.put(6, 6);
        site_numaralari.put(7, 7);
        site_numaralari.put(8, 8);
        site_numaralari.put(9, 9);
        site_numaralari.put(10, 10);
        HashMap<String, String> siteAdi_hashmap = new HashMap<String, String>();
        for (int i = 2; i < 3; i++) {
            google_page.search_box.sendKeys(excelUtil.getCellData(i, 0));
            Driver.wait(2);
            //   google_page.search_button.click();
            google_page.search_box.sendKeys(Keys.ENTER);
            Driver.wait(2);

            for (Integer j : site_numaralari.keySet()) {
                WebElement site_adi = Driver.getDriver().findElement(By.xpath("(//div[@class='hlcw0c']/div/div/div/a)[" + j + "]"));
                WebElement link_adi = Driver.getDriver().findElement(By.xpath("(//div[@class='hlcw0c']/div/div/div/a)[" + site_numaralari.get(j) + "]"));
                String site_adi_string = site_adi.getText();
                String linkLocatin = link_adi.getAttribute("href");
                siteAdi_hashmap.put(site_adi_string, linkLocatin);
            }
//hepsini yazdirma
            for (String k : siteAdi_hashmap.keySet()) {
//                if (k.contains("amazon")) {
//                    //  excelUtil.setCellData(siteAdi_hashmap.get(k), 1, 8);
//
//                    System.out.println("amazon key: " + k + " value: " + siteAdi_hashmap.get(k));
//                }
                if (k.contains("asda")) {
                    //  excelUtil.setCellData(siteAdi_hashmap.get(k), 1, 8);

                    System.out.println("asda key: " + k + " value: " + siteAdi_hashmap.get(k));
                }
            }
            //  System.out.println(siteAdi_hashmap.containsKey("ocado"));

//        if (siteAdi_hashmap.containsKey("ocado")) {
//            System.out.println(siteAdi_hashmap.containsKey("ocado"));
//        }
            Driver.getDriver().navigate().back();
            System.out.println("******************************");

        }
    }

    @Given("go to Google_website")
    public void go_to_Aldi_website() {
        Driver.getDriver().get(ConfigurationReader.getProperty("google"));
        Driver.wait(2);
        Driver.getDriver().switchTo().frame(0);
        google_page.pop_up.click();
        Driver.wait(2);
    }

    @Then("search for Google_products")
    public void search_for_Aldi_products() {
//        google_page.search_box.sendKeys("sss");
        int allData = excelUtil.rowCount();
//        for (int i = 2; i < 5; i++) {
        google_page.search_box.sendKeys(excelUtil.getCellData(4, 0));
        Driver.wait(2);
        //   google_page.search_button.click();
        google_page.search_box.sendKeys(Keys.ENTER);
        Driver.wait(2);

        // }
    }

    @Then("write the Google_result")
    public void write_the_Aldi_results() {
        HashMap<Integer, Integer> site_numaralari = new HashMap<>();
        site_numaralari.put(1, 1);
        site_numaralari.put(2, 2);
        site_numaralari.put(3, 3);
        site_numaralari.put(4, 4);
        site_numaralari.put(5, 5);
        site_numaralari.put(6, 6);
        site_numaralari.put(7, 7);
        site_numaralari.put(8, 8);
        site_numaralari.put(9, 9);
        site_numaralari.put(10, 10);

        HashMap<String, String> siteAdi_hashmap = new HashMap<String, String>();
        for (Integer i : site_numaralari.keySet()) {
            WebElement site_adi = Driver.getDriver().findElement(By.xpath("(//div[@class='hlcw0c']/div/div/div/a)[" + i + "]"));
            WebElement link_adi = Driver.getDriver().findElement(By.xpath("(//div[@class='hlcw0c']/div/div/div/a)[" + site_numaralari.get(i) + "]"));
            String site_adi_string = site_adi.getText();
            String linkLocatin = link_adi.getAttribute("href");
            siteAdi_hashmap.put(site_adi_string, linkLocatin);
        }
//hepsini yazdirma
        for (String i : siteAdi_hashmap.keySet()) {
//            if (i.contains("ocado")) {
//                excelUtil.setCellData(siteAdi_hashmap.get(i), 1, 8);

            System.out.println("key: " + i + " value: " + siteAdi_hashmap.get(i));
//            }
        }
        //  System.out.println(siteAdi_hashmap.containsKey("ocado"));

//        if (siteAdi_hashmap.containsKey("ocado")) {
//            System.out.println(siteAdi_hashmap.containsKey("ocado"));
//        }

    }

    @Then("write the for aldi")
    public void write_the_for_aldi() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("write the for asda")
    public void write_the_for_asda() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("write the for beelivery")
    public void write_the_for_beelivery() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("write the for coop")
    public void write_the_for_coop() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("write the for grocerium")
    public void write_the_for_grocerium() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("write the for iceland")
    public void write_the_for_iceland() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("write the for ocado")
    public void write_the_for_ocado() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("write the for sainsbury")
    public void write_the_for_sainsbury() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("write the for tesco")
    public void write_the_for_tesco() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("write the for waitrose")
    public void write_the_for_waitrose() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}

