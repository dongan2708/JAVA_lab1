package Lab02;

public class customer1 {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;
    private int CustomerId;

    void changeCustomerAddress (String address) {
        customerAddress = address;
    }
    void displayCustomerInformation() {
        System.out.println("Customer Identification Number: " + customerID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Address: " + customerAddress);
        System.out.println("Customer Age: " + customerAge);
    }
    public static void main(String[] args) {
        customer1 objCustomer = new customer1();

        objCustomer.customerID= 100;
        objCustomer.customerName = "Jack";
        objCustomer.customerAddress = "123 Street";
        objCustomer.customerAge = 30;

        objCustomer.displayCustomerInformation();

        objCustomer.changeCustomerAddress("123 Fort, Main Street");

        objCustomer.displayCustomerInformation();
    }
}
