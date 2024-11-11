package com.epam.gym.desktop.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/desktop/notepad.feature",
        glue = {"com.epam.gym.desktop.stepdefinations"},
        plugin = {"pretty", "json:build/reports/cucumber/report.json","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
)

public class NotepadRunner extends AbstractTestNGCucumberTests {

}
