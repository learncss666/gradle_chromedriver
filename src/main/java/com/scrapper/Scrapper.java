package com.scrapper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrapper {
    public static void main(String[] args)
    {
        String x = "hello world lol";
        System.out.println(x);
        //System.setProperty("webdriver.chrome.driver", "C:/Users/tgmjack/Desktop/jda test/q4/chromedriver.exe"); // ive tried with and without this line 
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
    }
}

