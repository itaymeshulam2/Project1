package com.example.projects;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class AutomationTest {


        @Test
        public void  Automation() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Itay\\Desktop\\selenimDrivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://localhost:8081/admin/checks.xhtml?page=18");

            driver.findElement(By.name("username")).sendKeys("admin");
            driver.findElement(By.name("username")).sendKeys(Keys.ENTER);
            driver.findElement(By.name("password")).sendKeys("admin");
            driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
            driver.findElement(By.cssSelector(".fa-play")).click();



}

        }


