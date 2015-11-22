package JDAutoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by xinyu.jiang on 2015/11/22.
 */
public class RunTest {
    jdIndex jdIndex;

    @BeforeTest
    void init(){
        System.setProperty("webdriver.chrome.driver", "res/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://www.jd.com");
        WebElement loginElement = webDriver.findElement(By.id("ttbar-login"));
        loginElement.click();
        jdIndex = new jdIndex();
    }
    @Test
    public void runJDTest(){
//        WebElement loginBtn = jdIndex.JDLogin;
//        loginBtn.click();
    }
}
