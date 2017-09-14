import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends Page {

    @FindBy(xpath = ".//a[@class='_b93kq']['Log in']")
    private WebElement gotoLoginForm;

    @FindBy(xpath = ".//input[@name='username']")
    private WebElement usernameField;

    @FindBy(xpath = ".//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = ".//button['Log in']")
    private WebElement loginButton;

    public void login(String userName, String passwd) {
        gotoLoginForm.click();
        usernameField.sendKeys(decrypt(userName));
        passwordField.sendKeys(decrypt(passwd));
        loginButton.click();
    }
}
