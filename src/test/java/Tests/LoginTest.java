package Tests;

import Base.BaseTest;
import Pages.Homepage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {
    @BeforeMethod

    public void pageSetUp() {
        driver= new ChromeDriver ();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://automationexercise.com/");
        loginPage=new LoginPage();
        homepage=new Homepage();

    }

    @Test (priority =1)
            public void LoginWithValidCredentials() {
    homepage.clickOnSignupLoginButton ();
    loginPage.userLogsIn("joka@gmail.com", "joka456");

        WebElement logoutButton = driver.findElement(By.linkText("Logout"));
     Assert.assertTrue(logoutButton.isDisplayed());

     WebElement deleteButton = driver.findElement(By.linkText("Delete Account"));
      Assert.assertTrue(deleteButton.isDisplayed());
    }

   //@Test (priority=2)
   // public void

    @AfterMethod
      public void tearDown() {
    driver.quit();
    }

}
