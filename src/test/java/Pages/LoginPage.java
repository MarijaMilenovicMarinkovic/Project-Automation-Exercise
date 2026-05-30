package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BaseTest {

    public LoginPage () {
        PageFactory.initElements (driver, this);
    }

@FindBy (name="email")
    public WebElement emailAddressField;

@FindBy (name="password")
    public WebElement passwordField;

@FindBy (css = "button[data-qa='login-button']")
    public WebElement loginButton;

public void userLogsIn (String email, String password){
    emailAddressField.clear();
    emailAddressField.sendKeys(email);
    passwordField.clear();
    passwordField.sendKeys(password);
    loginButton.click();
}
    public void userInputsEmail (String email){
        emailAddressField.clear();
        emailAddressField.sendKeys(email);}
    public void userInputsPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);}
    public void UserClicksOnLoginButton(){
        loginButton.click();}



}
