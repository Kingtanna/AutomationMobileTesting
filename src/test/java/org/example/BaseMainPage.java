package org.example;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseMainPage extends BaseBasePage {

    //private AndroidDriver driver;

    public BaseMainPage(AndroidDriver driver)
    {
        this.driver = driver;
    }

    String _popup = "com.xueqiu.android:id/image_cancel";
    String _searchInput = "com.xueqiu.android:id/tv_search";

    public BaseSearchPage GoToSearchPage() {
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

       // MobileElement temp = (MobileElement) driver.findElementById("com.xueqiu.android:id/image_cancel");
//        MobileElement temp = FindElement(_popup);
//        temp.click();

        //MobileElement el1 = (MobileElement) driver.findElementById("com.xueqiu.android:id/tv_search");
        MobileElement el1 = FindElement(_searchInput);
        el1.click();
        return new BaseSearchPage(driver);

    }
}
