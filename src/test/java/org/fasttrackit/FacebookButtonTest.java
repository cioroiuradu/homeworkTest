package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FacebookButtonTest extends TestBase {

    public void FacebookButton(){

        driver.findElement(By.linkText("FACEBOOK")).click();

        String expected = driver.findElement(By.xpath("//a[.em[@class='facebook']]")).getAttribute("#");
        String correctLink = "https://www.facebook.com";

        assertThat("Facebook page expected", correctLink, is(expected));

    }
}
