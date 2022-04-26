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

    @And("^Set FirstName to (.*) and SecondName to (.*)$")
    public void setFirstNameAndSecondName(String firstName, String secondName) {
        forumProfilePage.inputNames(firstName, secondName);
    }

    @And("^Set Mobile to (.*)$")
    public void setMobileTo(String mobile) {
        forumProfilePage.inputPhone(mobile);
    }

    @And("^Set City to (.*)$")
    public void setCityToRezekne(String city) {
        forumProfilePage.inputCity(city);
    }

    @And("^Select Day of Birthday to (.*)$")
    public void selectDayOfBirthday(String day) {
        forumProfilePage.selectDD(day);
    }

    @And("^Select Month of Birthday to (.*)$")
    public void selectMonthOfBirthday(String month) {
        forumProfilePage.selectMonth(month);
    }

    @And("^Select Year of Birthday to (.*)$")
    public void selectYearOfBirthday(String year) {
        forumProfilePage.selectYear(year);
    }

    @And("^Select Language to (.*)$")
    public void selectLanguageToENG(String language) {
        forumProfilePage.selectLanguage(language);
    }

    @And("Select Gender")
    public void selectGender() {
        forumProfilePage.selectGenderMail();
    }

    @Then("Press Apstiprinat Button")
    public void pressApstiprinatButton() {
        forumProfilePage.pressApstiprinatButton();
    }

    @And("^Validate Names (.*) and (.*)$")
    public void validateNames(String fName, String sName) {
        forumProfilePage.validateNames(fName, sName);
    }

    @And("^Validate Mobile (.*)$")
    public void validateMobile(String mobile) {
        forumProfilePage.validatePhone(mobile);
    }

    @And("^Validate City (.*)$")
    public void validateCityRezekne(String city) {
        forumProfilePage.validateCity(city);
    }

    @And("^Validate Birthday (.*)$")
    public void validateBirthdayDay(String day) {
        forumProfilePage.validateDD(day);
    }

    @And("^Validate BirthdayM (.*)$")
    public void validateBirthdayMonth(String month) {
        forumProfilePage.validateMonth(month);
    }

    @And("^Validate BirthdayY (.*)$")
    public void validateBirthdayYear(String year) {
        forumProfilePage.validateYear(year);
    }

    @And("^Validate Language (.*)$")
    public void validateLanguageEng(String language) {
        forumProfilePage.validateLanguage(language);
    }

    @And("Validate Gender")
    public void validateGender() {
        forumProfilePage.validateMailGenderIsSelected();
    }

}
