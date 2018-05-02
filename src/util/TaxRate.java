package util;

/**
 * Represent the tax rate in percentage.
 */
public class TaxRate {
    private double taxRate;

    /**
     * Creates a new instance, representing the specified rate of tax.
     *
     * @param taxRate The rate of tax, represented by the newly created instance. Values 0,0 ... 1,0.
     */
    public TaxRate(double taxRate){
        this.taxRate = taxRate;
    }

    public double getTaxRate() {
        return taxRate;
    }
}
