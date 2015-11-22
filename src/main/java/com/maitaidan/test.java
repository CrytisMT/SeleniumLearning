package com.maitaidan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Created by xinyu.jiang on 2015/11/4.
 */
public class test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "res/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://www.baidu.com");

    }
}
