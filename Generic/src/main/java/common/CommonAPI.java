package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public static WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url){
        System.setProperty("webdriver.gecko.driver","/Users/syedahmed/IdeaProjects/SeleniumSep2019/SeleniumProject1/browserdriver/geckodriver");
        driver = new FirefoxDriver();   // ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
    }
    @Test
    public  void  test1(){
        driver.findElement(By.cssSelector(".nav-linksstyles__NavLinkList-sc-1tike8v-2.jJWZwe li:nth-child(4)")).click();
        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        //driver.findElement(By.cssSelector(".nav-input")).click();
    }

    @AfterMethod
    public void cleanUp(){
        driver.quit();
    }

}
