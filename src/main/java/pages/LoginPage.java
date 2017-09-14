import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends Page {

    @FindBy(xpath = ".//button['Log in']")
    private WebElement loginButton;

    @FindBy(xpath = ".//p[@class='_c59vy']['Have an account?']")
    private WebElement haveAccMsg;

    @FindBy(xpath = ".//p[@class='_c59vy']['Log In']")
    private WebElement switchToLogin;

    public void login(String userName, String passwd) {
    }

    public void logout() {
    }

    public void checkLoginErrorMessage() {
    }
}
