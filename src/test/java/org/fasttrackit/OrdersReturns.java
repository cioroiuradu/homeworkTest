package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class OrdersReturns extends TestBase{

    @Test
    public void OrdersAndReturns() {

        driver.findElement(By.xpath("//div[@class='links']//a[@title='Advanced Search']")).click();
        driver.findElement(By.xpath("//div[@class='input-box']//input[@id='name']")).sendKeys("PLAID COTTON SHIRT");
        driver.findElement(By.xpath("//div[@class='input-range']//input[@id='price']")).sendKeys("50");
        driver.findElement(By.xpath("//div[@class='input-range']//input[@id='price_to']")).sendKeys("160");
        driver.findElement(By.xpath("//div[@class='input-box']//select[@title='Size']//option[@value='79']")).click();
        driver.findElement(By.xpath("//div[@class='input-box']//select[@id='gender']//option[@value='93']")).click();
        driver.findElement(By.xpath("//div[@class='buttons-set']//button[@class='button']//span")).click();


        String expectedMessage = driver.findElement(By.xpath("//p[@class='advanced-search-amount']//strong")).getText();
        String succesfulMessage = "1 item(s)";

        assertThat("Advanced search returned no result",succesfulMessage,is(expectedMessage));

    }

}

