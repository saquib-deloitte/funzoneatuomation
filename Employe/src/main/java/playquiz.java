import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class playquiz {
    WebDriver driver;

    public playquiz(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"wrapper\"]/ul/li[4]/a/div/div[2]")
    WebElement quiz;

    @FindBy(xpath = "//*[@id=\"content-wrapper\"]/div/div[2]/ul/li[1]/b/a")
    WebElement newq;

    @FindBy(xpath = "//*[@id=\"content-wrapper\"]/div/div[2]/ul/li[2]/b/a")
    WebElement takeq;

    @FindBy(xpath = "//*[@id=\"content-wrapper\"]/div/div[2]/div/div/div[1]/div/div[1]/a/img")
    WebElement pl;

    @FindBy(xpath = "//*[@id=\"startlink\"]")
    WebElement st;
    @FindBy(xpath = "//*[@id=\"content-wrapper\"]/div/div[2]/div/div[5]/a[1]")
    WebElement gotop;


    public void play() throws InterruptedException {

        quiz.click();
        Thread.sleep(2000);

        newq.click();
        Thread.sleep(3000);

        takeq.click();
        Thread.sleep(3000);

        //newq.click();
       // Thread.sleep(3000);

        //pl.click();
       // Thread.sleep(2000);

       // Thread.sleep(2000);
       // st.click();


    }

}
