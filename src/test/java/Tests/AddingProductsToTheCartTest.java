package Tests;

import Base.BaseTest;
import Pages.Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddingProductsToTheCartTest extends BaseTest {

    @BeforeMethod

    public void pageSetUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://automationexercise.com/");
        homepage=new Homepage();
    }

    @Test (priority=1)
    public void addThreeDifferentProductsToCart () throws InterruptedException {

      //  Actions actions = new Actions(driver);
       // homepage.firstProduct.scrollIntoView();
        //actions.moveToElement(homepage.firstProduct).perform();



JavascriptExecutor js = (JavascriptExecutor) driver;

js.executeScript("arguments[0].click();",homepage.addToCartButton);
       // wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        homepage. continueShoppingButton.click();
    //    homepage.addToCartButton.click();

        js.executeScript("arguments[0].click();", homepage.addToCartButtonProduct2);
      //  homepage.addToCartButtonProduct2.click();
     //   wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        homepage.continueShoppingButton.click();

        js.executeScript("arguments[0].click();", homepage.addToCartButtonProduct3);
        homepage.clickOnViewCart();

        WebElement product1= driver.findElement(By.cssSelector("a[href='/product_details/1']"));
       // WebElement numberOfProducts=driver.findElement(By.linkText("1"));
        WebElement product2=driver.findElement(By.id("product-2"));

        Assert.assertTrue(product1.isDisplayed());
      //  Assert.assertTrue(numberOfProducts.isDisplayed());
        Assert.assertTrue(product2.isDisplayed());
    }

    @AfterMethod

    public void tearDown() {
        driver.quit();
    }
}