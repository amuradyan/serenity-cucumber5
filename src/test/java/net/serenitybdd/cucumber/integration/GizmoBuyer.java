package net.serenitybdd.cucumber.integration;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Created by john on 23/07/2014.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/samples/data_driven_scenario.feature")
public class GizmoBuyer {}
