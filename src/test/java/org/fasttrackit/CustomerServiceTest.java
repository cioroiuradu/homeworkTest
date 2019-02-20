package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CustomerServiceTest {


        @Test
        public void CustomerService() {
            System.setProperty("webdriver.chrome.driver", "D:\\homeworkTest\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://fasttrackit.org/selenium-test/");
            driver.findElement(By.linkText("CUSTOMER SERVICE")).click();
            String expectedMessage = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
            String correctMessage = "CUSTOMER SERVICE";
            assertThat("The Customer Service page doesn't work ! ",correctMessage,is(expectedMessage));
        }
}
