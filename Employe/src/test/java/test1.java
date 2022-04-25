import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class test1 {

    String LoginPage = "https://hashedinfunzone-urtjok3rza-wl.a.run.app/login_form/";
@BeforeMethod
void driverStart(){
    driver.setDriver();
}

@Test
    void viewpdftest() throws InterruptedException {
    driver.getDriver().get(LoginPage);
    employlogin log = new employlogin(driver.getDriver());
    try {
        log.login();

    } catch (InterruptedException e) {
        e.printStackTrace();
        System.out.println("error at view pdf");
    }
    tictac();

}

void tictac() throws InterruptedException {
    game  ticto = new game(driver.getDriver());
    try {
        ticto.games();
    }
    catch(InterruptedException e){
        e.printStackTrace();
        System.out.println("error at tictactoo game");
    }
    update();

}

void update(){
    updateinterest up = new updateinterest(driver.getDriver());

    try {
        up.interest();
    }
    catch(InterruptedException e){
        e.printStackTrace();
        System.out.println("error at update interest");
    }
    takequiz();
}

void takequiz(){
    playquiz tk = new playquiz(driver.getDriver());

    try{
        tk.play();
    }
    catch(InterruptedException e){
        e.printStackTrace();
        System.out.println("error at play quiz");
    }

}
}
