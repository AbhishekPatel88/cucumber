package runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="Feature\\demo1.feature",glue={"StepDef"},plugin= {"html:target/cucumber.html"})


public class runnerdemo {
	
	


}
