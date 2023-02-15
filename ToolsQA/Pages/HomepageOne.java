package ToolsQA.Pages;

import ToolsQA.Base.ToolsQABaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static ToolsQA.Base.ToolsQABaseTest.driver;

public class HomepageOne extends ToolsQABaseTest {
    public HomepageOne (){
        PageFactory.initElements(driver,this);
    }

    public @FindBy(className = "card-body")
    List<WebElement> getCards;


    public void clickOnElements() {
        for (int i = 0; i < getCards.size(); i++) {
            if (getCards.get(i).getText().equals("Elements")) {
                getCards.get(i).click();
                break;
            }
        }
    }
    public void clickOnForms() {
        for (int i = 0; i < getCards.size(); i++) {
            if (getCards.get(i).getText().equals("Forms")) {
                getCards.get(i).click();
                break;
            }
        }
    }
    public void clickOnAlerts() {
        for (int i = 0; i < getCards.size(); i++) {
            if (getCards.get(i).getText().equals("Alerts, Frame & Windows")) {
                getCards.get(i).click();
                break;
            }
        }
    }
    public void clickOnWidgets() {
        for (int i = 0; i < getCards.size(); i++) {
            if (getCards.get(i).getText().equals("Widgets")) {
                getCards.get(i).click();
                break;
            }
        }
    }
    public void clickOnInteractions() {
        for (int i = 0; i < getCards.size(); i++) {
            if (getCards.get(i).getText().equals("Interactions")) {
                getCards.get(i).click();
                break;
            }
        }
    }
    public void clickOnBookstore() {
        for (int i = 0; i < getCards.size(); i++) {
            if (getCards.get(i).getText().equals("Book Store Application")) {
                getCards.get(i).click();
                break;
            }
        }
    }
    public void clickOnCard(String cardName) {
        for (int i = 0; i < getCards.size(); i++) {
            if (getCards.get(i).getText().equals(cardName)) {
                getCards.get(i).click();
                break;
            }
        }
    }
}

