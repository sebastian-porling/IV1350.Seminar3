package util;

/**
 * Represent the Amount of Tax.
 */
public class TaxAmount {
    private int taxAmount;

    /**
     * Creates a new instance, representing the specified amount of tax.
     *
     * @param taxAmount The amount of tax represented by the newly created instance.
     */
    public TaxAmount(int taxAmount){
        this.taxAmount = taxAmount;
    }

    public int getTaxAmount() {
        return taxAmount;
    }
}
