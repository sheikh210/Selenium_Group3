package com.amazon.homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class TestClass implements Drivers {

    public static String url="http://www.amazon.com/";
    static Header header = new Header();
    static Footer footer = new Footer();
    static HamburgerMenu hMenu = new HamburgerMenu();
    static ItemListing itemList = new ItemListing();
    static ShoppingCart cart = new ShoppingCart();

    public static void goBack()
    {
        chromeDriver.navigate().back();
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public static void deleteAllCookies()
    {
        chromeDriver.manage().deleteAllCookies();
        System.out.println("All Cookies Cleared\n");
    }
    public static void main(String[] args) throws Exception
    {
        deleteAllCookies();
        chromeDriver.get(url);
        System.out.println("Navigated to "+url+"\n");
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        System.out.println("**********Starting Header Test Cases**********\n");

        // Test Case 1
        header.navToBestSellers();
        goBack();

        // Test Case 2
        header.navToCustSvc();
        goBack();

        // Test Case 3
        header.navToNewReleases();
        goBack();

        // Test Case 4
        header.navToFindGift();
        goBack();

        // Test Case 5
        header.navToWholeFoods();
        goBack();

        // Test Case 6
        header.navToTodaysDeals();
        goBack();

        // Test Case 7
        header.navToRegistry();
        goBack();

        // Test Case 8
        header.navToAmazonBasics();
        goBack();

        // Test Case 9
        header.navToCoupons();
        goBack();

        // Test Case 10
        header.navToFoundOnAmazon();
        goBack();

        System.out.println("**********Completed Header Test Cases**********\n");
        System.out.println("\n**********Starting Hamburger Menu Test Cases**********\n");

        // Test Case 11
        hMenu.hamburgerPrimeVideo();

        // Test Case 12
        hMenu.hamburgerAmzMusicUnlimited();

        // Test Case 13
        hMenu.hamburgerEchoFlex();

        // Test Case 14
        hMenu.hamburgerFireHD10();

        // Test Case 15
        hMenu.hamburgerFireTvStick4k();

        // Test Case 16
        hMenu.hamburgerKindleReadingApps();

        // Test Case 17
        hMenu.hamburgerAppStore();

        // Test Case 18
        hMenu.hamburgerSubscribe();

        // Test Case 19
        hMenu.hamburgerFullStore();

        // Test Case 20
        hMenu.hamburgerAccount();

        System.out.println("**********Completed Hamburger Menu Cases**********\n");
        System.out.println("\n**********Starting Footer Test Cases**********\n");

        // Test Case 21
        footer.navToCareers();
        goBack();

        // Test Case 22
        footer.navToBlog();
        goBack();

        // Test Case 23
        footer.navToAboutAmz();
        goBack();

        // Test Case 24
        footer.navToSellAmz();
        goBack();

        // Test Case 25
        footer.navToSellAmzAccelerator();
        goBack();

        // Test Case 26
        footer.navToSellAmzSvc();
        goBack();

        // Test Case 27
        footer.navToSellAmzBiz();
        goBack();

        // Test Case 28
        footer.navToAmzVisa();
        goBack();

        // Test Case 29
        footer.navToAmzBizCard();
        goBack();

        // Test Case 30
        footer.navToAmzComCorpCredit();
        goBack();

        // Test Case 31
        footer.navToShopPoints();
        goBack();

        // Test Case 32
        footer.navToShipRatePolicies();
        goBack();

        // Test Case 33
        footer.navToAmzPrime();
        goBack();

        // Test Case 34
        footer.navToAmzAsst();
        goBack();

        // Test Case 35
        footer.navToHelp();
        goBack();

        // Test Case 36

        // Test Case 37

        // Test Case 38

        // Test Case 39

        // Test Case 40

        // Test Case 41

        // Test Case 42

        // Test Case 43

        // Test Case 44

        // Test Case 45

        // Test Case 46

        // Test Case 47

        // Test Case 48

        // Test Case 49

        // Test Case 50



        // Close driver
        chromeDriver.close();

        // OPTIONAL: End all driver tasks on local machine
//        Runtime.getRuntime().exec("taskkill /F /M chromedriver.exe /T");
    }
}
