package Base;

import Pages.Homepage;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {

public static WebDriver driver;
public Homepage homepage;
public LoginPage loginPage;


@BeforeClass
public void setUp () {
        WebDriverManager.chromedriver().setup();

}

}
