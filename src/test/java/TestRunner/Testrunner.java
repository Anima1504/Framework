package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = { "src/main/java/Featurefile"},
        glue = {"Mystepdef"},
        tags = "@Regression or @Sanity",
        plugin = {"pretty", "html:target/Cucumber-Report/Cucu.html",
        "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})


public class Testrunner {

}
