package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//features/AddNewCustomer.feature" ,
		glue = {"stepDefination", "hooks"},
		dryRun = false,
		monochrome =true,
		publish =true
		
		
		)
public class TestRunner {
	

}
