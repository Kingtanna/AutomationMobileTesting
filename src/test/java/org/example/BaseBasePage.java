package org.example;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.rules.Timeout;
import org.openqa.selenium.*;

public class BaseBasePage {

    public AndroidDriver driver;

    String _popup = "com.xueqiu.android:id/image_cancel";

//    public MobileElement FindElementById(String selector, Timeout time)
//    {
//        Element
//    }

    public MobileElement FindElement(String selector)
    {
        //return (MobileElement) driver.findElementById(selector);
        try{
            Thread.sleep(3000);
            return (MobileElement) driver.findElementById(selector);


        }
        catch(Exception e)
        {
            HandlePopUpWindow();
            return (MobileElement) driver.findElementById(selector);
        }
    }

    public void HandlePopUpWindow()
    {
        MobileElement popUp = FindElement(_popup);
        if(popUp.isDisplayed())
        {
            popUp.click();
        }else{
            System.out.println("No Popup");
        }
    }

}
