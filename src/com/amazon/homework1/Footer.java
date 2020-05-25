package com.amazon.homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Footer implements Drivers{

    public static void navToCareers() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"https://www.amazon.jobs\"]")).click();
        Thread.sleep(3000);
        String careers=chromeDriver.getCurrentUrl();

        WebElement element = chromeDriver.findElement(By.xpath("//*[@class=\"find-jobs\"][contains(text(),'Find jobs')]"));
        if (element.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Careers***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO CAREERS - CHECK CODE!!!\n");
        }
    }

    public static void navToBlog() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"https://blog.aboutamazon.com/?utm_source=gateway&utm_medium=footer\"]")).click();
        Thread.sleep(3000);

        WebElement element = chromeDriver.findElement(By.xpath("//*[@href=\"https://email.aboutamazon.com/l/637851/2018-10-26/7z82j?Traffic_Source=Blog&Module=hat\"][contains(text(),'Get the latest news')]"));
        if (element.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Blog***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO BLOG!!! - CHECK CODE\n");
        }
    }

    public static void navToAboutAmz() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"https://www.aboutamazon.com/?utm_source=gateway&utm_medium=footer\"]")).click();
        Thread.sleep(3000);

        WebElement element = chromeDriver.findElement(By.xpath("//*[@class=\"ContainerThreeColumn-title\"][contains(text(),'Who we are')]"));
        if (element.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to About Amazon***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO ABOUT AMAZON!!! - CHECK CODE\n");
        }
    }

    public static void navToSellAmz() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/gp/redirect.html?_encoding=UTF8&location=https%3A%2F%2Fsell.amazon.com%2F%3Fld%3DAZFSSOA%26ref_%3Dfooter_soa&source=standards&token=F8DC1C821506E40D2CFF1864EE5EC23698540D23\"][contains(text(),'Sell on Amazon')]")).click();
        Thread.sleep(3000);

        WebElement element = chromeDriver.findElement(By.xpath("//*[@href=\"https://sellercentral.amazon.com/gp/on-board/workflow/Registration/login.html?passthrough%2Faccount=fba_soa&passthrough%2FmarketplaceID=ATVPDKIKX0DER&passthrough%2FsuperSource=OAR&ref_=sdus_soa_hp_rp_pf&passthrough%2Fld=AZFSSOA_SDRP_HP_PF_CONTRAST_C\"]"));
        if (element.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Sell on Amazon***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO SELL ON AMAZON!!! - CHECK CODE\n");
        }
    }

    public static void navToSellAmzAccelerator() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/l/ref=map_1_b2b_GW_FT?_encoding=UTF8&node=17882322011\"][contains(text(),'Sell Under Amazon Accelerator')]")).click();
        Thread.sleep(3000);

        WebElement element = chromeDriver.findElement(By.xpath("//*[@class=\"heading align-center font-size-xlarge color-cloud ember font-bold\"][contains(text(),'Join Amazon Accelerator')]"));
        if (element.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Sell Under Amazon Accelerator***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO SELL UNDER AMAZON ACCELERATOR!!! - CHECK CODE\n");
        }
    }

    public static void navToSellAmzSvc() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/gp/redirect.html?_encoding=UTF8&location=https%3A%2F%2Fsell.amazon.com%2Fprograms%2Fprofessional-services.html%3Fld%3DAZUSVAS-globalfooter%26ref_%3Dfooter_sell_svcs&source=standards&token=3F3E837D604928F43970DDF8BD769D68785D5977\"][contains(text(),'Sell Your Services on Amazon')]")).click();
        Thread.sleep(3000);

        WebElement element = chromeDriver.findElement(By.xpath("//*[@class=\"heading align-start font-size-xxlarge color-squid-ink ember font-heavy\"][contains(text(),'Sell your professional')]"));
        if (element.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Sell Your Services on Amazon***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO SELL YOUR SERVICES ON AMAZON!!! - CHECK CODE\n");
        }
    }

    public static void navToSellAmzBiz() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"https://sell.amazon.com/programs/amazon-business.html?ld=usb2bunifooter&ref_=footer_b2b\"][contains(text(),'Sell on Amazon Business')]")).click();
        Thread.sleep(3000);

        WebElement element = chromeDriver.findElement(By.xpath("//*[@class=\"heading align-start font-size-xxlarge color-white ember font-heavy\"][contains(text(),'Reach millions')]"));
        if (element.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Sell on Amazon Business***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO SELL ON AMAZON BUSINESS!!! - CHECK CODE\n");
        }
    }

    public static void navToAmzVisa() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/iss/credit/rewardscardmember?_encoding=UTF8&plattr=CBFOOT&ref_=footer_cbcc\"][contains(text(),'Amazon Rewards Visa')]")).click();
        Thread.sleep(3000);

        WebElement element = chromeDriver.findElement(By.xpath("//*[@class=\"h1\"][contains(text(),'Amazon Rewards Visa Signature Cards')]"));
        if (element.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Amazon Rewards Visa Signature Cards***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO AMAZON REWARDS VISA SIGNATURE CARDS!!! - CHECK CODE\n");
        }
    }

    public static void navToAmzBizCard() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/dp/B07984JN3L?_encoding=UTF8&ie=UTF-8&plattr=ACOMFO\"][contains(text(),'Amazon Business Card')]")).click();
        Thread.sleep(3000);

        WebElement element = chromeDriver.findElement(By.xpath("//*[@class=\"a-size-extra-large maple-ab__headline maple-ab__headline__font_size_override\"][contains(text(),'Amazon Business')]"));
        if (element.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Amazon Business Card***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO AMAZON BUSINESS CARD!!! - CHECK CODE\n");
        }
    }

    public static void navToAmzComCorpCredit() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/dp/B07CBJQS16?_encoding=UTF8&ie=UTF-8&place=camp&plattr=CCLFOOT&pr=ibprox&ref_=footer_ccl\"][contains(text(),'Amazon.com Corporate Credit')]")).click();
        Thread.sleep(3000);

        WebElement element = chromeDriver.findElement(By.xpath("//*[@id=\"btAsinTitle\"][contains(text(),'Amazon.com Corporate Credit Line')]"));
        if (element.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Amazon.com Corporate Credit Line***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO AMAZON.COM CORPORATE CREDIT LINE!!! - CHECK CODE\n");
        }
    }

    public static void navToShopPoints() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/b?ie=UTF8&node=16218619011&ref_=footer_swp\"][contains(text(),'Shop with Points')]")).click();
        Thread.sleep(3000);

        WebElement element = chromeDriver.findElement(By.xpath("//*[\"bxc-grid__text a-text-center   bxc-grid__text--light\"][contains(text(),'Click on your rewards program to learn more.')]"));
        if (element.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Shop with Points***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO SHOP WITH POINTS!!! - CHECK CODE\n");
        }
    }

    public static void navToShipRatePolicies() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/gp/help/customer/display.html?ie=UTF8&nodeId=468520&ref_=footer_shiprates\"][contains(text(),'Shipping Rates')]")).click();
        Thread.sleep(3000);

        WebElement element = chromeDriver.findElement(By.xpath("//*[@class=\"a-size-medium a-text-bold\"][contains(text(),'Find more solutions')]"));
        if (element.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Shipping Rates & Policies***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO SHIPPING RATES & POLICIES!!! - CHECK CODE\n");
        }
    }

    public static void navToAmzPrime() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/gp/prime?ie=UTF8&ref_=footer_prime\"][contains(text(),'Amazon Prime')]")).click();
        Thread.sleep(3000);

        WebElement element = chromeDriver.findElement(By.xpath("//*[@class=\"prime-cta-signup-button-input\"]"));
        if (element.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Amazon Prime***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO AMAZON PRIME!!! - CHECK CODE\n");
        }
    }

    public static void navToAmzAsst() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/gp/BIT/ref=footer_bit_v2_us_A0029?bitCampaignCode=A0029\"][contains(text(),'Amazon Assistant')]")).click();
        Thread.sleep(3000);

        WebElement element = chromeDriver.findElement(By.xpath("//*[@id=\"oneBAv2-logo\"]"));
        if (element.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Amazon Assistant***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO AMAZON ASSISTANT!!! - CHECK CODE\n");
        }
    }

    public static void navToHelp() throws Exception
    {
        chromeDriver.findElement(By.xpath("//*[@href=\"/gp/help/customer/display.html?ie=UTF8&nodeId=508510&ref_=footer_gw_m_b_he\"][contains(text(),'Help')]")).click();
        Thread.sleep(3000);

        WebElement element = chromeDriver.findElement(By.xpath("//*[@class=\"a-section a-spacing-extra-large a-spacing-top-extra-large ss-landing-container\"]"));
        if (element.isDisplayed()) {
            String title = chromeDriver.getTitle();
            System.out.println(title);
            System.out.println(chromeDriver.getCurrentUrl());
            System.out.println("***Navigated to Help***\n");
        } else {
            System.out.println("!!!COULDN'T NAVIGATE TO HELP!!! - CHECK CODE\n");
        }
    }

}
