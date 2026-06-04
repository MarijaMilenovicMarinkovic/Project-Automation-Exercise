package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class BaseTest {

public static WebDriver driver;
public Homepage homepage;
public LoginPage loginPage;
public WebDriverWait wait;
public SignUpPage signUpPage;
public DeletedUserPage deletedUserPage;
public CartPage cartPage;


@BeforeClass
public void setUp () {
        WebDriverManager.chromedriver().setup();

}

}
