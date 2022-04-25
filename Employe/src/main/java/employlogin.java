
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class employlogin {

    WebDriver driver;

    public employlogin(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html/body/div/form/input[2]")
    WebElement name;

    @FindBy(xpath = "/html/body/div/form/input[3]")
    WebElement passord;

    @FindBy(xpath = "//*[@id=\"signin\"]")
    WebElement button;



    public void login() throws InterruptedException {
        name.click();
        name.sendKeys("rakeshvarma");
        Thread.sleep(2000);

        passord.click();
        passord.sendKeys("12345@django");
        Thread.sleep(2000);



        button.click();
        Thread.sleep(2000);


    }



}
