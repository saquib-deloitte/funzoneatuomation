import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class game {
    WebDriver driver;

    public game(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"wrapper\"]/ul/li[5]/a/div/div[2]")
    WebElement tic;

    @FindBy(xpath = "//*[@id=\"room\"]")
    WebElement id;

    @FindBy(xpath = "//*[@id=\"gameform\"]/form/button")
    WebElement but;
    @FindBy(xpath = "//*[@id=\"game_board\"]/div[1]/div[1]")
    WebElement but1;



    public void games() throws InterruptedException {

        tic.click();
        Thread.sleep(2000);

        id.click();
        id.sendKeys("jay");
        Thread.sleep(2000);

        but.click();
        Thread.sleep(2000);

        but1.click();
        Thread.sleep(2000);


    }
}
