package util;

/**
 * Represents a quantity of a product.
 */
public class Quantity {
    private int quantity;

    /**
     * Creates a new instance, representing the specified quantity.
     *
     * @param quantity The quantity represented by the newly created instance.
     */
    public Quantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
