package session07;

public class Circle1 {
    float area;
    public float getPI() {
        return (float) 3.14;
    }
    public void calcArea(int rad) {
        this.area = getPI() * rad * rad;
    }
}
