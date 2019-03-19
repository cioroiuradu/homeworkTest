package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SelectSize extends TestBase{
    @Test

    public void selectSize() {

        driver.findElement(By.id("search")).sendKeys("chelsea tee" + Keys.ENTER);
        driver.findElement(By.xpath("//li[@class = 'item last']//img[@id = 'product-collection-image-409']")).click();
        driver.findElement(By.xpath("//div[@class = 'input-box']//li[@id='option79']")).click();
        String exepectedSize = driver.findElement(By.xpath("//div[@class = 'input-box']//li[@id='option79']")).getText();
        String correctSize = "M";
        String displayedSize = driver.findElement(By.xpath("//span[@id = 'select_label_size']")).getText();

        assertThat("Expected M size", correctSize, is(exepectedSize));
        assertThat("It is not the same size ",exepectedSize, is(displayedSize));
    }
}