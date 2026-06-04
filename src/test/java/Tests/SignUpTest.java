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
/*
public class SignUpTest extends BaseTest {


    @BeforeMethod
        public void pageSetUp() {
            driver= new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            driver.manage().window().maximize();
            driver.navigate().to("https://automationexercise.com/login");
            loginPage=new LoginPage();
            //homepage=new Homepage();
            signUpPage=new SignUpPage();
        }

        @Test(priority =1)
    public void userSignsUp () throws InterruptedException {
Thread.sleep(2000);
        loginPage.inputName("Ann");
loginPage.inputEmailForSignup("ann@gmail.com");
loginPage.clickOnSignupButton();
            Assert.assertEquals(loginPage.nameField.getAttribute(), "Ann");

           // Assert.assertFalse(loginPage.emailAddressForSignUp.getAttribute("value").isEmpty());

    }

@AfterMethod
public void tearDown() {
    driver.quit();
}}
*/