package lecture10.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lecture8.pages.CarsPagePom;

public class CarsPageSteps {

    CarsPagePom carsPagePom = new CarsPagePom();

    @And("Validate that CarsPage is open")
    public void validateThatCarsPageIsOpen() {
        carsPagePom.validatePageUrl();
    }

    @When("^Set Cars min price to (.*) and max price (.*)$")
    public void setCarsMinPriceToAndMaxPrice(String minPrice, String maxPrice) {
        carsPagePom.setPrice(minPrice, maxPrice);
    }

    @And("^Set year from (.*)$")
    public void setYearFrom(String year) {
        carsPagePom.selectYearMin(year);
    }

    @And("^Change min engine to (.*)$")
    public void changeMinEngineTo(String minEngine) {
        carsPagePom.selectMinEngine(minEngine);
    }

    @And("^Change max engine to (.*)$")
    public void changeMaxEngineTo(String maxEngine) {
        carsPagePom.selectMinEngine(maxEngine);
    }

    @And("^Change color to Balta$")
    public void changeColorToBalta(String color) {
        carsPagePom.selectColorBalta(color);
    }

    @Then("Press submit button")
    public void pressSubmitButton() {
        carsPagePom.pressMekletButton();
    }
}
