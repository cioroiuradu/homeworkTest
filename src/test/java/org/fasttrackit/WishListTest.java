package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WishListTest {

    @Test
    public void navigateThroughWishList() {
        System.setProperty("webdriver.chrome.driver","D:\\homeworkTest\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.linkText("SALE")).click();
        driver.findElement(By.linkText("VIEW DETAILS")).click();
        driver.findElement(By.className("link-wishlist")).click();
        driver.quit();



    }
}
