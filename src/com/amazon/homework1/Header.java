package com.amazon.homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.sql.Driver;
import java.sql.DriverManager;

public class Header implements Drivers {

    public static void navToBestSellers() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers\"]")).click();
        Thread.sleep(3000);

        WebElement element = chromeDriver.findElement(By.xpath("//*[@id=\"zg_banner_text_wrapper\"][text()='Amazon Best Sellers']"));
        if (element.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Best Sellers***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO BEST SELLERS - CHECK CODE!!!\n");
        }
    }

    public static void navToCustSvc() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/gp/help/customer/display.html?nodeId=508510&ref_=nav_cs_customerservice\"]")).click();
        Thread.sleep(3000);

        WebElement element = chromeDriver.findElement(By.xpath("//*[@alt=\"Returns & Refunds\"]"));
        if (element.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Customer Service***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO CUSTOMER SERVICE - CHECK CODE!!!\n");
        }
    }

    public static void navToNewReleases() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/gp/new-releases/?ref_=nav_cs_newreleases\"]")).click();
        Thread.sleep(3000);

        WebElement element = chromeDriver.findElement(By.xpath("//*[@id=\"zg_banner_text_wrapper\"][text()='Amazon Hot New Releases']"));
        if (element.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to New Releases***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO NEW RELEASES - CHECK CODE!!!\n");
        }
    }

    public static void navToFindGift() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/gcx/Gifts-for-Everyone/gfhz/?ref_=nav_cs_giftfinder\"]")).click();
        Thread.sleep(3000);

        WebElement element = chromeDriver.findElement(By.xpath("//*[@class=\"sc-jzJRlG irnHQq\"][text()='Who are you shopping for?']"));
        if (element.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Find A Gift***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO FIND A GIFT - CHECK CODE!!!\n");
        }
    }

    public static void navToWholeFoods() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/alm/storefront?almBrandId=VUZHIFdob2xlIEZvb2Rz&ref_=nav_cs_whole_foods_in_region\"]")).click();
        Thread.sleep(3000);

        WebElement element = chromeDriver.findElement(By.xpath("//*[@src=\"https://images-na.ssl-images-amazon.com/images/G/01/ALMStores/UFG/WFM/Logos/wfm_2line_color.png\"]"));
        if (element.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Whole Foods***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO WHOLE FOODS - CHECK CODE!!!\n");
        }
    }

    public static void navToTodaysDeals() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/gp/goldbox?ref_=nav_cs_gb\"]")).click();
        Thread.sleep(3000);

        WebElement element = chromeDriver.findElement(By.xpath("//*[@class=\"gbh1-bold\"][contains(text(),'Today')]"));
        if (element.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Today's Deals***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO TODAY'S DEALS - CHECK CODE!!!\n");
        }
    }

    public static void navToRegistry() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/gp/browse.html?node=16115931011&ref_=nav_cs_registry\"]")).click();
        Thread.sleep(3000);

        WebElement element = chromeDriver.findElement(By.xpath("//*[@src=\"https://images-na.ssl-images-amazon.com/images/G/01/gift-certificates/consumer/2017/interstitial/Registry_header.png\"]"));
        if (element.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Registry***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO REGISTRY - CHECK CODE!!!\n");
        }
    }

    public static void navToAmazonBasics() throws Exception
    {
        // Get rid of guest sign-in pop-up, before navigating to element hidden underneath it (Amazon Basics Button)

        // Hover over pop-up
        Actions action=new Actions(chromeDriver);
        WebElement element=chromeDriver.findElement(By.cssSelector("#nav-link-accountList > span.nav-line-2"));
        action.moveToElement(element).build().perform();
        System.out.println("---Hovered to remove sign-in popup---\n");

        // Hover over another element (search bar, in this case)
        WebElement element1=chromeDriver.findElement(By.cssSelector("#twotabsearchtextbox"));
        action.moveToElement(element1).build().perform();
        Thread.sleep(3000);

        chromeDriver.findElement(By.xpath("//*[@href=\"/stores/node/2528919011/?field-lbr_brands_browse-bin=AmazonBasics&ref_=nav_cs_amazonbasics\"]")).click();
        Thread.sleep(3000);

        WebElement element2 = chromeDriver.findElement(By.xpath("//*[@src=\"https://m.media-amazon.com/images/S/abs-image-upload-na/d/AmazonStores/ATVPDKIKX0DER/cf24817487741e26ba2ae2e7b9d81c23.w3000.h600._CR0%2C0%2C3000%2C600_SX1500_.jpg\"]"));
        if (element2.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Amazon Basics***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO AMAZON BASICS - CHECK CODE!!!\n");
        }
    }

    public static void navToCoupons() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/Coupons/b/?_encoding=UTF8&node=2231352011&ref_=nav_cs_coupons\"]")).click();
        Thread.sleep(3000);

        WebElement element = chromeDriver.findElement(By.xpath("//*[@id=\"merchandised-content\"]//*[contains(text(),'Amazon Coupons')]"));
        if (element.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Coupons***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO COUPONS - CHECK CODE!!!\n");
        }
    }

    public static void navToFoundOnAmazon() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/finds?ref_=nav_cs_foundit\"]")).click();
        Thread.sleep(3000);

        WebElement element = chromeDriver.findElement(By.xpath("//*[@class=\"a-size-small glimpse-fiona-navigation-text-color a-text-caps\"][contains(text(),'Favorites')]"));
        if (element.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to #FoundItOnAmazon***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO #FOUNDITONAMAZON - CHECK CODE!!!\n");
        }
    }
}
