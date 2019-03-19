package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddReview extends TestBase {
    @Test
    public void Review() {

        driver.findElement(By.xpath("//div[@class='input-box']//input[@id='search']")).sendKeys("shirt");
        driver.findElement(By.xpath("//div[@class='input-box']//button[@title='Search']")).click();
        driver.findElement(By.xpath("//div[@class='actions']//a[last()]")).click();
        driver.findElement(By.xpath("//p[@class='rating-links']//a[last()]")).click();
        driver.findElement(By.xpath("//td[@class='value']//label[@for='Quality_4']//input[@value='4']")).click();
        driver.findElement(By.xpath("//td[@class='value']//label[@for='Price_4']//input[@value='14']")).click();
        driver.findElement(By.xpath("//td[@class='value']//label[@for='Value_4']//input[@value='9']")).click();
        driver.findElement(By.xpath("//div[@class='input-box']//textarea[@class='required-entry']")).sendKeys("shirt is too ugly");
        driver.findElement(By.xpath("//div[@class='input-box']//input[@id='summary_field']")).sendKeys("aaaaaa");
        driver.findElement(By.xpath("//div[@class='input-box']//input[@id='nickname_field']")).sendKeys("raduuuu");
        driver.findElement(By.xpath("//div[@class='buttons-set']//button[@title='Submit Review']")).click();


        String expectedMessage = driver.findElement(By.xpath("//li[@class='success-msg']//span")).getText();
        String succesfulMessage = "Your review has been accepted for moderation.";

        assertThat("The review was not added",succesfulMessage,is(expectedMessage));

    }





}
