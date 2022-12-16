package com.dogus.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"json:target/cucumber.json",
                    "html:target/default-html-reports.html"},

            monochrome = true,
            features = "src/test/resources/feature",
            glue = "com/dogus/stepdefinitions",
            dryRun = false,
            tags = ""
    )

    class CukesRunner {
}
