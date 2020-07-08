package com.api.bdd.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin =  {"html:target/cucumber","json:target/cucumber.json","junit:target/cucumber.xml"},
        features ={"src/test/java/com/api/bdd/features"},
        glue={"com.api.bdd.steps"},
        tags={"@Test"} )

public class TestRunner {

}
