package view;

import controller.Controller;
import util.Amount;

/**
 * This application does not have an "actual" view.
 * This class is a placeholder for a view that can make a sample execution
 */
public class View {
    private Controller controller;

    /**
     *  Creates a new instance, represented as a view.
     * @param controller The class where all calls are being made.
     */
    public View(Controller controller){
        this.controller = controller;
    }

    /**
     *  Makes a sample execution of the application.
     *  AKA, simulating someone making inputs to the application.
     */
    public void sampleExecution(){
        System.out.println("Cashier starts new sale.\n");
        controller.startNewSale();
        System.out.println("Cashier enter items. \n");
        String out = controller.registerItem("Tomat", new Amount(1));
        System.out.println(out);
        out = controller.registerItem("Gurka", new Amount(4));
        System.out.println(out);
        out = controller.registerItem("Tomat", new Amount(5));
        System.out.println(out);
        out = controller.registerItem("Apelsin", new Amount(20));
        System.out.println(out);
        out = controller.registerItem("Paprika", new Amount(2));
        System.out.println(out);
        out = controller.displayTotalWithTax();
        System.out.println(out);
        out = controller.pay(new Amount(2000));
        System.out.println(out);
    }
}
