package Tests;

import Base.BaseTest;
import Pages.CartPage;
import Pages.Homepage;
import Pages.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class EmptyCartTest extends BaseTest {

    @BeforeMethod

    public void pageSetUp() {
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://automationexercise.com/");
        loginPage=new LoginPage();
        homepage=new Homepage();
        cartPage=new CartPage();
    }

    @Test
    public void verifyCartIsEmpty () {
homepage.clickOnCartIcon();
        Assert.assertTrue(cartPage.emptyCartMessage.getText().contains("empty"));

    }



    @AfterMethod
    public void tearDown () {
        driver.quit();
    }
}
