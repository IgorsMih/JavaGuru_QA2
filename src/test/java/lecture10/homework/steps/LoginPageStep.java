package lecture10.homework.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lecture10.homework.pages.ForumLoginPage;

public class LoginPageStep {

    ForumLoginPage forumLoginPage = new ForumLoginPage();

    @When("Enter Login Name")
    public void enterLoginName() {
        forumLoginPage.enterLoginName("mihejevs.igors@gmail.com");
    }

    @And("Enter Password")
    public void enterPassword() {
        forumLoginPage.enterPassword("IM020660");
    }

    @Then("Press Submit Button")
    public void pressSubmitButton() {
        forumLoginPage.loginSubmit();
    }
}
