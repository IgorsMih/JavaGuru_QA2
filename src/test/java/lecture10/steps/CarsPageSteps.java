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

    @When("^Set min price to (.*) and max price to (.*)$")
    public void setMinPriceToAndMaxPriceTo(String minPrice, String maxPrice) {
        carsPagePom.setPrice(minPrice, maxPrice);
    }

    @And("Set year from {int}")
    public void setYearFrom(int arg0) {

    }

    @And("Change max engine to {double}")
    public void changeMaxEngineTo(int arg0, int arg1) {

    }

    @And("Change color to Balta")
    public void changeColorToBalta() {

    }

    @Then("Press submit button")
    public void pressSubmitButton() {
    }



}
