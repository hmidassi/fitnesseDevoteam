import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;

public class StepDefinitions {

    private Fabric fabric;
    private Customer customer;
    private Integer length;

    private FabricPriceComputation computation= new FabricPriceComputation();

    @Given("satin costs {double} euros per meter")
    public void satin_costs_euros_per_meter(Double double1) {
        fabric = new Fabric();
        fabric.setName("satin");
        fabric.setPrice(BigDecimal.valueOf(double1));
    }
    @When("an individual buys {int} meters")
    public void an_individual_buys_meters(Integer int1) {
        customer =new Customer();
        customer.setCustomerType(CustomerType.INDIVIDUAL);
        length = int1;
    }

    @When("a professional buys {int} meters")
    public void a_professional_buys_meters(Integer int1) {
        customer =new Customer();
        customer.setCustomerType(CustomerType.PROFESSIONAL);
        length = int1;
    }

    @Then("the cost should be {double} euros")
    public void the_cost_should_be_euros(Double price) {
        Assertions.assertEquals(BigDecimal.valueOf(price).setScale(2), computation.computePrice(customer, fabric, length).setScale(2));
    }
}
