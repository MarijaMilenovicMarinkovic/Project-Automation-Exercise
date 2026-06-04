package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Base.BaseTest.driver;

public class SignUpPage extends BaseTest {


    public SignUpPage () {
        PageFactory.initElements (driver, this);
    }

@FindBy(id="uniform-ide_gender2")
    public WebElement chooseGender;
@FindBy(id="name")
    public WebElement nameFieldSignUp;




}
