package day02;

import Utilities.DriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class TestResizable extends DriverClass {

    @Test
    public void ResizingFunctionality() {

        driver.get("https://demoqa.com/resizable/");

        Actions action = new Actions(driver);

        WebElement resizeHandle = driver.findElement(By.xpath("//*[@id=\"resizableBoxWithRestriction\"]/span"));

        action.clickAndHold(resizeHandle).moveByOffset(100, 0).release().perform();


        action.clickAndHold(resizeHandle).moveByOffset(0, 100).release().perform();

        action.clickAndHold(resizeHandle).moveByOffset(-150,-150).release().perform(); //expected min value of offset is 150.




    }

}
