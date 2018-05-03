package integration;

import util.Amount;

import java.util.HashMap;

/**
 * Represents a dummy item database.
 */
public class ItemCatalog {
    HashMap<String, ItemDTO> itemList;

    /**
     *  Creates a instance of a dummy item database.
     */
    ItemCatalog(){
        addItems();
    }

    /**
     *  Checks if the searched itemIdentifier exists in the database.
     *
     * @param itemIdentifier The looked item.
     * @return If item exists <code>true</code> else <code>false</code>
     */
    public boolean lookUpItem(String itemIdentifier){
        return itemList.containsKey(itemIdentifier);
    }

    /**
     * Gets the item description of the specified itemIdentifier.
     * Returns an item with the specified quantity.
     *
     * @param itemIdentifier The identifier of an item.
     * @param quantity The amount of items.
     * @return An item with it's itemDescription and quantity.
     */
    public Item getItem(String itemIdentifier, Amount quantity){
        if (lookUpItem(itemIdentifier)){
            return new Item(itemList.get(itemIdentifier), itemIdentifier, quantity);
        }
        return null;
    }

    private void addItems(){
        itemList.put("Tomat", new ItemDTO(new Amount(20), "Tomat", new Amount(10)));
        itemList.put("Gurka", new ItemDTO(new Amount(30), "Gurka", new Amount(15)));
        itemList.put("Apelsin", new ItemDTO(new Amount(42), "Apelsin", new Amount(20)));
        itemList.put("Paprika", new ItemDTO(new Amount(5), "Paprika", new Amount(2)));
    }
}
