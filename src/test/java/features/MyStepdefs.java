package features;

import CoffeeMaker.CoffeeMaker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStepdefs {

    CoffeeMaker coffeemaker1 = new CoffeeMaker();

    @Given("There is at least {int} coffee left when ordering {int} in the machine.")
    public void thereIsAtLeastNumberCoffeeLeftWhenOrderingNumberInTheMachine(int stockCoffee, int orderedQty) {
        coffeemaker1.setQtyCoffee(stockCoffee);
        coffeemaker1.checkQuantity(orderedQty);
    }

    @Given("I have deposited at least {int} kr and ordered no more than {int} units.")
    public void iHaveDepositedAtLeastNumberKrAndOrderedNoMoreThanNumberUnits(int payment, int units) {
        coffeemaker1.setDeposit(payment);
        coffeemaker1.orderQuantity(units);
    }

    @When("I choose {string} and {string}.")
    public void iChooseAnd(String type, String size) {
        coffeemaker1.setType(type);
        coffeemaker1.setSize(size);
    }

    @When("I choose {string}.")
    public void iChoose(String additions) {
        coffeemaker1.setExtras(additions);
    }

    @Then("Stock displayed will be {string}.")
    public void stockDisplayedWillBe(String expected) {
        String actual =coffeemaker1.getStock();
        assertEquals(expected,actual);
    }
    @Then("I will get served a {string}.")
    public void iWillGetServedA(String expected) {
        coffeemaker1.summarizeOrder();
        String actual = coffeemaker1.getOrder();
        assertEquals(expected, actual);
    }
}
