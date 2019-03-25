package FBrun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/FBtest/FeatureFb.Feature",
glue={"FBdef"},plugin={"pretty","html:output/htmloutput"},monochrome=true,
tags={"@tags1"})

public class FbRunner {

}
