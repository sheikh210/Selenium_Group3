package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homepage {

    /*
    Test Case:
        1. Open Browser
        2. Navigate to Amazon.com
        3. Enter keyword into search bar
        4. Click search
     */

    public static WebDriver chromeDriver;
    public static WebDriver geckoDriver;
    public static String url="https://www.amazon.com";

    public static void chromeSetup(String URL) throws Exception
    {
        chromeDriver=new ChromeDriver();
        chromeDriver.get(url);

        Thread.sleep(5000);
    }

    public static void firefoxSetup(String URL) throws Exception
    {
        geckoDriver=new FirefoxDriver();
        geckoDriver.get("https://www.amazon.com");

        Thread.sleep(5000);
    }

    public static void main(String[] args) throws Exception
    {

        // Calls method to launch driver and navigate to URL
        chromeSetup(url);
//        firefoxSetup(url);

        // Gets page title;
        String title=chromeDriver.getTitle();
        System.out.println(title);

        chromeDriver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Hand Sanitizer");

        // Closes one window
//         chromeDriver.close();

        // Closes all windows
        chromeDriver.quit();
//        geckoDriver.quit();
    }
}
