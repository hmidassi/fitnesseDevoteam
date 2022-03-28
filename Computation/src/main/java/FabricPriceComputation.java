import java.math.BigDecimal;

public class FabricPriceComputation {
    public BigDecimal computePrice(Customer customer, Fabric fabric, Integer length) {
        switch (customer.getCustomerType()) {
            case INDIVIDUAL:
                return fabric.getPrice().multiply(BigDecimal.valueOf(length)).multiply(BigDecimal.valueOf(1.20));
            case PROFESSIONAL:
                if(length >= 50 && length < 250){
                    return fabric.getPrice().multiply(BigDecimal.valueOf(length)).multiply(BigDecimal.valueOf(0.95));
                } else if(length >= 250){
                    return fabric.getPrice().multiply(BigDecimal.valueOf(length)).multiply(BigDecimal.valueOf(0.85));
                }
                return fabric.getPrice().multiply(BigDecimal.valueOf(length));
            default:
                return BigDecimal.ZERO;
        }
    }
}
