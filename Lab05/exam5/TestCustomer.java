package Lab05.exam5;

public class TestCustomer {
    public static void main(String[] args) {
        Customer obj = new Customer(111,"Ngan",10);
        System.out.println("ID is "+obj.getID());
        System.out.println("Name is "+obj.getName());
        System.out.println("Discount is "+obj.getDiscount());

        obj.setDiscount(20);
        System.out.println(obj);
    }
}
