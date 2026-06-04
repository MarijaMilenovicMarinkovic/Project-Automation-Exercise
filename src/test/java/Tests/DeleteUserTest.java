package Tests;

import Base.BaseTest;
import Pages.DeletedUserPage;
import Pages.Homepage;
import Pages.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DeleteUserTest extends BaseTest {

        @BeforeMethod
        public void pageSetUp() {
            driver= new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.navigate().to("https://automationexercise.com/");
            loginPage=new LoginPage();
            homepage=new Homepage();
            deletedUserPage=new DeletedUserPage();
        }

            @Test (priority=1)
                    public void deleteUser (){

                homepage.clickOnSignupLoginButton();

                loginPage.userInputsEmail("joka2@gmail.com");
                loginPage.userInputsPassword( "joka2123");
                loginPage.UserClicksOnLoginButton();
                homepage.deleteAccount();


               // Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/delete_account");
                Assert.assertTrue(
                        deletedUserPage.accountDeletedMessage.isDisplayed()
                );


            }

@AfterMethod
    public void tearDown() {
            driver.quit();
}
}
