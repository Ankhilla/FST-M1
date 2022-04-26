package StepDefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;

public class TagsHooksExampleSteps {

    @Given("^User opens a page$")
    public void userOpensPage(){
        System.out.println("Open page for Scenario");
    }
    @When("^User performs an action$")
    public void userPerformsAction(){
        System.out.println("User Clicks a Button");
    }
    @Then("^Do Action for first scenario$")
    public void Scenario1Action(){
        System.out.println("Actions for the first Scenario executed");
    }
    @Then("^Do Action for Second scenario$")
    public void Scenario2Action(){
        System.out.println("Actions for the Second Scenario executed");
    }
    @Then("^Do Action for Third scenario$")
    public void Scenario3Action(){
        System.out.println("Actions for the Third Scenario executed");
    }
    @Then("^Do Action for Fourth scenario$")
    public void Scenario4Action(){
        System.out.println("Actions for the Fourth Scenario executed");
    }


}


