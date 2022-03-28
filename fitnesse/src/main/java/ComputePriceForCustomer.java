import fit.ColumnFixture;

import java.math.BigDecimal;

public class ComputePriceForCustomer extends ColumnFixture {
    private String customerName;
    private String customerType;
    private String fabricName;
    private double fabricPrice;
    private int length;
    private double totalPrice;

    public ComputePriceForCustomer() {
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public void setFabricName(String fabricName) {
        this.fabricName = fabricName;
    }

    public void setFabricPrice(double fabricPrice) {
        this.fabricPrice = fabricPrice;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double totalPrice(){
        FabricPriceComputation computation=new FabricPriceComputation();

        Fabric fabric=new Fabric();
        fabric.setPrice(BigDecimal.valueOf(fabricPrice));
        fabric.setName(fabricName);

        Customer customer=new Customer();
        customer.setName(customerName);
        customer.setCustomerType(CustomerType.valueOf(customerType));

        return computation.computePrice(customer, fabric, length).doubleValue();
    }
}
