package lecture10;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty",
        features = {"C:\\Java\\JavaGuru_QA2\\src\\test\\resources\\features"},
        glue = {"lecture10\\steps"},
        tags = "@SsLv"
)
public class TestRunner { }
