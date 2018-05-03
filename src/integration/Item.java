package integration;

import util.Amount;

/**
 * Represents an Item.
 */
public class Item {
    private ItemDTO itemDescription;
    private String itemIdentifier;
    private Amount quantity;

    /**
     * Creates a new instance, represented as an item.
     *
     * @param itemDescription The description of an item.
     * @param itemIdentifier The identifier of an item.
     * @param quantity The amount if items.
     */
    public Item(ItemDTO itemDescription, String itemIdentifier, Amount quantity) {
        this.itemDescription = itemDescription;
        this.itemIdentifier = itemIdentifier;
        this.quantity = quantity;
    }

    /**
     * Get the value of quantity.
     *
     * @return The value of quantity.
     */
    public Amount getQuantity() {
        return quantity;
    }

    /**
     * Get the value of itemDescription.
     *
     * @return
     */
    public ItemDTO getItemDescription() {
        return itemDescription;
    }

    /**
     * Get the value of itemIdentifier.
     *
     * @return The value of itemIdentifier.
     */
    public String getItemIdentifier() {
        return itemIdentifier;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("item identifier: " + itemIdentifier);
        builder.append("quantity: " + quantity);
        builder.append("item description: " + itemDescription.toString());
        return builder.toString();
    }

    /**
     * Two <code>Item</code> instances are equal if all fields are equal except the quantity.
     *
     * @param obj The <code>Item</code> to compare with this <code>Item</code>.
     * @return <code>true</code> if all fields in the specified <code>Item</code> are equal to
     *         corresponding fields in this <code>Item</code> except quantity, <code>false</code> if they are not.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        final Item other = (Item) obj;
        if (!this.itemDescription.equals(other.itemDescription)){
            return false;
        }
        if (!this.itemIdentifier.equals(other.itemIdentifier)){
            return false;
        }
        return true;
    }
}
