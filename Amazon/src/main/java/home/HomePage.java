package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class HomePage extends CommonAPI {

   public void homePage(){

       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
       driver.findElement(By.cssSelector(".nav-input")).click();

   }

}
