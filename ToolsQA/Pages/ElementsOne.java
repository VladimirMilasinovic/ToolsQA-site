package ToolsQA.Pages;

import ToolsQA.Base.ToolsQABaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsOne extends ToolsQABaseTest {
    public ElementsOne() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "item-0")
    public WebElement TextBox;

    @FindBy(id = "userName")
    public WebElement Username;

    @FindBy(id = "userEmail")
    public WebElement UserEmail;

    @FindBy(id = "currentAddress")
    public WebElement CurrentAddress;

    @FindBy(id = "permanentAddress")
    public WebElement PermanentAddress;

    @FindBy(id = "submit")
    public WebElement Submit;

    @FindBy(id = "item-1")
    public WebElement CheckBox;

    @FindBy(className = "rct-checkbox")
    public WebElement Plus;

    @FindBy(id = "item-2")
    public WebElement RadioButton;

    @FindBy(className = "custom-control-label")
    public WebElement YesRadio;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/label")
    public WebElement Impressive;

    @FindBy(id = "item-3")
    public WebElement WebTables;

    @FindBy(id = "addNewRecordButton")
    public WebElement AddNew;

    @FindBy(id = "firstName")
    public WebElement Firstname;

    @FindBy(id = "lastName")
    public WebElement Lastname;

    @FindBy(id = "userEmail")
    public WebElement Email;

    @FindBy(id = "age")
    public WebElement Age;

    @FindBy(id = "salary")
    public WebElement Salary;

    @FindBy(id = "department")
    public WebElement Department;

    @FindBy(id = "submit")
    public WebElement SubmitWT;

    @FindBy(className = "close")
    public WebElement Close;

    @FindBy(id = "searchBox")
    public WebElement SearchBoxWB;

    @FindBy(id = "edit-record-4")
    public WebElement Edit;

    @FindBy(id = "delete-record-4")
    public WebElement Delete;

    @FindBy(id = "item-4")
    public WebElement Buttons;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button")
    public WebElement ClickMe;

    @FindBy(id = "rightClickBtn")
    public WebElement RightClick;


    @FindBy(id = "doubleClickBtn")
    public WebElement DoubleClick;

    @FindBy(id = "item-5")
    public WebElement Links;

    @FindBy(id = "simpleLink")
    public WebElement HomeLink;

    @FindBy(id = "dynamicLink")
    public WebElement DynamicLink;

    @FindBy(id = "created")
    public WebElement Created;

    @FindBy(id = "no-content")
    public WebElement NoContent;

    @FindBy(id = "moved")
    public WebElement Moved;

    @FindBy(id = "bad-request")
    public WebElement BadRequest;

    @FindBy(id = "unauthorized")
    public WebElement UnAuth;

    @FindBy(id = "forbidden")
    public WebElement Forb;

    @FindBy(id = "invalid-url")
    public WebElement InvURL;

    @FindBy(id = "item-6")
    public WebElement BrokenLinks;

    @FindBy(linkText = "Click Here for Valid Link")
    public WebElement BLValidLink;

    @FindBy(linkText = "Click Here for Broken Link")
    public WebElement BLBrokenLink;

    @FindBy(id = "item-7")
    public WebElement UploadAndDownload;

    @FindBy(id = "downloadButton")
    public WebElement UDDownload;

    @FindBy(id = "uploadFile")
    public WebElement UploadFile;

    @FindBy(id = "item-8")
    public WebElement DynamicProperties;

    @FindBy(id = "enableAfter")
    public WebElement WillEnable;

    @FindBy(id = "colorChange")
    public WebElement ColorChange;

    @FindBy(id = "visibleAfter")
    public WebElement VisibleAfter;


    public void clickOnTextBox() {
        TextBox.click();
    }

    public void inputFullName(String username) {
        Username.clear();
        Username.sendKeys(username);

    }
    public void inputEmail(String email) {
        UserEmail.clear();
        UserEmail.sendKeys(email);
    }
    public void inputAddress(String address){
        CurrentAddress.clear();
        CurrentAddress.sendKeys(address);

    }
    public void inputPermanentAddress(String permanent){
        PermanentAddress.clear();
        PermanentAddress.sendKeys(permanent);
    }
    public void clickOnSubmitButton(){Submit.click();
    }
    public void clickOnCheckBox(){CheckBox.click();
    }
    public void clickOnPlusButton(){Plus.click();
    }
    public void clickOnRadioButton(){RadioButton.click();
    }
    public void markYesRadio(){YesRadio.click();
    }
    public void markImpressive(){Impressive.click();
    }
    public void clickOnWebTables(){WebTables.click();
    }
    public void clickOnAdd(){AddNew.click();
    }
    public void inputFirstName(String firstname){
        Firstname.clear();
        Firstname.sendKeys(firstname);
    }
    public void inputLastName(String lastname){
        Lastname.clear();
        Lastname.sendKeys(lastname);
    }
    public void inputEmaill(String email){
        Email.clear();
        Email.sendKeys(email);
    }
    public void inputAge(String age){
        Age.clear();
        Age.sendKeys(age);
    }
    public void inputSalary(String salary){
        Salary.clear();
        Salary.sendKeys(salary);
    }
    public void inputDepartment(String department){
        Department.clear();
        Department.sendKeys(department);
    }
    public void clickOnSubmitWebTables(){SubmitWT.click();
    }
    public void clickOnEscapeButton(){Close.click();
    }
    public void inputName(String name){
        SearchBoxWB.clear();
        SearchBoxWB.sendKeys(name);
    }
    public void clickOnEdit(){Edit.click();
    }
    public void clickOnDelete(){Delete.click();
    }
    public void clickOnButtons(){Buttons.click();
    }
    public void clickOnClickMe(){ClickMe.click();
    }
    public void clickOnRightClick(){RightClick.click();
    }
    public void clickOnDoubleClick(){DoubleClick.click();
    }
    public void clickOnLinks(){Links.click();
    }
    public void clickOnHomeLink(){HomeLink.click();
    }
    public void clickOnDynamicLink(){DynamicLink.click();
    }
    public void clickOnCreated(){Created.click();
    }
    public void clickOnNoContent(){NoContent.click();
    }
    public void clickOnMoved(){Moved.click();
    }
    public void clickOnBadRequest(){BadRequest.click();
    }
    public void clickOnUnAuthorized(){UnAuth.click();
    }
    public void clickOnForbidden(){Forb.click();
    }
    public void clickOnInvalidURL(){InvURL.click();
    }
    public void clickOnBrokenLinks(){BrokenLinks.click();
    }
    public void clickOnHereForValidLink(){BLValidLink.click();
    }
    public void clickOnHereForBrokenLink(){BLBrokenLink.click();
    }
    public void clickOnUploadAndDownload(){UploadAndDownload.click();
    }
    public void clickOnUDDownload(){UDDownload.click();
    }
    public void clickOnUploadFile(){UploadFile.click();
    }
    public void clickOnDynamicProperties(){DynamicProperties.click();
    }
    public void clickOnWillEnableFiveSeconds(){WillEnable.click();
    }
    public void clickOnColorChange(){ColorChange.click();
    }
    public void clickOnVisibleAfterFive(){VisibleAfter.click();
    }

}
