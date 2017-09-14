import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class TestBase extends Page {

    public LoginPage loginPage = new LoginPage();

    @BeforeTest
    @BeforeMethod
    public void openHomePage() {
        driver.get(Config.getSetting("homepageURL"));
    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
    }
}
