package Session06_tryityourself;

public class Point {
    private  int x, y;
    /** Contructs a Point instance with the default values*/
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    /**Contructs a Point instance with the ghiven x and y values*/
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**Returns the value of x */
    public int getX() {return this.x;}
    /** Set the value of x */
    public void setX(int x) {this.x = x; }
    public int getY() {return this.y;}
    /** Set the value of y */
    public void setY(int y) {this.y = y; }
    /** Returns a 2-element int arry containing x and y */
    public int[] getXY() {
        int[] results  = new int[2];
        results[0] = this.x;
        results[1] = this.y;
        return results;
    }
    /** Set boh x and y */
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double distance(int x,int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    public double distance(Point another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
}
