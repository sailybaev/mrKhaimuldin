public class Point {
    private double x;
    private double y;

    public Point(){}

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point anotherPoint) {
        return Math.sqrt(Math.pow((anotherPoint.x - this.x), 2) + Math.pow((anotherPoint.y - this.y), 2));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}