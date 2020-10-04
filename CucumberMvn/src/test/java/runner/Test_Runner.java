package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\allen\\eclipse-workspace\\CucumberMvn\\src\\test\\resources\\Login\\Login.feature"},
glue= {"stopDefinition"},
dryRun=false, //To check running to find out did i miss any steps
monochrome = true, //to make the console output in a better format
strict = true, // it will check any steps in the feature file is missed in the implementation
plugin= {"html:testout/allen.html", "junit:testout/cucumber.xml", "json:testout/cucumber.json"}		
		)

public class Test_Runner {

}

