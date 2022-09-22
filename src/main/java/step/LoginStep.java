package step;

import automationbase.Base;
import page.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginStep  extends Base {
   static LoginPage loginPage = new LoginPage();
    public void clickOnSignButton() throws InterruptedException {
        driver.findElement(loginPage.signButtonOnHomePage).click();
        TimeUnit.SECONDS.sleep(3);
    }
    public void completeForm(String email, String password){
        driver.findElement(loginPage.emailTextField).sendKeys(email);

        driver.findElement(loginPage.passwordTextField).sendKeys(password);
        driver.findElement(loginPage.SignInButton).click();
    }
   public boolean accountButtonIsDisplay(){
        return driver.findElement(loginPage.myAccountIcon).isDisplayed();
    }
}
