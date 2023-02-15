package ToolsQA.Base;

import ToolsQA.Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class ToolsQABaseTest {

    public static WebDriver driver;
    public WebDriverWait wdwait;
    public ExcelReader excelReader;
    public String LoginURL;
    public HomepageOne homepageOne;
    public SidebarPageOne sidebarPageOne;
    public ElementsOne elementsOne;
    public BookstoreOne bookstoreOne;
    public LoginCredentials loginCredentials;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        excelReader = new ExcelReader("src/test/java/ToolsQA/TestData.xlsx");
        LoginURL = excelReader.getStringData("URL", 1, 0);
    }
    public void scrollIntoView(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}

