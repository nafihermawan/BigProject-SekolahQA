package step_definition;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		tags = {"@Dev"},
		features = {"classpath:features"},
		glue = { "classpath:step_definition"},
		plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}		
		
		)
public class RunCukesTest{
	
}