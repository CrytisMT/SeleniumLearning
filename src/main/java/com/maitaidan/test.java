package com.maitaidan;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Created by xinyu.jiang on 2015/11/4.
 */
public class test {
    public static void main(String[] args) {
        RemoteWebDriver remoteWebDriver = new ChromeDriver();
        remoteWebDriver.get("www.baidu.com");

    }
}
