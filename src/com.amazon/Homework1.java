package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Homework1 {

    public static WebDriver chromeDriver=new ChromeDriver();
    public static String url="http://www.amazon.com/";

    public static void goBack()
    {
        chromeDriver.navigate().back();
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public static void hamburgerGoBack()
    {
        WebElement hamburgerBack = chromeDriver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible.hmenu-translateX > li:nth-child(1) > a"));
        hamburgerBack.click();
        chromeDriver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    }

    public static void navToBestSellers() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers\"]")).click();
        Thread.sleep(3000);
        String bestSellURL = "https://www.amazon.com/gp/bestsellers/?ref_=nav_cs_bestsellers";

        WebElement element = chromeDriver.findElement(By.xpath("//*[@id=\"zg_banner_text_wrapper\"][text()='Amazon Best Sellers']"));
        if (element.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Best Sellers***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO BEST SELLERS - CHECK CODE!!!");
        }
    }

    public static void navToCustSvc() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/gp/help/customer/display.html?nodeId=508510&ref_=nav_cs_customerservice\"]")).click();
        Thread.sleep(3000);
        String custSvcURL = "https://www.amazon.com/gp/help/customer/display.html?nodeId=508510&ref_=nav_cs_customerservice";

        WebElement element = chromeDriver.findElement(By.xpath("//*[@alt=\"Returns & Refunds\"]"));
        if (element.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Customer Service***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO CUSTOMER SERVICE - CHECK CODE!!!");
        }
    }

    public static void navToNewReleases() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/gp/new-releases/?ref_=nav_cs_newreleases\"]")).click();
        Thread.sleep(3000);
        String newReleasesURL = "https://www.amazon.com/gp/new-releases/?ref_=nav_cs_newreleases";

        WebElement element = chromeDriver.findElement(By.xpath("//*[@id=\"zg_banner_text_wrapper\"][text()='Amazon Hot New Releases']"));
        if (element.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to New Releases***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO NEW RELEASES - CHECK CODE!!!");
        }
    }

    public static void navToFindGift() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/gcx/Gifts-for-Everyone/gfhz/?ref_=nav_cs_giftfinder\"]")).click();
        Thread.sleep(3000);
        String findGiftURL = "https://www.amazon.com/gcx/Gifts-for-Everyone/gfhz/?ref_=nav_cs_giftfinder";

        WebElement element = chromeDriver.findElement(By.xpath("//*[@class=\"sc-jzJRlG irnHQq\"][text()='Who are you shopping for?']"));
        if (element.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Find A Gift***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO FIND A GIFT - CHECK CODE!!!");
        }
    }

    public static void navToWholeFoods() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/alm/storefront?almBrandId=VUZHIFdob2xlIEZvb2Rz&ref_=nav_cs_whole_foods_in_region\"]")).click();
        Thread.sleep(3000);

        WebElement element = chromeDriver.findElement(By.xpath(""));
        String title=chromeDriver.getTitle();
        System.out.println(title);
        System.out.println(chromeDriver.getCurrentUrl());
        System.out.println("***Navigated to Whole Foods***\n");
    }

    public static void navToTodaysDeals() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/gp/goldbox?ref_=nav_cs_gb\"]")).click();
        Thread.sleep(3000);

        String title=chromeDriver.getTitle();
        System.out.println(title);
        System.out.println(chromeDriver.getCurrentUrl());
        System.out.println("***Navigated to Today's Deals***\n");
    }

    public static void navToRegistry() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/gp/browse.html?node=16115931011&ref_=nav_cs_registry\"]")).click();
        Thread.sleep(3000);

        String title=chromeDriver.getTitle();
        System.out.println(title);
        System.out.println(chromeDriver.getCurrentUrl());
        System.out.println("***Navigated to Registry***\n");
    }

    public static void navToAmazonBasics() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/stores/node/2528919011/?field-lbr_brands_browse-bin=AmazonBasics&ref_=nav_cs_amazonbasics\"]")).click();
        Thread.sleep(3000);

        String title=chromeDriver.getTitle();
        System.out.println(title);
        System.out.println(chromeDriver.getCurrentUrl());
        System.out.println("***Navigated to Amazon Basics***\n");
    }

    public static void navToCoupons() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/Coupons/b/?_encoding=UTF8&node=2231352011&ref_=nav_cs_coupons\"]")).click();
        Thread.sleep(3000);

        String title=chromeDriver.getTitle();
        System.out.println(title);
        System.out.println(chromeDriver.getCurrentUrl());
        System.out.println("***Navigated to Coupons***\n");
    }

    public static void navToFoundOnAmazon() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/finds?ref_=nav_cs_foundit\"]")).click();
        Thread.sleep(3000);

        String title=chromeDriver.getTitle();
        System.out.println(title);
        System.out.println(chromeDriver.getCurrentUrl());
        System.out.println("***Navigated to #FoundItOnAmazon***\n");
    }

    public static void hamburgerPrimeVideo() throws Exception
    {
        // Click Hamburger Menu icon
        WebElement hamburgerMenu = chromeDriver.findElement(By.cssSelector("#nav-hamburger-menu > i"));
        hamburgerMenu.click();
        Thread.sleep(3000);

        // Click Prime Video
        WebElement primeVideo = chromeDriver.findElement(By.xpath("//*[@class=\"hmenu-item\"]//*[text()='Prime Video']"));
        primeVideo.click();
        Thread.sleep(3000);

        // Click Prime Video (in sub-menu of Prime Video)
        WebElement primeVideoSub = chromeDriver.findElement(By.xpath("//*[@href=\"/Amazon-Video/s/browse?node=2858778011&ref_=nav_em_0_2_2_2__aiv\"]"));
        primeVideoSub.click();
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // Print page title
        String pageTitle=chromeDriver.getTitle();
        System.out.println(pageTitle);
        System.out.println(chromeDriver.getCurrentUrl());
        System.out.println("***Navigated to Prime Video (Hamburger Menu)***\n");

        // Navigate back to homepage
        chromeDriver.navigate().back();
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public static void hamburgerAmzMusicUnlimited() throws Exception
    {
        // Click Hamburger Menu icon
        WebElement hamburgerMenu = chromeDriver.findElement(By.cssSelector("#nav-hamburger-menu > i"));
        hamburgerMenu.click();
        Thread.sleep(3000);

        // Click Amazon Music
        WebElement amzMusic = chromeDriver.findElement(By.xpath("//*[@class=\"hmenu-item\"]//*[text()='Amazon Music']"));
        amzMusic.click();
        Thread.sleep(3000);

        // Click Amazon Music Unlimited
        WebElement amzMusicUnlimited = chromeDriver.findElement(By.xpath("//*[@href=\"/gp/dmusic/promotions/AmazonMusicUnlimited?ref_=nav_em_0_2_3_2__dm_hf\"]"));
        amzMusicUnlimited.click();
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // Print page title
        String pageTitle=chromeDriver.getTitle();
        System.out.println(pageTitle);
        System.out.println(chromeDriver.getCurrentUrl());
        System.out.println("***Navigated to Amazon Music Unlimited (Hamburger Menu)***\n");

        // Navigate back to homepage
        chromeDriver.navigate().back();
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public static void hamburgerEchoFlex() throws Exception
    {
        // Click Hamburger Menu icon
        WebElement hamburgerMenu = chromeDriver.findElement(By.cssSelector("#nav-hamburger-menu > i"));
        hamburgerMenu.click();
        Thread.sleep(3000);

        // Click Echo & Alexa
        WebElement echoAlexa = chromeDriver.findElement(By.xpath("//*[@class=\"hmenu-item\"]//*[text()='Echo & Alexa']"));
        echoAlexa.click();
        Thread.sleep(3000);

        // Click Echo Flex
        WebElement echoFlex = chromeDriver.findElement(By.xpath("//*[@href=\"/dp/B07MLY3JKV?ref_=nav_em_0_2_4_5__ods_ha_echo_ct\"]"));
        echoFlex.click();
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // Print page title
        String pageTitle=chromeDriver.getTitle();
        System.out.println(pageTitle);
        System.out.println(chromeDriver.getCurrentUrl());
        System.out.println("***Navigated to Echo Flex (Hamburger Menu)***\n");

        // Navigate back to homepage
        chromeDriver.navigate().back();
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public static void hamburgerFireHD10() throws Exception
    {
        // Click Hamburger Menu icon
        WebElement hamburgerMenu = chromeDriver.findElement(By.cssSelector("#nav-hamburger-menu > i"));
        hamburgerMenu.click();
        Thread.sleep(3000);

        // Click Fire Tablets
        WebElement fireTablets = chromeDriver.findElement(By.xpath("//*[@class=\"hmenu-item\"]//*[text()='Fire Tablets']"));
        fireTablets.click();
        Thread.sleep(3000);

        // Click Fire HD 10
        WebElement fireHD10 = chromeDriver.findElement(By.xpath("//*[@href=\"/dp/B07K1RZWMC?ref_=nav_em_0_2_5_5__k_ods_tab_mk\"]"));
        fireHD10.click();
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // Print page title
        String pageTitle=chromeDriver.getTitle();
        System.out.println(pageTitle);
        System.out.println(chromeDriver.getCurrentUrl());
        System.out.println("***Navigated to Fire HD 10 (Hamburger Menu)***\n");

        // Navigate back to homepage
        chromeDriver.navigate().back();
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public static void hamburgerFireTvStick4k() throws Exception
    {
        // Click Hamburger Menu icon
        WebElement hamburgerMenu = chromeDriver.findElement(By.cssSelector("#nav-hamburger-menu > i"));
        hamburgerMenu.click();
        Thread.sleep(3000);

        // Click Fire TV
        WebElement fireTv = chromeDriver.findElement(By.xpath("//*[@class=\"hmenu-item\"]//*[text()='Fire TV']"));
        fireTv.click();
        Thread.sleep(3000);

        // Click Fire TV Stick 4K
        WebElement fireTvStick4k = chromeDriver.findElement(By.xpath("//*[@href=\"/dp/B079QHML21?ref_=nav_em_0_2_6_3__ods_smp_mt_nav\"]"));
        fireTvStick4k.click();
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // Print page title
        String pageTitle=chromeDriver.getTitle();
        System.out.println(pageTitle);
        System.out.println(chromeDriver.getCurrentUrl());
        System.out.println("***Navigated to Fire TV Stick 4K (Hamburger Menu)***\n");

        // Navigate back to homepage
        chromeDriver.navigate().back();
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public static void hamburgerKindleReadingApps() throws Exception
    {
        // Click Hamburger Menu icon
        WebElement hamburgerMenu = chromeDriver.findElement(By.cssSelector("#nav-hamburger-menu > i"));
        hamburgerMenu.click();
        Thread.sleep(3000);

        // Click Kindle E-readers & Books
        WebElement kindle = chromeDriver.findElement(By.xpath("//*[@class=\"hmenu-item\"]//*[text()='Kindle E-readers & Books']"));
        kindle.click();
        Thread.sleep(3000);

        // Scroll down page until "Free Kindle Reading Apps" element is visible
        WebElement kindleApps = chromeDriver.findElement(By.xpath("//*[@href=\"/gp/feature.html?docId=1000493771&ref_=nav_em_0_2_7_13__ods_eink_con_karl\"]"));
        JavascriptExecutor js=(JavascriptExecutor) chromeDriver;
        js.executeScript("arguments[0].scrollIntoView();",kindleApps);
        Thread.sleep(3000);
        System.out.println("Scrolled down to element \"Free Kindle Reading Apps\"\n");

        // Click Free Kindle Reading Apps
        kindleApps.click();
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // Print page title
        String pageTitle=chromeDriver.getTitle();
        System.out.println(pageTitle);
        System.out.println(chromeDriver.getCurrentUrl());
        System.out.println("***Navigated to Free Kindle Reading Apps (Hamburger Menu)***\n");

        // Navigate back to homepage
        chromeDriver.navigate().back();
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public static void hamburgerAppstore() throws Exception
    {
        // Click Hamburger Menu icon
        WebElement hamburgerMenu = chromeDriver.findElement(By.cssSelector("#nav-hamburger-menu > i"));
        hamburgerMenu.click();
        Thread.sleep(3000);

        // Click Appstore for Android
        WebElement appstore = chromeDriver.findElement(By.xpath("//*[@class=\"hmenu-item\"]//*[text()='Appstore for Android']"));
        appstore.click();
        Thread.sleep(3000);

        // Click All Apps and Games
        WebElement allApps = chromeDriver.findElement(By.xpath("//*[@class=\"hmenu-item\"][contains(text(),'All Apps and Games')]"));
        allApps.click();
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // Print page title
        String pageTitle=chromeDriver.getTitle();
        System.out.println(pageTitle);
        System.out.println(chromeDriver.getCurrentUrl());
        System.out.println("***Navigated to All Apps and Games (Hamburger Menu)***\n");

        // Navigate back to homepage
        chromeDriver.navigate().back();
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public static void hamburgerSubscribe() throws Exception
    {
        // Click Hamburger Menu icon
        WebElement hamburgerMenu = chromeDriver.findElement(By.cssSelector("#nav-hamburger-menu > i"));
        hamburgerMenu.click();
        Thread.sleep(3000);

        // Click Subscribe & Save
        WebElement subscribe = chromeDriver.findElement(By.xpath("//*[@class=\"hmenu-item\"][contains(text(),'Subscribe & Save')]"));
        subscribe.click();
        Thread.sleep(3000);

        // Print page title
        String pageTitle=chromeDriver.getTitle();
        System.out.println(pageTitle);
        System.out.println(chromeDriver.getCurrentUrl());
        System.out.println("***Navigated to Subscribe & Save***\n");
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // Navigate back to homepage
        chromeDriver.navigate().back();
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public static void hamburgerFullStore() throws Exception
    {
        // Click Hamburger Menu icon
        WebElement hamburgerMenu = chromeDriver.findElement(By.cssSelector("#nav-hamburger-menu > i"));
        hamburgerMenu.click();
        Thread.sleep(3000);

        // Scroll down page until "Full Store Directory" element is visible
        WebElement fullStore = chromeDriver.findElement(By.xpath("//*[@class=\"hmenu-item\"][contains(text(),'Full Store Directory')]"));
        JavascriptExecutor js=(JavascriptExecutor) chromeDriver;
        js.executeScript("arguments[0].scrollIntoView();",fullStore);
        Thread.sleep(3000);
        System.out.println("Scrolled down to element \"Full Store Directory\"\n");

        // Click Full Store Directory
        fullStore.click();
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // Print page title
        String pageTitle=chromeDriver.getTitle();
        System.out.println(pageTitle);
        System.out.println(chromeDriver.getCurrentUrl());
        System.out.println("***Navigated to Full Store Directory (Hamburger Menu)***\n");

        // Navigate back to homepage
        chromeDriver.navigate().back();
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public static void hamburgerAccount() throws Exception
    {
        // Click Hamburger Menu icon
        WebElement hamburgerMenu = chromeDriver.findElement(By.cssSelector("#nav-hamburger-menu > i"));
        hamburgerMenu.click();
        Thread.sleep(3000);

        // Scroll down page until "Your Account" element is visible
        WebElement yourAccount = chromeDriver.findElement(By.xpath("//*[@class=\"hmenu-item\"][contains(text(),'Your Account')]"));
        JavascriptExecutor js=(JavascriptExecutor) chromeDriver;
        js.executeScript("arguments[0].scrollIntoView();",yourAccount);
        Thread.sleep(3000);
        System.out.println("Scrolled down to element \"Your Account\"\n");

        // Click Full Store Directory
        yourAccount.click();
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // Print page title
        String pageTitle=chromeDriver.getTitle();
        System.out.println(pageTitle);
        System.out.println(chromeDriver.getCurrentUrl());
        System.out.println("***Navigated to Your Account (Hamburger Menu)***\n");

        // Navigate back to homepage
        chromeDriver.navigate().back();
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public static void main(String[] args) throws Exception
    {
        chromeDriver.get(url);
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Test Case 1
        navToBestSellers();
        goBack();

        // Test Case 2
        navToCustSvc();
        goBack();

        // Test Case 3
        navToNewReleases();
        goBack();

        // Test Case 4
        navToFindGift();
        goBack();

        // Test Case 5
        navToWholeFoods();
        goBack();

        // Test Case 6
        navToTodaysDeals();
        goBack();

        // Test Case 7
        navToRegistry();
        goBack();

        // Get rid of guest sign-in pop-up, before navigating to element hidden underneath it (Amazon Basics Button)
        Actions action=new Actions(chromeDriver);
        WebElement element=chromeDriver.findElement(By.cssSelector("#nav-link-accountList > span.nav-line-2"));
        action.moveToElement(element).build().perform();
        WebElement element1=chromeDriver.findElement(By.cssSelector("#twotabsearchtextbox"));
        action.moveToElement(element1).build().perform();
        Thread.sleep(5000);
        System.out.println("---Hovered to remove sign-in popup---\n");

        // Test Case 8
        navToAmazonBasics();
        goBack();

        // Test Case 9
        navToCoupons();
        goBack();

        // Test Case 10
        navToFoundOnAmazon();
        goBack();

        System.out.println("**********Completed Header Test Cases**********\n");
        System.out.println("\n**********Starting Hamburger Menu Test Cases**********\n");

        // Test Case 11
        hamburgerPrimeVideo();

        // Test Case 12
        hamburgerAmzMusicUnlimited();

        // Test Case 13
        hamburgerEchoFlex();

        // Test Case 14
        hamburgerFireHD10();

        // Test Case 15
        hamburgerFireTvStick4k();

        // Test Case 16
        hamburgerKindleReadingApps();

        // Test Case 17
        hamburgerAppstore();

        // Test Case 18
        hamburgerSubscribe();

        // Test Case 19
        hamburgerFullStore();

        // Test Case 20
        hamburgerAccount();

        // Close driver
        chromeDriver.close();

        // OPTIONAL: End all driver tasks on local machine
//        Runtime.getRuntime().exec("taskkill /F /M chromedriver.exe /T");
    }
}
