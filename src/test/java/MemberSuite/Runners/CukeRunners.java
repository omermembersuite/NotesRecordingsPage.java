package MemberSuite.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources/features",
            glue = "MemberSuite/StepDefinitions",
            dryRun = false,
//            monochrome = true,
            strict = true,
            tags = "@LoginIndividualPositive" ,

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

