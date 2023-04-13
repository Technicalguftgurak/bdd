package testrunners;

import org.junit.runner.RunWith;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Appfeatures/Search.feature"},
glue= {"Stepdefinitions"})

public class AmazonTestRunner 

{

}
