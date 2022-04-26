package lecture10.homework.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lecture10.homework.pages.ForumProfilePage;

public class ProfilePageStep {

    ForumProfilePage forumProfilePage = new ForumProfilePage();

    @When("Click Change My Data")
    public void clickChangeMyData() {
        forumProfilePage.clickChangeMyData();
    }

    @And("Enter FirstName and SecondName")
    public void enterFirstNameAndSecondName() {
        forumProfilePage.inputNames("Igor", "Mihejev");
    }

    @And("Enter Mobile Number")
    public void enterMobileNumber() {
        forumProfilePage.inputPhone("29111111");
    }

    @And("Enter City Name")
    public void enterCityName() {
        forumProfilePage.inputCity("Rezekne");
    }

    @And("Select Day of Birthday")
    public void selectDayOfBirthday() {
        forumProfilePage.selectDD("7");
    }

    @And("Select Month of Birthday")
    public void selectMonthOfBirthday() {
        forumProfilePage.selectMonth("7");
    }

    @And("Select Year of Birthday")
    public void selectYearOfBirthday() {
        forumProfilePage.selectYear("2000");
    }

    @And("Select Language")
    public void selectLanguage() {
        forumProfilePage.selectLanguage("ENG");
    }

    @And("Select Gender")
    public void selectGender() {
        forumProfilePage.selectGenderMail();
    }

    @Then("Press Apstiprinat Button")
    public void pressApstiprinatButton() {
        forumProfilePage.pressApstiprinatButton();
    }

    @And("Validate Name")
    public void validateName() {
        forumProfilePage.validateNames("Igor", "Mihejev");
    }

    @And("Validate Mobile")
    public void validateMobile() {
        forumProfilePage.validatePhone("29111111");
    }

    @And("Validate City")
    public void validateCity() {
        forumProfilePage.validateCity("Rezekne");
    }

    @And("Validate Day of Birthday")
    public void validateDayOfBirthday() {
        forumProfilePage.validateDD("7");
    }

    @And("Validate Month of Birthday")
    public void validateMonthOfBirthday() {
        forumProfilePage.validateMonth("7");
    }

    @And("Validate Year of Birthday")
    public void validateYearOfBirthday() {
        forumProfilePage.validateYear("2000");
    }

    @And("Validate language")
    public void validateLanguage() {
        forumProfilePage.validateLanguage("1000");
    }

    @And("Validate Gender")
    public void validateGender() {
        forumProfilePage.validateMailGenderIsSelected();
    }

}
