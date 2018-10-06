package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(	features= {"src/test/java/features/Login.feature"},
					glue= {"pages","steps"},
					monochrome=true)
@RunWith(Cucumber.class)
dd
public class RunCukes {
	
}
