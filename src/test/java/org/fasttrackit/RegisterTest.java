package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest extends TestBase {

    @Test
    public void RegisterAccount() {

        driver.findElement(By.linkText("ACCOUNT")).click();
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("firstname")).sendKeys("Radu");
        driver.findElement(By.id("middlename")).sendKeys("A");
        driver.findElement(By.id("lastname")).sendKeys("Cioroiu");
        driver.findElement(By.className("validate-email")).sendKeys("radu.cioroiu@email.com");
        driver.findElement(By.name("password")).sendKeys("test1234");
        driver.findElement(By.id("confirmation")).sendKeys("test1234");
        driver.findElement(By.id("is_subscribed")).click();
        driver.quit();
    }
}
