package ru.yandex.test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyStepDef extends Steps{

    @Given("перейти на сайт '(.*)'")
    public void перейтиНаСайт(String site) {
        открытьХром();
        chromeDriver.get(site);
    }
    @When("осуществить поиск '(.*)'")
    public void осуществитьПоиск(String value) {
        WebElement searchField = chromeDriver.findElement(By.xpath("//*[@id=\"text\"]")); //   //*[@id="text"]
        WebElement searchButton = chromeDriver.findElement(By.xpath("//*[@class=\"search2__button\"]")); // //*[@class="search2__button"]
        searchField.click();
        searchField.sendKeys(value);
        searchButton.click();
    }
    @Then("найти сайт '(.*)'")
    public void найтиWikipedia(String wikipedia) {
        List<WebElement> ListOfWebElement = chromeDriver.findElements(By.xpath("//*[@class=\"path path_show-https organic__path\"]//b"));

        Boolean check = false;
        for (WebElement elementGladiolus: ListOfWebElement) {
            if (elementGladiolus.getText().contains(wikipedia)){
                check = true;}
            System.out.println(elementGladiolus.getText());
        }
        Assert.assertTrue(check);
    }
    @Then("закончить работу")
    public void закончитьРаботу() {
        закрытьХром();
    }
}