import org.apache.commons.codec.binary.Base64;
import org.jetbrains.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class Page {


    public static WebDriver driver = DriverBuilder.INSTANCE.getDriver();

    protected Page() {
        Config.loadProperties("Page.properties");
        PageFactory.initElements(driver, this);
    }

    @NotNull
    public String decrypt(String encryptedString) {
        byte[] byteArray = Base64.decodeBase64(encryptedString.getBytes());
        return new String(byteArray);
    }
}
