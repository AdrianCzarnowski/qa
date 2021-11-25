package pl.jsystems.qa.qagui.bdd;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="scr/test/resources",
        glue = "classpath:pl.jsystems.qa.qaqui.bdd"
        plugin = {"petty", "summary", "html:tger/cucumber/report.html", "json: taget/cucumber.json",
        "junit:target/cucumber.xml", "return:target/return.txt"},
        tags =


)
public class RumTest {

}
