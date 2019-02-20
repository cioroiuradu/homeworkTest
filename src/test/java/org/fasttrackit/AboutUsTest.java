package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AboutUsTest {

    @Test
    public void AboutUs() {
        System.setProperty("webdriver.chrome.driver", "D:\\homeworkTest\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.linkText("ABOUT US")).click();
        String story = driver.findElement(By.xpath("//div[@class = 'page-head']")).getText();
        String ourStory = "OUR STORY";
        assertThat("The About Us page doesn't work ! ",ourStory,is(story));
    }
}
