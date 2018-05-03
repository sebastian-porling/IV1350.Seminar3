package util;

import java.util.Objects;

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

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        final Amount other = (Amount) obj;
        if (!Objects.equals(this.amount, other.amount)){
            return false;
        }
        return true;
    }

    public Amount minus(Amount other){
        return new Amount(this.amount - other.amount);
    }

    public Amount plus(Amount other){
        return new Amount(this.amount - other.amount);
    }
}
