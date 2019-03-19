package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CustomerServiceTest extends TestBase {


        @Test
        public void CustomerService() {

            driver.findElement(By.linkText("CUSTOMER SERVICE")).click();
            String expectedMessage = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
            String correctMessage = "CUSTOMER SERVICE";
            assertThat("The Customer Service page doesn't work ! ",correctMessage,is(expectedMessage));
        }
}
