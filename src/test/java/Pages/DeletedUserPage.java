package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletedUserPage extends BaseTest {
    public DeletedUserPage () {
        PageFactory.initElements (driver, this);
    }


    @FindBy(xpath = "//b[text()='Account Deleted!']")
    public WebElement accountDeletedMessage;

}
