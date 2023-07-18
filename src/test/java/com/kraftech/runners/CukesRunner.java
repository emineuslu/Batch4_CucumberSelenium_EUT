package com.kraftech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/kraftech/stepDefinitions",
        dryRun = false,
        tags = "@smoke"
)
public class CukesRunner {
}
