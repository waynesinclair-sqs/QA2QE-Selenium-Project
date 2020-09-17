package pageobjects;

import org.openqa.selenium.WebElement;

public class loginPageObject {

     public WebElement inputEmail;
     public WebElement inputPassword;
     public WebElement SigninButton;

    public void enterEmail(String Email){
        inputEmail.clear();
        inputEmail.sendKeys(Email);
    }

    public void enterPassword(String Password){
        inputPassword.clear();
        inputPassword.sendKeys(Password);
    }

    public void clickLogin(){
        SigninButton.click();
    }
}
