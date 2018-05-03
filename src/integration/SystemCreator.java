package integration;

/**
 * A object that initiates the systems needed for the application,
 * accounting system and inventory system.
 */
public class SystemCreator {
    private AccountingSystem accountingSystem;
    private InventorySystem inventorySystem;

    /**
     * Creates the system creator.
     */
    public SystemCreator(){
        accountingSystem = new AccountingSystem();
        inventorySystem = new InventorySystem();
    }

    public AccountingSystem getAccountingSystem() {
        return accountingSystem;
    }

    public InventorySystem getInventorySystem() {
        return inventorySystem;
    }
}
