package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactUsTest extends TestBase{

    @Test
    public void ContactUs() {

        driver.findElement(By.linkText("CONTACT US")).click();
        driver.findElement(By.id("name")).sendKeys("Radu");
        driver.findElement(By.id("email")).sendKeys("raducu.papucu@email.com");
        driver.findElement(By.id("comment")).sendKeys("Please help");
        driver.findElement(By.xpath("//button[@class = 'button']")).click();
        String expectedMessage = driver.findElement(By.xpath("//div[@id = 'messages_product_view']//li[@class = 'success-msg']//span")).getText();

        String succesfulMessage = "Your inquiry was submitted and will be responded to as soon as possible. Thank you for contacting us.";

        assertThat("The inquiry was not submmited", succesfulMessage,is(expectedMessage));

    }
}
