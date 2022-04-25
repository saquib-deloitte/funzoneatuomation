import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class updateinterest {

     WebDriver driver;

    public updateinterest(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"wrapper\"]/ul/li[3]/a/div/div[2]")
    WebElement opt;
    @FindBy(xpath = "//*[@id=\"content-wrapper\"]/div/div[2]/form/div[2]/button")
    WebElement save;
    @FindBy(xpath = "//*[@id=\"id_interests_0\"]")
    WebElement ops;
    @FindBy(xpath = "//*[@id=\"id_interests_1\"]")
    WebElement ops2;
    @FindBy(xpath = "//*[@id=\"content-wrapper\"]/div/div[2]/form/div[2]/a")
    WebElement cance;

    public void interest() throws InterruptedException {
        opt.click();
        Thread.sleep(2000);

        save.click();
        Thread.sleep(4000);

        opt.click();
        ops.click();
        Thread.sleep(2000);
        ops2.click();
        save.click();
        Thread.sleep(5000);

        opt.click();
        cance.click();



    }
}
