package Mystepdef;

import Demoqaa.Elements;
import io.cucumber.java.en.Given;

public class MyStepdefs {
    Elements el=new Elements();
    @Given("User successfully adedd")
    public void userSuccessfullyAdedd() {
        el.element();
    }


    @Given("user able to click")
    public void userAbleToClick() throws InterruptedException {
        el.buttons();
    }

    @Given("User able to access")
    public void userAbleToAccess() throws InterruptedException {
        el.links();
    }


}
