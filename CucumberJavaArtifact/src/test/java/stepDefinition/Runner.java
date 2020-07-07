package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"stepDefinition"},
monochrome = true,
plugin = {"pretty","html:target/HtmlReports","json:target/JasonReports/Report.json","junit:target/JunitReports/Report.xml"},
tags = "(@scenario1 or @scenario2) and not @scenario3")
public class Runner {

}
