package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BaseTest {

    public CartPage () {
        PageFactory.initElements (driver, this);
    }

    @FindBy (linkText="Cart is empty")
    public WebElement emptyCartMessage;


}
