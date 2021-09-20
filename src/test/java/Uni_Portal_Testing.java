import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Uni_Portal_Testing {
    WebDriver driver;
    WebDriverWait wait;

    @Before
    public void setup_ChromeDriver(){
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--headed");
        driver=new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void PortalsTesting() throws InterruptedException {
        driver.get("http://173.254.242.107:81/index.php?logout=1");
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("table.login tbody:nth-child(1) tr:nth-child(2) td:nth-child(3) > input.class1"))).sendKeys("201002243");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("table.login tbody:nth-child(1) tr:nth-child(3) td:nth-child(3) > input.class1"))).sendKeys("Arpon243");

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("table.login tbody:nth-child(1) tr:nth-child(4) td:nth-child(1) center:nth-child(3) > input.class1:nth-child(1)"))).sendKeys(Keys.ENTER);
        Boolean Home = driver.findElement(By.xpath("//b[contains(text(),'Semester:')]")).isDisplayed();
        Assert.assertEquals(Home, true);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Preregistration')]"))).sendKeys(Keys.ENTER);
        boolean Preregistration = driver.findElement(By.xpath("//p[contains(text(),'Preregistration')]")).isDisplayed();
        Assert.assertEquals(Preregistration, true);
        sleep(2000);


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Schedule')]"))).sendKeys(Keys.ENTER);
        Boolean Schedule = driver.findElement(By.xpath("//p[contains(text(),'Class Schedule')]")).isDisplayed();
        Assert.assertEquals(Schedule, true);
        sleep(2000);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Billing')]"))).sendKeys(Keys.ENTER);
        Boolean Billing = driver.findElement(By.xpath("//p[contains(text(),'Billing History')]")).isDisplayed();
        Assert.assertEquals(Billing, true);
        sleep(2000);

        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Result')]"))).sendKeys(Keys.ENTER);
        //sleep(3000);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Profile')]"))).sendKeys(Keys.ENTER);
        Boolean Profile = driver.findElement(By.xpath("//p[contains(text(),'My Profile')]")).isDisplayed();
        Assert.assertEquals(Profile, true);
        sleep(2000);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Teacher Evaluation')]"))).sendKeys(Keys.ENTER);
        Boolean Evaluation = driver.findElement(By.xpath("//p[contains(text(),'Teacher Evaluation Submission')]")).isDisplayed();
        Assert.assertEquals(Evaluation, true);
        sleep(2000);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Logout')]"))).sendKeys(Keys.ENTER);
        Boolean PortalPage = driver.findElement(By.xpath("//tbody//tr//td//h3")).isDisplayed();
        Assert.assertEquals(PortalPage, true);

    }

    @After
    public void finishTest(){
        driver.close();
    }
}