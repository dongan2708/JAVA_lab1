package session07;

class Circle {
    public double getPI(){
        return 3.14;
    }
}
class PassByRef {
    public void calcArea(Circle objPi, double rad) {
        double area = objPi.getPI() * rad * rad;
        System.out.println("Area of the circle is" + area);
    }

    public static void main(String[] args) {
        PassByRef p1 = new PassByRef();
        p1.calcArea(new Circle(), 2);
    }
}
