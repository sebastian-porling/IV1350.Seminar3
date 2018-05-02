package util;

/**
 * Representing the price of a product.
 */
public class Price {
    private int price;

    /**
     * Created a new instance, representing the specified price.
     *
     * @param price The price represented by the newly created instance.
     */
    public Price(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
