package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/anuraggarg/Desktop/FreeCRMBDDFramework/src/main/java/Features/createAPI.feature"  //path of feature files
        ,glue={"stepDefinitions"} //path of step def files
        ,monochrome = true //display console output in more readable format
        ,dryRun = false //to check if all the steps have been defined or not
        ,plugin = { "pretty", "html:output_html/cucumber-reports.html" , "junit:junit_xml/cucumber.xml", "json:output_json/cucumber.json"}
)

public class TestRunner {


}
