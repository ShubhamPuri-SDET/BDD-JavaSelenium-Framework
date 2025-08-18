package com.ebay.framework.utility.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driversetup {
    private static WebDriver driver;

    public driversetup() {
        this.driver = new ChromeDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
