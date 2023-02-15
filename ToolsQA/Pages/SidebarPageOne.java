package ToolsQA.Pages;

import ToolsQA.Base.ToolsQABaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SidebarPageOne extends ToolsQABaseTest {
    public SidebarPageOne() {PageFactory.initElements(driver, this);}

    @FindBy(id = "submit")
    public WebElement submitButton;


    public List<WebElement> getButtons() {
        return driver.findElements(By.className("text"));
    }



    public void clickOnButton(String name) {
        for (int i = 0; i < getButtons().size(); i++) {
            if (getButtons().get(i).getText().equals(name)) {
                getButtons().get(i).click();
                break;
            }
        }
    }

}


