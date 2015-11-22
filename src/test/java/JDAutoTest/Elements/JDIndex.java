package JDAutoTest.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by crytis on 2015/11/22.
 * 京东首页元素
 */
public class JDIndex {
    private Logger logger = LoggerFactory.getLogger(getClass());


    @FindBy(how = How.ID,using = "ttbar-login")
    private WebElement JDGoToLogin;

    public JDIndex(WebDriver webDriver) {
        super();
        PageFactory.initElements(webDriver,this);
    }

    public WebElement getJDGoToLogin() {
        if (JDGoToLogin == null) {
            logger.error("JDLoginBtn是null");
        }
        return JDGoToLogin;
    }
}
