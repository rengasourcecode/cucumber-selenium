package Runner10;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/FeatureScripts/test.Feature",
		//features = "C:\\Users\\Vignesh\\Cucumber_AutomationBytes\\Cucumber\\src\\test\\java\\TestScripts\\Sample.Feature", //the path of the feature files
		glue={"Stepdef10"}, //the path of the step definition files
		plugin= {"pretty","html:output/test-outout", "json:output/json_output/cucumber.json", "junit:output/junit_xml/cucumber.xml"}, //to generate different types of reporting
		monochrome = true //display the console output in a proper readable format
		//strict = false, //it will check if any step is not defined in step definition file
		//dryRun = false //to check the mapping is proper between feature file and step def file
		//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
		)


public class RunnerFB {

}
