package Lab08.Exam3;

public class TestPerson {
    public static void main(String[] args) {
        Person obj = new Person("Ngan","Ha Noi");
        obj.getName();
        obj.getAddress();
        obj.toString();

        Person std = new Student("Ngan","Ha Noi","IT",2020,1000);
        std.toString();

        Staff stf=new Staff("Ngan","Ha Noi","IT",2000);
        stf.getPay();
    }

}
