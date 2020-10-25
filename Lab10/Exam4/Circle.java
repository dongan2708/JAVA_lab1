package Lab10.Exam4;

public class Circle implements GeometricObject {
    protected double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
    @Override
    public double getPerimeter(){
        return Math.PI * 2 * this.radius;
    }
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
}
