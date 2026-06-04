package Pages;

import Base.BaseTest;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BaseTest {

    public Homepage () {
        PageFactory.initElements (driver, this);
    }

    @FindBy (css="a[href='/login']")
    public WebElement signupLoginButton;

    public void clickOnSignupLoginButton () {
        signupLoginButton.click();
    }

    @FindBy (css = ".btn.btn-default.add-to-cart")
    public WebElement addToCartButton;
    @FindBy (css="a[data-product-id='2']")
    public WebElement addToCartButtonProduct2;

    @FindBy(className = "product-overlay")
    public WebElement firstProduct;
    public void clickOnAddToCartButton () {
        addToCartButton.click();
    }

    public void clickOnAddToCartButton2 () {
        addToCartButtonProduct2.click();
    }
    @FindBy (css="a[data-product-id=\'3\']")
   public  WebElement addToCartButtonProduct3;
    public void clickOnAddToCartButton3 () {
        addToCartButtonProduct3.click();
    }
   @FindBy (css=".btn.btn-success.close-modal.btn-block")
    public WebElement continueShoppingButton;

   public void clickOnContinueShoppingButton () {
       continueShoppingButton.click();
   }
   @FindBy(css="a[href='/view_cart']")
    WebElement viewCart;

   public void clickOnViewCart() {
       viewCart.click();
   }


//---------------------------------------------------------------

    @FindBy(css = "a[href='/delete_account']")
    public WebElement deleteAccountButton;

public void deleteAccount () {
    deleteAccountButton.click();
}

//------------------------------------------------

    //Cart Icon
@FindBy (linkText="Cart")
    public WebElement cartIcon;

public void clickOnCartIcon () {
    cartIcon.click();
}

}
