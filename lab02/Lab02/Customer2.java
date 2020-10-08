package Lab02;

public class Customer2 {
    int customerId;
    String customerName;
    String customerAdress;
    int customerAge;


    public static void main(String[] args) {
        Customer2 objCustomer1 = new Customer2();
        objCustomer1.customerId = 100;
        objCustomer1.customerName = "John";
        objCustomer1.customerAdress = "123 Street";
        objCustomer1.customerAge = 30;
        System.out.println(objCustomer1.customerId);
        System.out.println(objCustomer1.customerAdress);
    }
}
