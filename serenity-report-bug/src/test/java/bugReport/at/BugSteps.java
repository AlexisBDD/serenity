package bugReport.at;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.Named;

import static org.junit.Assert.assertTrue;


/**
 * Created by 212547787 on 6/21/2016.
 */
public class BugSteps {
    @Given("myGiven")
    public void givenMyGiven() {
    }

    @When("myWhen")
    public void whenMyWhen() {
    }

    @Then("test will <result>")
    public void thenResultIsresult(@Named("result") String result) {
            assertTrue(result.equals("succes"));
    }
}
