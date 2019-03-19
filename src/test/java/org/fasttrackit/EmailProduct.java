package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class EmailProduct extends TestBase{

    @Test
    public void Email() {

        driver.findElement(By.xpath("//div[@class='input-box']//input[@id='search']")).sendKeys("shirt");
        driver.findElement(By.xpath("//div[@class='input-box']//button[@title='Search']")).click();
        driver.findElement(By.xpath("//div[@class='actions']//a[last()]")).click();
        driver.findElement(By.xpath("//ul[@class='sharing-links']//a[@class='link-email-friend']")).click();
        driver.findElement(By.xpath("//div[@class='input-box']//input[@id='email']")).sendKeys("nekohva@yahoo.com");
        driver.findElement(By.xpath("//div[@class='input-box']//input[@id='pass']")).sendKeys("test1234");
        driver.findElement(By.xpath("//div[@class='buttons-set']//button[@title='Login']")).click();
        driver.findElement(By.xpath("//div[@class='input-box']//textarea[@id='sender_message']")).sendKeys("good shirt buy it");
        driver.findElement(By.xpath("//div[@class='input-box']//input[@id='recipients_name']")).sendKeys("alexander");
        driver.findElement(By.xpath("//div[@class='input-box']//input[@id='recipients_email']")).sendKeys("friend@example.com");
        driver.findElement(By.xpath("//button[@class='button']//span")).click();



        String expectedMessage = driver.findElement(By.xpath("//li[@class='success-msg']//span")).getText();
        String succesfulMessage = "The link to a friend was sent.";

        assertThat("The product is not succesfully send",succesfulMessage,is(expectedMessage));

    }

}
