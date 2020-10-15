package Session06_tryityourself;

public class TestPoint {
    public static void main(String[] args) {
        //Test contructors and toString()
        Point p1 = new Point(1, 2);
        System.out.println(p1);//toString()
        //(1,2)
        Point p2 = new Point(); //defalut contructor
        System.out.println(p2);
        //(0,0)

        //Test Setter and Getter
        p1.setX(3);
        p1.setY(4);
        System.out.println(p1);
        //(3,4)
        System.out.println("X is: " + p1.getX());
        //X is:3
        System.out.println("Y is: " + p1.getY());
        //Y is:4

        //Test setXY() and getXY ()
        p1.setXY(5,6);
        System.out.println(p1);//toString()
        //(5,6)
        System.out.println("X is: " + p1.getXY()[0]);
        //x is:5
        System.out.println("Y is: " + p1.getXY()[1]);
        //y is:6

        //Test the 3 overloaded versions of distance()
        p2.setXY(10,11);
        System.out.printf("Distance is: %.2f%n", p1.distance(10,11));
        //Distance is: 7.07
        System.out.printf("Distance is: %.2f%n", p1.distance(p2));
        //Distance is: 7.07
        System.out.printf("Distance is: %.2f%n", p2.distance(p1));
        //Distance is: 7.07
        System.out.printf("Distance is: %.2f%n", p1.distance(p2));
        //Distance is: 7.81
    }
}
