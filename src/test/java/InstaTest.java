import org.testng.annotations.*;


public class InstaTest extends TestBase {

    @Test()//enabled = false)
    public void login() {
        loginPage.login(
                Config.getSetting("usernameBase64"),
                Config.getSetting("passwordBase64"));
    }
}
