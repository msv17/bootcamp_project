import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class testElmnt {
    WebDriver _driver;

    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Martin\\IdeaProjects\\capstone_project\\chromedriver.exe");
        this._driver = new ChromeDriver();

        this._driver.get("https://www.demoblaze.com/");

    }
    @Test(description = "correct URL")
    public void CorrectURL(){
        String expectedURL = "https://www.demoblaze.com/";
        String ActualURL = _driver.getCurrentUrl();
        CustomAssertions.CompareURL(expectedURL, ActualURL);
        System.out.println("Pass");
    }
    @Test(description = "Nav-bar home exists")
    public void Navbar(){
        String expectedid = "narvbarx";
        String currentid = _driver.findElement(By.id("narvbarx")).getAttribute("id");
        CustomAssertions.Comparenav(expectedid,currentid);
        System.out.println("Pass");
    }
    @Test(description = "Brand icon exists")
    public void BrandImage(){
        String expectedBI = "nava";
        String currentBI = _driver.findElement(By.id("nava")).getAttribute("id");
        CustomAssertions.CompareBrandImage(expectedBI,currentBI);
        System.out.println("Pass");
    }
    @Test(description = "Brand Text exists")
    public void BrandText() {
        String expectedBTxt = "PRODUCT STORE";
        String currentBTxt = _driver.findElement(By.id("nava")).getText();
        CustomAssertions.CompareBrandText(expectedBTxt, currentBTxt);
        System.out.println("Pass");


    }
    @AfterMethod
    public void close(){
        _driver.quit();
    }
}
