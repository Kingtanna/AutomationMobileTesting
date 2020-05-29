package org.example;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

class BaseSearchPage extends BaseBasePage {
    //private AndroidDriver driver;

    public BaseSearchPage()
    {

    }

    public BaseSearchPage(AndroidDriver driver)
    {
        this.driver = driver;
    }

    String _searchInputText = "com.xueqiu.android:id/search_input_text";

    public void Search(String str)
    {
        //MobileElement el2 = (MobileElement) driver.findElementById("com.xueqiu.android:id/search_input_text");
        MobileElement el2 = FindElement(_searchInputText);
        el2.sendKeys(str);
    }

}