package org.fasttrackit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookButtonTest {

    public void FacebookButton(){

        System.setProperty("webdriver.chrome.driver", "D:\\homeworkTest\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.linkText("FACEBOOK")).click();

    }
}
