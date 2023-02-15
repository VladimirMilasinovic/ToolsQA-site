package ToolsQA.Pages;

import ToolsQA.Base.ToolsQABaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookstoreOne extends ToolsQABaseTest {

    public BookstoreOne(){
        PageFactory.initElements(driver,this);
    }


    @FindBy(id = "login")
    public WebElement BSLogin;

    @FindBy(id = "userName")
    public WebElement BSUsername;

    @FindBy(id = "password")
    public WebElement BSPassword;

    @FindBy(id = "submit")
    public WebElement BSLogout;

    @FindBy(id = "see-book-Git Pocket Guide")
    public WebElement GitPocket;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[2]/button")
    public WebElement AddToCollection;

    @FindBy(id = "addNewRecordButton")
    public WebElement BackToBookstore;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[3]/span")
    public WebElement ProfilePart;

    @FindBy(id = "delete-record-undefined")
    public WebElement DeleteBook;

    @FindBy(id = "see-book-Learning JavaScript Design Patterns")
    public WebElement JavaScript;

    @FindBy(id = "searchBox")
    public WebElement SearchBook;

    @FindBy(id = "closeSmallModal-ok")
    public WebElement ConfirmOk;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[3]/button")
    public WebElement DeleteAllBooks;



    public void clickOnBSLogin(){BSLogin.click();
    }
    public void inputBSUsername(String username) {
        BSUsername.clear();
        BSUsername.sendKeys(username);
    }
    public void inputBSPassword(String password) {
        BSPassword.clear();
        BSPassword.sendKeys(password);
    }
    public void clickOnLogout(){BSLogout.click();
    }
    public void clickOnBookGitPocket(){GitPocket.click();
    }
    public void clickOnAddBookToCollection(){AddToCollection.click();
    }
    public void clickOnProfilePart(){ProfilePart.click();
    }
    public void clickOnBinDeleteBook(){DeleteBook.click();
    }
    public void clickOnBackToBookStore(){BackToBookstore.click();
    }
    public void clickOnJavaScriptBook(){JavaScript.click();
    }
    public void inputBookInSearchField(String bookname){
        SearchBook.sendKeys(bookname);
    }
    public void clickOnConfirmOkButton(){ConfirmOk.click();
    }
    public void clickOnDeleteAllAddedBooks(){DeleteAllBooks.click();
    }
}
