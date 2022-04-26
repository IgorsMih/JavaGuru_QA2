package lecture10.homework.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lecture10.homework.pages.ForumLoginPage;

public class LoginPageStep {

    ForumLoginPage forumLoginPage = new ForumLoginPage();

    @When("^Set Login Name to (.*)$")
    public void setLoginName(String loginName) {
        forumLoginPage.enterLoginName(loginName);
    }

    @And("^Set Password to (.*)$")
    public void setPassword(String password) {
        forumLoginPage.enterPassword(password);
    }

    @Then("Press Submit Button")
    public void pressSubmitButton() {
        forumLoginPage.loginSubmit();
    }



}
