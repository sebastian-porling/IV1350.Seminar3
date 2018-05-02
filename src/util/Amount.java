package util;

/**
 * Represent the amount of something, like money or items.
 */
public class Amount {
    private int amount;

    /**
     * Creates an instance, representing the specified amount.
     *
     * @param amount The amount represented by the newly created instance.
     */
    public Amount(int amount){
        this.amount = amount;
    }

    /**
     * Get the value of amount.
     *
     * @return The value of amount.
     */
    public int getAmount() {
        return amount;
    }
}
