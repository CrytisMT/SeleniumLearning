package JDAutoTest;

import JDAutoTest.Elements.JDIndex;
import JDAutoTest.Elements.JDLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by crytis on 2015/11/22.
 */
public class RunTest {
    private JDIndex jdIndex;
    private JDLoginPage jdLoginPage;
    private WebDriver chromeDriver;

    @BeforeTest
    void init() {
        System.setProperty("webdriver.chrome.driver", "res/chromedriver.exe");
         chromeDriver= new ChromeDriver();
        jdIndex = new JDIndex(chromeDriver);
        jdLoginPage = new JDLoginPage(chromeDriver);
        chromeDriver.get("http://www.jd.com");
    }

    @Test
    public void runJDTest() {
        WebElement loginBtn = jdIndex.getJDGoToLogin();
        loginBtn.click();
        jdLoginPage.getJDUsername().sendKeys("test5");
        jdLoginPage.getJDpassword().sendKeys("123456");
        jdLoginPage.getJDLoginBtn().click();

        WebElement element = chromeDriver.findElement(By.xpath("//*[contains(.,'请输入验证码')]"));
        if (element == null) {
            System.out.println("shibai");
        }
    }
}
