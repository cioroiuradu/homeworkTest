package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ForgotPassword extends TestBase{


    @Test
    public void Password() {

        driver.findElement(By.xpath("//div[@class='account-cart-wrapper']//span[@class='label']")).click();
        driver.findElement(By.xpath("//div[@class='links']//li[@class=' last']")).click();
        driver.findElement(By.xpath("//div[@class='content fieldset']//a[@class='f-left']")).click();
        driver.findElement(By.xpath("//div[@class='fieldset']//input[@id='email_address']")).sendKeys("radu123@yahoo.com");
        driver.findElement(By.xpath("//div[@class='buttons-set']//button[@class='button']")).click();


        String expectedMessage = driver.findElement(By.xpath("//ul[@class='messages']//li[@class='success-msg']//span")).getText();
        String succesfulMessage = "If there is an account associated with radu123@yahoo.com you will receive an email with a link to reset your password.";

        assertThat("Password recovery process is unsucesful",succesfulMessage,is(expectedMessage));

    }

}
