package model;

import util.Amount;

/**
 *  Represents a payment of a specific sale.
 */
public class Payment {
    private Amount paidAmount;
    private Total total;

    /**
     * Creates a new instance, represented as a payment.
     *
     * @param paidAmount
     * @param total
     */
    public Payment(Amount paidAmount, Total total){
        this.paidAmount = paidAmount;
        this.total = total;
    }

    /**
     * Get the total cost of the payment.
     *
     * @return The total cost.
     */
    public Total getTotal() {
        return total;
    }

    /**
     *  Calculates the amount of change and returns it as an <code>Amount</code>
     *
     * @return The total change as <code>Amount</code>
     */
    public Amount getChange(){
        return paidAmount.minus(total.getTotalWithTax());
    }



}
