package Tests;

import Base.BaseTest;
import Pages.Homepage;
import Pages.LoginPage;
import Pages.SignUpPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SignUpWithExistingCredentialsTest extends BaseTest {


    @BeforeMethod

    public void pageSetUp() {
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://automationexercise.com/");
        loginPage=new LoginPage();
        homepage=new Homepage();
        signUpPage=new SignUpPage();
    }

    @Test
    public void signUpWithExistingCredentialsInvalid() throws InterruptedException {
        homepage.clickOnSignupLoginButton ();
        loginPage.inputName("Joka");
        Thread.sleep(200);
        loginPage.inputEmailForSignup("joka@gmail.com");
        loginPage.clickOnSignupButton();

     //  Assert.assertEquals(signUpPage.emailAlreadyExistsMessage.getText(),"Email Address already exist!");
    }


    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}
