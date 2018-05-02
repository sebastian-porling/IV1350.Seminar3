package util;

/**
 * Represents an discount with certain rules.
 */
public class DiscountRule {
    private double discountRate;

    /**
     * Creates a new instance, representing a discount rule.
     *
     * @param discountRate The discount rate represented by the newly created instance.
     */
    public DiscountRule(double discountRate){
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }
}
