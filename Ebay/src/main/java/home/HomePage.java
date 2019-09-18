package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage extends CommonAPI {

    public void homePage(){

        //driver.getTitle();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone", Keys.ENTER);
    }

}
