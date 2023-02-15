package ToolsQA.Tests;

import ToolsQA.Base.ToolsQABaseTest;
import ToolsQA.Pages.BookstoreOne;
import ToolsQA.Pages.ElementsOne;
import ToolsQA.Pages.HomepageOne;
import ToolsQA.Pages.SidebarPageOne;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestOne extends ToolsQABaseTest {
    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.get(LoginURL);
        homepageOne = new HomepageOne();
        sidebarPageOne = new SidebarPageOne();
        elementsOne = new ElementsOne();
        bookstoreOne = new BookstoreOne();

    }

    @Test
    public void userCanClickOnTextBox() {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        elementsOne.clickOnTextBox();
        elementsOne.inputFullName("Pera");
        elementsOne.inputEmail("mika@email.com");
        elementsOne.inputAddress("Japanska");
        elementsOne.inputPermanentAddress("Gandijeva");
        scrollIntoView(elementsOne.Submit);
        elementsOne.clickOnSubmitButton();
        Assert.assertTrue(elementsOne.Submit.isDisplayed());
    }

    @Test
    public void userCanSelectAndUnselectHomeFile() throws InterruptedException {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        elementsOne.clickOnCheckBox();
        elementsOne.clickOnPlusButton();
        elementsOne.clickOnPlusButton();
        Assert.assertTrue(elementsOne.Plus.isDisplayed());

    }

    @Test
    public void userCanMarkYesInRadioB() throws InterruptedException {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        elementsOne.clickOnRadioButton();
        elementsOne.markYesRadio();
        elementsOne.markImpressive();
        Assert.assertTrue(elementsOne.YesRadio.isDisplayed());

    }

    @Test
    public void userCanMarkImpressiveInRadioB() throws InterruptedException {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        elementsOne.clickOnRadioButton();
        elementsOne.markImpressive();
        Assert.assertTrue(elementsOne.Impressive.isDisplayed());
    }

    @Test
    public void userCanBeAdded() {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        elementsOne.clickOnWebTables();
        elementsOne.clickOnAdd();
        elementsOne.inputFirstName("Vladimir");
        elementsOne.inputLastName("Milasinovic");
        elementsOne.inputEmaill("vlamil@gmail.com");
        elementsOne.inputAge("37");
        elementsOne.inputSalary("700");
        elementsOne.inputDepartment("QA");
        elementsOne.clickOnSubmitWebTables();
        Assert.assertTrue(elementsOne.AddNew.isDisplayed());
    }

    @Test
    public void userCanClickOnEscapeButtoninRegistrationForm() {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        elementsOne.clickOnWebTables();
        elementsOne.clickOnAdd();
        elementsOne.clickOnEscapeButton();
        Assert.assertTrue(elementsOne.AddNew.isDisplayed());
    }

    @Test
    public void userCanBeSearched() {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        elementsOne.clickOnWebTables();
        elementsOne.clickOnAdd();
        elementsOne.inputFirstName("Vladimir");
        elementsOne.inputLastName("Milasinovic");
        elementsOne.inputEmaill("vlamil@gmail.com");
        elementsOne.inputAge("37");
        elementsOne.inputSalary("700");
        elementsOne.inputDepartment("QA");
        elementsOne.clickOnSubmitWebTables();
        elementsOne.inputName("Vladimir");
        Assert.assertTrue(elementsOne.AddNew.isDisplayed());
    }

    @Test
    public void userCanBeEdit() {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        elementsOne.clickOnWebTables();
        elementsOne.clickOnAdd();
        elementsOne.inputFirstName("Vladimir");
        elementsOne.inputLastName("Milasinovic");
        elementsOne.inputEmaill("vlamil@gmail.com");
        elementsOne.inputAge("37");
        elementsOne.inputSalary("700");
        elementsOne.inputDepartment("QA");
        elementsOne.clickOnSubmitWebTables();
        elementsOne.inputName("Vladimir");
        elementsOne.clickOnEdit();
        elementsOne.inputAge("47");
        elementsOne.clickOnSubmitWebTables();
        Assert.assertTrue(elementsOne.AddNew.isDisplayed());
    }

    @Test
    public void userCanBeDeleted() {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        elementsOne.clickOnWebTables();
        elementsOne.clickOnAdd();
        elementsOne.inputFirstName("Vladimir");
        elementsOne.inputLastName("Milasinovic");
        elementsOne.inputEmaill("vlamil@gmail.com");
        elementsOne.inputAge("37");
        elementsOne.inputSalary("700");
        elementsOne.inputDepartment("QA");
        elementsOne.clickOnSubmitWebTables();
        elementsOne.inputName("Vladimir");
        elementsOne.clickOnEdit();
        elementsOne.inputAge("47");
        elementsOne.clickOnSubmitWebTables();
        elementsOne.clickOnDelete();
        Assert.assertTrue(elementsOne.AddNew.isDisplayed());
    }

    @Test
    public void userCanClickOnClickMe() {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        elementsOne.clickOnButtons();
        elementsOne.clickOnClickMe();
        Assert.assertTrue(elementsOne.ClickMe.isDisplayed());
    }

    @Test
    public void userCanClickOnRightClickMe() {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        elementsOne.clickOnButtons();
        elementsOne.clickOnRightClick();
        Assert.assertTrue(elementsOne.RightClick.isDisplayed());
    }

    @Test
    public void userCanClickOnDoubleClickMe() {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        elementsOne.clickOnButtons();
        elementsOne.clickOnRightClick();
        elementsOne.clickOnDoubleClick();
        elementsOne.clickOnDoubleClick();
        Assert.assertTrue(elementsOne.DoubleClick.isDisplayed());
    }

    @Test
    public void userCanClickOnLinksHome() {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        scrollIntoView(elementsOne.Links);
        elementsOne.clickOnLinks();
        elementsOne.clickOnHomeLink();
        Assert.assertFalse(elementsOne.HomeLink.isSelected());
    }

    @Test
    public void userCanClickOnLinksHomeEyLMX() {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        scrollIntoView(elementsOne.Links);
        elementsOne.clickOnLinks();
        elementsOne.clickOnDynamicLink();
        Assert.assertFalse(elementsOne.DynamicLink.isSelected());
    }

    @Test
    public void userCanClickOnLinksCreated() {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        scrollIntoView(elementsOne.Links);
        elementsOne.clickOnLinks();
        elementsOne.clickOnCreated();
        Assert.assertTrue(elementsOne.Created.isDisplayed());
    }

    @Test
    public void userCanClickOnLinksNoContent() {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        scrollIntoView(elementsOne.Links);
        elementsOne.clickOnLinks();
        elementsOne.clickOnNoContent();
        Assert.assertTrue(elementsOne.NoContent.isDisplayed());
    }

    @Test
    public void userCanClickOnLinksMoved() {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        scrollIntoView(elementsOne.Links);
        elementsOne.clickOnLinks();
        elementsOne.clickOnMoved();
        Assert.assertTrue(elementsOne.Moved.isDisplayed());
    }

    @Test
    public void userCanClickOnLinksBadRequest() {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        scrollIntoView(elementsOne.Links);
        elementsOne.clickOnLinks();
        elementsOne.clickOnBadRequest();
        Assert.assertTrue(elementsOne.BadRequest.isDisplayed());
    }

    @Test
    public void userCanClickOnLinksUnauthorized() {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        scrollIntoView(elementsOne.Links);
        elementsOne.clickOnLinks();
        elementsOne.clickOnUnAuthorized();
        Assert.assertTrue(elementsOne.UnAuth.isDisplayed());
    }

    @Test
    public void userCanClickOnLinksForbidden() {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        scrollIntoView(elementsOne.Links);
        elementsOne.clickOnLinks();
        elementsOne.clickOnForbidden();
        Assert.assertTrue(elementsOne.Forb.isDisplayed());
    }

    @Test
    public void userCanClickOnLinksNotFound() {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        scrollIntoView(elementsOne.Links);
        elementsOne.clickOnLinks();
        elementsOne.clickOnInvalidURL();
        Assert.assertTrue(elementsOne.InvURL.isDisplayed());
    }

    @Test
    public void userCanClickOnBrokenLinks() {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        scrollIntoView(elementsOne.BrokenLinks);
        elementsOne.clickOnBrokenLinks();
        Assert.assertTrue(elementsOne.BrokenLinks.isDisplayed());
    }

    @Test
    public void userCanClickOnBLClickHereForValidLink() {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        scrollIntoView(elementsOne.BrokenLinks);
        elementsOne.clickOnBrokenLinks();
        elementsOne.clickOnHereForValidLink();
        String expectedURL = excelReader.getStringData("URL", 1, 0);
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
    }

    @Test
    public void userCanClickOnBLClickHereForBrokenLink() {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        scrollIntoView(elementsOne.BrokenLinks);
        elementsOne.clickOnBrokenLinks();
        elementsOne.clickOnHereForBrokenLink();
        String expectedURL = excelReader.getStringData("URL", 1, 0);
        Assert.assertNotEquals(driver.getCurrentUrl(), expectedURL);
    }

    @Test
    public void userCanClickOnUploadAndDownload() {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        scrollIntoView(elementsOne.UploadAndDownload);
        elementsOne.clickOnUploadAndDownload();
        Assert.assertTrue(elementsOne.UploadAndDownload.isDisplayed());
    }

    @Test
    public void userCanClickOnUDDownload() {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        scrollIntoView(elementsOne.UploadAndDownload);
        elementsOne.clickOnUploadAndDownload();
        elementsOne.clickOnUDDownload();
        Assert.assertTrue(elementsOne.UDDownload.isDisplayed());
    }

//    @Test
//    public void userCannotClickOnUDUpload() throws InterruptedException {
//        scrollIntoView(homepageOne.getCards.get(0));
//        homepageOne.clickOnElements();
//        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
//        sidebarPageOne.clickOnButton("Elements");
//        scrollIntoView(elementsOne.UploadAndDownload);
//        elementsOne.clickOnUploadAndDownload();
//        elementsOne.clickOnUploadFile();
//        Assert.assertTrue(elementsOne.UDDownload.isDisplayed());


    @Test
    public void userCanClickOnDynamicProperties() throws InterruptedException {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        scrollIntoView(elementsOne.DynamicProperties);
        Thread.sleep(3000);
        elementsOne.clickOnDynamicProperties();
        Assert.assertTrue(elementsOne.DynamicProperties.isDisplayed());
    }

    @Test
    public void userCanClickOnWillEnableFiveSeconds() throws InterruptedException {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        scrollIntoView(elementsOne.DynamicProperties);
        elementsOne.clickOnDynamicProperties();
        Thread.sleep(6000);
        elementsOne.clickOnWillEnableFiveSeconds();
        Assert.assertTrue(elementsOne.WillEnable.isDisplayed());
    }

    @Test
    public void userCanClickOnColorChange() throws InterruptedException {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        // scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        scrollIntoView(elementsOne.DynamicProperties);
        elementsOne.clickOnDynamicProperties();
        Thread.sleep(6000);
        elementsOne.clickOnColorChange();
        Assert.assertTrue(elementsOne.ColorChange.isDisplayed());
    }

    @Test
    public void userCanClickOnVisibleAfterFiveSeconds() throws InterruptedException {
        scrollIntoView(homepageOne.getCards.get(0));
        homepageOne.clickOnElements();
        // scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        sidebarPageOne.clickOnButton("Elements");
        scrollIntoView(elementsOne.DynamicProperties);
        elementsOne.clickOnDynamicProperties();
        Thread.sleep(6000);
        elementsOne.clickOnVisibleAfterFive();
        Assert.assertTrue(elementsOne.VisibleAfter.isDisplayed());
    }

//    @Test
//    public void userCanClickOnBookStore()  {
//        scrollIntoView(homepageOne.getCards.get(5));
//        homepageOne.clickOnBookstore();
//        Assert.assertTrue(bookstoreOne.BSLogin.isEnabled());
//
//}


    @Test
    public void userCanLoginOnBookStore() throws InterruptedException {
        scrollIntoView(homepageOne.getCards.get(5));
        homepageOne.clickOnBookstore();
        Thread.sleep(3000);
        bookstoreOne.clickOnBSLogin();
        bookstoreOne.inputBSUsername("vlamil85");
        bookstoreOne.inputBSPassword("Zika1pera*");
        bookstoreOne.clickOnBSLogin();
    }

    @Test
    public void userCanLogoutOnBookStore() throws InterruptedException {
        scrollIntoView(homepageOne.getCards.get(5));
        homepageOne.clickOnBookstore();
        Thread.sleep(3000);
        bookstoreOne.clickOnBSLogin();
        bookstoreOne.inputBSUsername("vlamil85");
        bookstoreOne.inputBSPassword("Zika1pera*");
        bookstoreOne.clickOnBSLogin();
        Thread.sleep(3000);
        bookstoreOne.clickOnLogout();
        Assert.assertTrue(bookstoreOne.BSUsername.isDisplayed());
    }

    @Test
    public void userCanAddBook() throws InterruptedException {
        scrollIntoView(homepageOne.getCards.get(5));
        homepageOne.clickOnBookstore();
        Thread.sleep(3000);
        bookstoreOne.clickOnBSLogin();
        bookstoreOne.inputBSUsername("vlamil85");
        bookstoreOne.inputBSPassword("Zika1pera*");
        bookstoreOne.clickOnBSLogin();
        Thread.sleep(3000);
        bookstoreOne.clickOnBookGitPocket();
        wdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[2]/button")));
        bookstoreOne.clickOnAddBookToCollection();
        driver.navigate().refresh();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        Thread.sleep(3000);
        bookstoreOne.clickOnProfilePart();
        Assert.assertTrue(bookstoreOne.ProfilePart.isDisplayed());

    }

    @Test
    public void userCanDeleteAddedBook() throws InterruptedException {
        scrollIntoView(homepageOne.getCards.get(5));
        homepageOne.clickOnBookstore();
        Thread.sleep(3000);
        bookstoreOne.clickOnBSLogin();
        bookstoreOne.inputBSUsername("vlamil85");
        bookstoreOne.inputBSPassword("Zika1pera*");
        bookstoreOne.clickOnBSLogin();
        Thread.sleep(3000);
        bookstoreOne.clickOnBookGitPocket();
        wdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[2]/button")));
        bookstoreOne.clickOnAddBookToCollection();
        driver.navigate().refresh();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        Thread.sleep(3000);
        bookstoreOne.clickOnProfilePart();
        Thread.sleep(3000);
        bookstoreOne.clickOnBinDeleteBook();
        bookstoreOne.clickOnConfirmOkButton();
        driver.navigate().refresh();

    }
    @Test
    public void userCanSearchBooks() throws InterruptedException {
        scrollIntoView(homepageOne.getCards.get(5));
        homepageOne.clickOnBookstore();
        Thread.sleep(3000);
        bookstoreOne.clickOnBSLogin();
        bookstoreOne.inputBSUsername("vlamil85");
        bookstoreOne.inputBSPassword("Zika1pera*");
        bookstoreOne.clickOnBSLogin();
        Thread.sleep(3000);
        bookstoreOne.clickOnBookGitPocket();
        wdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[2]/button")));
        bookstoreOne.clickOnAddBookToCollection();
        driver.navigate().refresh();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        bookstoreOne.clickOnBackToBookStore();
        bookstoreOne.clickOnJavaScriptBook();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        bookstoreOne.clickOnAddBookToCollection();
        driver.navigate().refresh();
        Thread.sleep(3000);
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        Thread.sleep(3000);
        bookstoreOne.clickOnProfilePart();
        Thread.sleep(3000);
        bookstoreOne.inputBookInSearchField("git pocket guide");
        Assert.assertTrue(bookstoreOne.GitPocket.isDisplayed());
    }
    @Test
    public void userCanDeleteAllAddedBooks() throws InterruptedException {
        scrollIntoView(homepageOne.getCards.get(5));
        homepageOne.clickOnBookstore();
        Thread.sleep(3000);
        bookstoreOne.clickOnBSLogin();
        bookstoreOne.inputBSUsername("vlamil85");
        bookstoreOne.inputBSPassword("Zika1pera*");
        bookstoreOne.clickOnBSLogin();
        Thread.sleep(3000);
        bookstoreOne.clickOnBookGitPocket();
        wdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[2]/button")));
        bookstoreOne.clickOnAddBookToCollection();
        driver.navigate().refresh();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        bookstoreOne.clickOnBackToBookStore();
        bookstoreOne.clickOnJavaScriptBook();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        bookstoreOne.clickOnAddBookToCollection();
        driver.navigate().refresh();
        Thread.sleep(3000);
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        Thread.sleep(3000);
        bookstoreOne.clickOnProfilePart();
        Thread.sleep(3000);
        bookstoreOne.clickOnDeleteAllAddedBooks();
        bookstoreOne.clickOnConfirmOkButton();
        driver.navigate().refresh();
        Assert.assertTrue(bookstoreOne.ProfilePart.isDisplayed());
    }
    @Test
    public void userCanDeleteAddedAccount() throws InterruptedException {
        scrollIntoView(homepageOne.getCards.get(5));
        homepageOne.clickOnBookstore();
        Thread.sleep(3000);
        bookstoreOne.clickOnBSLogin();
        bookstoreOne.inputBSUsername("vlamil85");
        bookstoreOne.inputBSPassword("Zika1pera*");
        bookstoreOne.clickOnBSLogin();
        Thread.sleep(3000);
        bookstoreOne.clickOnBookGitPocket();
        wdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[2]/button")));
        bookstoreOne.clickOnAddBookToCollection();
        driver.navigate().refresh();
        scrollIntoView(sidebarPageOne.getButtons().get(sidebarPageOne.getButtons().size() - 1));
        Thread.sleep(3000);
        bookstoreOne.clickOnProfilePart();
        Thread.sleep(3000);
        bookstoreOne.clickOnBinDeleteBook();
        bookstoreOne.clickOnConfirmOkButton();
        driver.navigate().refresh();
    }
}


