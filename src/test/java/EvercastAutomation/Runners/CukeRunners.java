package EvercastAutomation.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources/features",
            glue = "EvercastAutomation/StepDefinitions",
            dryRun = false,
//            monochrome = true,
//            strict = true,
            tags = "@DemoNegative, @DemoPositive" ,
//
            plugin = {"html:target/default-cucumber-reports",
                        "json:target/cucumber.json",
//

                    //"pretty","html:target/cucumber"
                    //"junit:target/cukes.xml"
            }
    )

    public class CukeRunners{

    }

