package ToolsQA.Pages;

import ToolsQA.Base.ToolsQABaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static ToolsQA.Base.ToolsQABaseTest.driver;

public class LoginCredentials extends ToolsQABaseTest {
    public LoginCredentials() {PageFactory.initElements(driver, this);}

    @FindBy(id = "userName")
    public WebElement Username;
    @FindBy (id = "password")
    public WebElement Password;
    @FindBy (id = "login")
    public WebElement LoginButton;

    public void inputUsername (String username){
        Username.clear();
        Username.sendKeys(username);
    }
    public void inputPassword (String password){
        Password.clear();
        Password.sendKeys(password);
    }
    public void clickOnLoginButton (){
        LoginButton.click();
    }
}
