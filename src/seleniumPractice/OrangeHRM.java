package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class OrangeHRM {

    /*
     Test Case 1 - Login
        1. Open browser
        2. Navigate to "https://opensource-demo.orangehrmlive.com/"
        3. Log in (Username: Admin | PW: admin123)
     */

    public static WebDriver chromeDriver = new ChromeDriver();
    public static String url = "https://opensource-demo.orangehrmlive.com/";
    public static String url2="https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407";
    private static String username="Admin";
    private static String pw="admin123";

    public static void main(String[] args) throws Exception
    {
//        chromeDriver.get(url);
        Thread.sleep(3000);
        volunteer();
//        login();

//        chromeDriver.close();
    }
    public static void login()
    {
       WebElement element = chromeDriver.findElement(By.xpath("//*[@src=\"/webres_5e7b15c4882d04.47780062/themes/default/images/login/logo.png\"]"));
       if (element.isDisplayed()){
           System.out.println("Successfully navigated to Orange HRM");
       } else {
           System.out.println("Navigation Failed");
       }
       // Find Username input box
       WebElement usernameInput = chromeDriver.findElement(By.id("txtUsername"));
       // Enter username in input box
       usernameInput.sendKeys(username);
       // Enter password in password input box
       chromeDriver.findElement(By.name("txtPassword")).sendKeys(pw);

       // Press login button
        chromeDriver.findElement(By.name("Submit")).click();

        String currentURL=chromeDriver.getCurrentUrl();
        if (currentURL.equals("https://opensource-demo.orangehrmlive.com/index.php/dashboard")) {
            System.out.println(currentURL);
            String title = chromeDriver.getTitle();
            System.out.println(title);
        } else {
            System.out.println("TEST CASE FAILED");
        }
    }

    public static void volunteer() throws Exception
    {
//        chromeDriver.get(url2);
        chromeDriver.navigate().to(url2);
        chromeDriver.manage().window().maximize();


        WebElement element = chromeDriver.findElement(By.xpath("//*[@style=\"font-size:36px;font-family:'Open Sans',sans-serif;padding:20px 1em ;\"][text()='Volunteer Sign Up']"));
        if (element.isDisplayed()){
            System.out.println("Successfully navigated to volunteer sign-up");
        } else {
            System.out.println("TEST CASE FAILED");
        }

        chromeDriver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("Rashid");
        chromeDriver.findElement(By.xpath("//input[@id='RESULT_TextField-2']")).sendKeys("Sarkar");

        Thread.sleep(3000);

        chromeDriver.findElement(By.xpath("//input[@id='RESULT_TextField-3']")).sendKeys("555-555-5555");
        Thread.sleep(3000);

        chromeDriver.findElement(By.xpath("//input[@id='RESULT_TextField-4']")).sendKeys("USA");
        Thread.sleep(3000);

        chromeDriver.findElement(By.xpath("//input[@id='RESULT_TextField-5']")).sendKeys("New Hyde Park");
        Thread.sleep(3000);

        chromeDriver.findElement(By.xpath("//input[@id='RESULT_TextField-6']")).sendKeys("abc123@gmail.com");
        Thread.sleep(3000);

        WebElement element1=chromeDriver.findElement(By.xpath("//label[contains(text(),'Best Time to Contact')]"));
        JavascriptExecutor js=(JavascriptExecutor) chromeDriver;
        js.executeScript("arguments[0].scrollIntoView()",element1);

        // Ensuring Radio buttons are present on page
        WebElement maleRadio = chromeDriver.findElement(By.xpath("//label[contains(text(),'Male')]"));
        // Confirming male radio button element is displayed
        System.out.println(maleRadio.isDisplayed());
        // Confirming whether male radio button is enabled or not
        System.out.println(maleRadio.isEnabled());
        // Confirming whether radio button is empty
        System.out.println("Male Radio Button selected is: "+maleRadio.isSelected());
        // Click the radio button
        maleRadio.click();
        Thread.sleep(5000);

        WebElement sun=chromeDriver.findElement(By.xpath("//label[contains(text(),'Sunday')]"));
        WebElement mon=chromeDriver.findElement(By.xpath("//label[contains(text(),'Monday')]"));
        WebElement tues=chromeDriver.findElement(By.xpath("//label[contains(text(),'Tuesday')]"));
        WebElement wed=chromeDriver.findElement(By.xpath("//label[contains(text(),'Wednesday')]"));
        WebElement thurs=chromeDriver.findElement(By.xpath("//label[contains(text(),'Thursday')]"));
        WebElement fri=chromeDriver.findElement(By.xpath("//label[contains(text(),'Friday')]"));
        WebElement sat=chromeDriver.findElement(By.xpath("//label[contains(text(),'Saturday')]"));
        System.out.println(sat.isEnabled());
        System.out.println(sat.isSelected());
        mon.click();
        tues.click();
        fri.click();
        sat.click();

        // Handling Drop-Down Menu
        WebElement dropdown=chromeDriver.findElement(By.xpath("//select[@id='RESULT_RadioButton-9']"));
        // Finding out how many total options available in dropdown
        Select selectDropdown=new Select(dropdown);
        System.out.println("Dropdown number of options are: "+selectDropdown.getOptions().size());
        List<WebElement> dropdownOptions=selectDropdown.getOptions();
        for(WebElement e:dropdownOptions){
            System.out.println(e.getText());
        }
        selectDropdown.selectByVisibleText("Afternoon");
    }
}


