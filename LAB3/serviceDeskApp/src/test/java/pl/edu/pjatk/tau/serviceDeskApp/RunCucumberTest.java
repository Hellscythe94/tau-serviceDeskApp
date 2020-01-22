package pl.edu.pjatk.tau.serviceDeskApp;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:report"}, features="src/test/resources/serviceDeskApp")
public class RunCucumberTest {
}
