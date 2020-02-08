package com.example.projects;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AutomationTest {

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Itay\\Desktop\\selenimDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8181/itay_meshulam/");
        driver.manage().window().setSize(new Dimension(708, 728));
        driver.findElement(By.name("author")).click();
        driver.findElement(By.cssSelector("input:nth-child(4)")).click();
        assertThat(driver.findElement(By.cssSelector("li")).getText(), is("Tan Ah Teck"));
        driver.findElement(By.linkText("BACK")).click();
        driver.findElement(By.cssSelector("input:nth-child(3)")).click();
        driver.findElement(By.cssSelector("input:nth-child(4)")).click();
        assertThat(driver.findElement(By.cssSelector("li")).getText(), is("Kumar"));
        driver.findElement(By.linkText("BACK")).click();
        driver.findElement(By.cssSelector("input:nth-child(2)")).click();
        driver.findElement(By.cssSelector("input:nth-child(4)")).click();
        assertThat(driver.findElement(By.cssSelector("li")).getText(), is("Mohd Ali"));
    }

}