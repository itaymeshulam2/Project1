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
            driver.get("http://localhost:8081/");
    driver.manage().window().setSize(new Dimension(1296, 728));
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("username")).sendKeys(Keys.ENTER);
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
    driver.findElement(By.linkText("Manage pages")).click();
    driver.findElement(By.id("pageForm:j_idt23")).click();
    driver.findElement(By.id("pageForm:j_idt23")).sendKeys("project");
    driver.findElement(By.cssSelector(".ui-button-text:nth-child(1)")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".ui-button-text:nth-child(1)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.linkText("project")).click();
    driver.findElement(By.cssSelector("#j_idt28\\3Aj_idt29_button > .ui-button-text")).click();
    driver.findElement(By.cssSelector(".ui-state-hover .ui-menuitem-text")).click();
    driver.findElement(By.id("checkFormSingle:j_idt111:j_idt118")).click();
    driver.findElement(By.id("checkFormSingle:j_idt111:j_idt118")).sendKeys("test");
    driver.findElement(By.id("checkFormSingle:j_idt111:j_idt120")).click();
    driver.findElement(By.id("checkFormSingle:j_idt111:j_idt120")).sendKeys("http://localhost:8181/itay_meshulam");
    driver.findElement(By.id("checkFormSingle:j_idt111:j_idt128")).click();
    driver.findElement(By.id("checkFormSingle:j_idt111:j_idt128")).sendKeys("<html>");
    driver.findElement(By.cssSelector("#checkFormSingle\\3Asave > .ui-button-text")).click();


}

        }


