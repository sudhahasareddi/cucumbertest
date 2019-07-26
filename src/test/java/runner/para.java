package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,features="testemeapp//parameterisation.feature",glue={"testme"},plugin= {"html:target/cucumber.html"})
public class para {

}
