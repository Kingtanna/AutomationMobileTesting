package org.example;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class demo1 {

    private AndroidDriver driver;
    BasePage basePage = new BasePage();
    BaseMainPage baseMainPage;
    //BaseMainPage baseMainPage = new BaseMainPage();
    //BaseSearchPage baseSearchPage = new BaseSearchPage();

    //构造函数，每次调用时自动返回main page

    @BeforeTest
    public void Start()
    {
        try
        {
            //this.driver = basePage.setUp();
            baseMainPage = basePage.setUp();
        }
        catch(MalformedURLException e)
        {
            e.printStackTrace();
        }
    }


    @Test
    public void sampleTest() {
//        try{
//            Thread.sleep(3000);
//        }catch (Exception e)
//        {
//            e.printStackTrace();
//        }


        baseMainPage.GoToSearchPage().Search("alibaba");

    }

    @AfterTest
    public void tearDown() {
        basePage.stop();
    }
}
