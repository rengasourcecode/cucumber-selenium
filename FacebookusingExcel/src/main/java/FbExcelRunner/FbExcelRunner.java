package FbExcelRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/FbExcelTestScripts/FbExcelFeature.Feature",
		glue={"FbExcelDefn"},plugin={"pretty","html:output/cucumber"},monochrome=true)

public class FbExcelRunner {

	}
