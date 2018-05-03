package integration;

import model.Sale;
import util.Amount;

import java.util.HashMap;

/**
 * A dummy representing a class that makes calls to a "external inventory system"
 */
public class InventorySystem {
    private HashMap<String, Item> inventory = new HashMap();
    /**
     * Creates a new instance of a dummy inventory system.
     */
    InventorySystem(){
        addItems();
    }

    /**
     * Updated the amount of items in the inventory.
     *
     * @param sale The information about the sale, contains information about the items.
     */
    public void updateInventory(Sale sale){
        
    }

    private void addItems(){
        inventory.put("Tomat", new Item(new ItemDTO(new Amount(20), "Tomat", new Amount(10)), "Tomat", new Amount(Integer.MAX_VALUE)));
        inventory.put("Gurka", new Item(new ItemDTO(new Amount(30), "Gurka", new Amount(15)), "Gurka", new Amount(Integer.MAX_VALUE)));
        inventory.put("Apelsin", new Item(new ItemDTO(new Amount(42), "Apelsin", new Amount(20)), "Apelsin", new Amount(Integer.MAX_VALUE)));
        inventory.put("Paprika", new Item(new ItemDTO(new Amount(5), "Paprika", new Amount(2)), "Paprika", new Amount(Integer.MAX_VALUE)));
    }
}
