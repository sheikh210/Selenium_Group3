package com.amazon.homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class HamburgerMenu implements Drivers {

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

        // Verify we're on the right page & print page title if we are. If not, navigate back to homepage and resume
        WebElement element = chromeDriver.findElement(By.xpath("//*[@class=\"_2-wNMZ\"][contains(text(),'Popular movies')]"));
        if (element.isDisplayed()) {
            String pageTitle = chromeDriver.getTitle();
            System.out.println(pageTitle);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Prime Video (Hamburger Menu)***\n");
            chromeDriver.navigate().back();
            chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO PRIME VIDEO (HAMBURGER MENU)!!! - CHECK CODE\n");
            chromeDriver.navigate().back();
            chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
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

        // Verify we're on the right page & print page title if we are. If not, navigate back to homepage and resume
        WebElement element = chromeDriver.findElement(By.xpath("//*[@href=\"/gp/dmusic/promotions/AmazonMusicUnlimited/?ie=UTF8&ref_=sv_dmusic_1\"]"));
        if (element.isDisplayed()) {
            String pageTitle = chromeDriver.getTitle();
            System.out.println(pageTitle);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Amazon Music Unlimited (Hamburger Menu)***\n");
            chromeDriver.navigate().back();
            chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO AMAZON MUSIC UNLIMITED (HAMBURGER MENU)!!! - CHECK CODE\n");
            chromeDriver.navigate().back();
            chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
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

        // Verify we're on the right page & print page title if we are. If not, navigate back to homepage and resume
        WebElement element = chromeDriver.findElement(By.xpath("//*[@href=\"/s/ref=choice_dp_b?keywords=alexa%20flex\"][contains(text(),'alexa flex')]"));
        if (element.isDisplayed()) {
            String pageTitle = chromeDriver.getTitle();
            System.out.println(pageTitle);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Echo Flex (Hamburger Menu)***\n");
            chromeDriver.navigate().back();
            chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO ECHO FLEX (HAMBURGER MENU)!!! - CHECK CODE\n");
            chromeDriver.navigate().back();
            chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
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

        // Verify we're on the right page & print page title if we are. If not, navigate back to homepage and resume
        WebElement element = chromeDriver.findElement(By.xpath("//*[@id=\"productTitle\"][contains(text(),'Fire HD 10')]"));
        if (element.isDisplayed()) {
            String pageTitle = chromeDriver.getTitle();
            System.out.println(pageTitle);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Fire HD 10 (Hamburger Menu)***\n");
            chromeDriver.navigate().back();
            chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO FIRE HD 10 (HAMBURGER MENU)!!! - CHECK CODE\n");
            chromeDriver.navigate().back();
            chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
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

        // Verify we're on the right page & print page title if we are. If not, navigate back to homepage and resume
        WebElement element = chromeDriver.findElement(By.xpath("//*[@id=\"productTitle\"][contains(text(),'Fire TV Stick 4K')]"));
        if (element.isDisplayed()) {
            String pageTitle = chromeDriver.getTitle();
            System.out.println(pageTitle);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Fire TV Stick 4K (Hamburger Menu)***\n");
            chromeDriver.navigate().back();
            chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO FIRE TV STICK 4K (HAMBURGER MENU)!!! - CHECK CODE\n");
            chromeDriver.navigate().back();
            chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
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
        System.out.println("---Scrolled down to element \"Free Kindle Reading Apps\"---\n");

        // Click Free Kindle Reading Apps
        kindleApps.click();
        chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // Verify we're on the right page & print page title if we are. If not, navigate back to homepage and resume
        WebElement element = chromeDriver.findElement(By.xpath("//*[@src=\"https://images-na.ssl-images-amazon.com/images/G/01/kindle/content/GTM/OnboardingLP/01.1_Desktop_Header.jpg\"]"));
        if (element.isDisplayed()) {
            String pageTitle = chromeDriver.getTitle();
            System.out.println(pageTitle);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Free Kindle Reading Apps (Hamburger Menu)***\n");
            chromeDriver.navigate().back();
            chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO FREE KINDLE READING APPS (HAMBURGER MENU)!!! - CHECK CODE\n");
            chromeDriver.navigate().back();
            chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
    }

    public static void hamburgerAppStore() throws Exception
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

        // Verify we're on the right page & print page title if we are. If not, navigate back to homepage and resume
        WebElement element = chromeDriver.findElement(By.xpath("//*[@id=\"shwcs_\"]"));
        if (element.isDisplayed()) {
            String pageTitle = chromeDriver.getTitle();
            System.out.println(pageTitle);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to All Apps and Games (Hamburger Menu)***\n");
            chromeDriver.navigate().back();
            chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO ALL APPS AND GAMES (HAMBURGER MENU)!!! - CHECK CODE\n");
            chromeDriver.navigate().back();
            chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
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

        // Verify we're on the right page & print page title if we are. If not, navigate back to homepage and resume
        WebElement element = chromeDriver.findElement(By.xpath("//*[@class=\"bkgnd\"][contains(text(),'Amazon Subscribe')]"));
        if (element.isDisplayed()) {
            String pageTitle = chromeDriver.getTitle();
            System.out.println(pageTitle);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Subscribe & Save***\n");
            chromeDriver.navigate().back();
            chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO SUBSCRIBE & SAVE (HAMBURGER MENU)!!! - CHECK CODE\n");
            chromeDriver.navigate().back();
            chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
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

        // Verify we're on the right page & print page title if we are. If not, navigate back to homepage and resume
        WebElement element = chromeDriver.findElement(By.xpath("//*[@id=\"fullStoreHeading\"][contains(text(),'Earth')]"));
        if (element.isDisplayed()) {
            String pageTitle = chromeDriver.getTitle();
            System.out.println(pageTitle);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Full Store Directory (Hamburger Menu)***\n");
            chromeDriver.navigate().back();
            chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO FULL STORE DIRECTORY (HAMBURGER MENU)!!! - CHECK CODE\n");
            chromeDriver.navigate().back();
            chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
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

        // Verify we're on the right page & print page title if we are. If not, navigate back to homepage and resume
        WebElement element = chromeDriver.findElement(By.xpath("//*[@class=\"a-row a-spacing-base\"]//*[contains(text(),'Your Account')]"));
        if (element.isDisplayed()) {
            String pageTitle = chromeDriver.getTitle();
            System.out.println(pageTitle);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Your Account (Hamburger Menu)***\n");
            chromeDriver.navigate().back();
            chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO YOUR ACCOUNT (HAMBURGER MENU)!!! - CHECK CODE\n");
            chromeDriver.navigate().back();
            chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
    }
}
