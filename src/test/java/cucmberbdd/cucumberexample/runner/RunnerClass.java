package cucmberbdd.cucumberexample.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="F:\\SeleniumProjects_Live\\cucumberexample\\src\\test\\java\\cucmberbdd\\cucumberexample\\feature",glue= {"cucmberbdd.cucumberexample.stepDef"},
monochrome = true,
plugin = {"html:cucumberexample\\Reports\\HTMLReports.html","json:cucumberexample\\Reports\\JsonReports.json","junit:cucumberexample\\Reports\\JunitReports.xml"},

dryRun = false

)

public class RunnerClass {
	
	

}
