package runnertagging;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features="src/test/java/featuretagfiles/Tagging.Feature"
		features="src/test/java/featuretagfiles/Hooks.Feature",

		glue={"deftagging"},
		plugin={"pretty","html:outputfiles/html-output"},
		monochrome=true,
		dryRun=false
		//tags={"@smoke"} //only smoke will get executed
		//tags={"@smoke","@sanity"} // " AND " both smoke and sanity should be there
		//tags={"@regression","@sanity"} //" AND " its executed cos it has both in two scenarios
		//tags={"@smoke , @sanity"} //" OR " any of one is there means it will get executed
		//tags={"~@smoke"} //except smoke everything will get executed
		)
public class tagrunner {

}
