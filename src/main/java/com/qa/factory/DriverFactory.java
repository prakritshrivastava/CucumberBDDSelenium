package com.qa.factory;

import com.qa.util.TestUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {


    public WebDriver driver;

    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    /**
     * Initialize the browser instance;
     * @param browserName name of the browser obtained from the config file
     * @return the WebDriver instance
     */
    public WebDriver initialize(String browserName){

        browserName=browserName.toLowerCase();

        switch (browserName) {

            case "chrome" -> {
                System.out.println("Test to be executed using ChromeDriver");
                WebDriverManager.chromedriver().setup();
                tlDriver.set(new ChromeDriver());
            }
            case "edge" -> {
                System.out.println("Test to be executed using Edge Driver");
                WebDriverManager.edgedriver().setup();
                tlDriver.set(new EdgeDriver());
            }
            default -> {
                System.out.println("Valid browser options: chrome/edge");
            }
        }

        getDriver().manage().deleteAllCookies();
        getDriver().manage().timeouts().pageLoadTimeout(TestUtil.pageLoadTimeout, TimeUnit.SECONDS);
        getDriver().manage().timeouts().implicitlyWait(TestUtil.implicitWait,TimeUnit.SECONDS);
        getDriver().manage().window().maximize();
        return getDriver();

    }

    /**
     * Get instance of the driver
     * @return Current WebDriver Instance
     */
    public static WebDriver getDriver(){
        return tlDriver.get();
    }
}
