package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C:\\Users\\Jagadeesh\\eclipse-workspace\\FreeCrmBDDFramework\\Features\\contact.feature",
		glue="stepDefinitions",
     	dryRun=true,
		monochrome=true,
     	plugin = {"pretty","html:test_output", "junit:junit-output/cucumber.xml"}
		
		
		)




public class TestRun {

}
