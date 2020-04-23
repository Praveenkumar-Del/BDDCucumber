package RunnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\JavaSelenium\\BDDCucumberFramework\\src\\test\\java\\Features\\ZeroWebAppSecurity", //The path of the feature file
glue= {"E:\\JavaSelenium\\BDDCucumberFramework\\src\\test\\java\\StepDefinition\\ZeroWebAppEndToEnd.java"}, //The path of Step Definition file
 monochrome=true, //It will display the console output in proper readable format
//tags= "@demo1",
 strict = true, // It will fail if there are any undefined/pending methods are there and step definition file
 dryRun = false,  //TO check the mapping between feature file and step defintion file True-It will display only missing steps with snippets. If false, it will execute all
 plugin = {"html:ResultsNew","pretty"})
//format = {"pretty", "html:test-output", "json:json.output/cucucmber.json", "junit:junit_xml/cucumber.xml"})- To generate diferent types of reports formats
//tags= {"@demo1,@demo3"}


public class ZeroTestRunner {

}
