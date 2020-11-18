package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


//	@RunWith(Cucumber.class)
//	@CucumberOptions(tags = {"@TaskTest"}, format = {"pretty","html: report"}, monochrome = true, glue = {"testCases"}, features="src\\test\\resources\\feature\\task.feature")

@RunWith(Cucumber.class)
@CucumberOptions(tags = {"@TaskTest"},plugin = {"json:target/cucumber.json","pretty","html: report","junit: report/Flipkart.xml"}, strict = true, monochrome = true, glue = {"testCases"}, features="src\\test\\resources\\feature\\task.feature")
public class RunnerTest {

	}


	