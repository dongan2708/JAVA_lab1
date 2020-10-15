package Lab05.exam6;

public class TestCustomer {
    public static void main(String[] args) {
        Customer obj = new Customer(123,"Ngan",'F');

        System.out.println("Id is "+obj.getID());
        System.out.println("Name is "+obj.getName());
        System.out.println("Gender is "+obj.getGender());

        System.out.println(obj);
    }
}
