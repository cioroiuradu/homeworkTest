package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NewsLetterTest extends TestBase{

    @Test
    public void NewsLetter() {

        driver.findElement(By.xpath("//div[@class = 'input-box']//input[@id = 'newsletter']")).sendKeys("raducu@email.com");
        driver.findElement(By.xpath("//div[@class = 'actions']//button[@title= 'Subscribe']")).click();

        String expectedMessage = driver.findElement(By.xpath("//div[@class = 'col-main']//li[@class= 'success-msg']//span")).getText();
        String succesfulMessage = "Thank you for your subscription.";

        assertThat("Subscription is unsucesful",succesfulMessage,is(expectedMessage));

    }
}
