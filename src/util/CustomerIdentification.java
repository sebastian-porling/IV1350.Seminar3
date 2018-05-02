package util;

/**
 * Represents an identification of a customer.
 */
public class CustomerIdentification {
    private String customerIdentificationNumber;

    /**
     * Creates an new instance, representing the specified customer identification.
     *
     * @param customerIdentificationNumber The identification number represented by the newly created instance.
     */
    public CustomerIdentification(String customerIdentificationNumber){
        this.customerIdentificationNumber = customerIdentificationNumber;
    }

    public String getCustomerIdentificationNumber() {
        return customerIdentificationNumber;
    }
}
