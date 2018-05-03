package controller;

import integration.*;
import model.CashRegister;
import model.Sale;
import util.Amount;
import util.CustomerIdentification;

/**
 *  The pos applications only controller, all calls to the model is passed through here.
 */
public class Controller {
    private AccountingSystem accountingSystem;
    private InventorySystem inventorySystem;
    private DiscountCatalog discountCatalog;
    private ItemCatalog itemCatalog;
    private Printer printer;
    private CashRegister cashRegister;
    private Sale sale;

    /**
     * Creates a new instance.
     *
     * @param systemCreator     Used to get all classes that handles external system calls.
     * @param catalogCreator    Used to get all classes that handles database calls.
     * @param printer           Interface to printer.
     */
    public Controller(SystemCreator systemCreator, CatalogCreator catalogCreator, Printer printer){
        this.accountingSystem = systemCreator.getAccountingSystem();
        this.inventorySystem = systemCreator.getInventorySystem();
        this.discountCatalog = catalogCreator.getDiscountCatalog();
        this.itemCatalog = catalogCreator.getItemCatalog();
        this.printer = printer;
        this.cashRegister = new CashRegister();
    }

    public void startNewSale(){
        this.sale = new Sale();
    }

    public String registerItem(String itemIdentifier, Amount quantity){
        return displaySale();
    }

    public String displaySale(){
        return "";
    }

    public String lookForDiscount(CustomerIdentification customerIdentification){
        return displaySale();
    }

    public void pay(Amount paidAmount){

    }

}
