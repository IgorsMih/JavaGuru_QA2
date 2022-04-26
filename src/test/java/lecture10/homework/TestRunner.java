package lecture10.homework;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty",
        features = {"C:\\Java\\JavaGuru_QA2\\src\\test\\resources\\features"},
        glue = {"lecture10\\homework\\steps"},
        tags = "@ForumcinemasLv"
)
public class TestRunner { }