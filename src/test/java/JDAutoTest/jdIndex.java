package JDAutoTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by xinyu.jiang on 2015/11/22.
 */
public class jdIndex {
    @FindBy(how = How.ID,id = "ttbar-login")
    WebElement JDLogin;
}
