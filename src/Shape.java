import java.util.ArrayList;
public class Shape {
    private ArrayList<Point> points = new ArrayList<>();

    public Shape() {}

    public void addPoint(Point point) {
        points.add(point);
    }

    public double calculatePerimeter() {
        double perimeter = 0.0;
        for (int i = 0; i < points.size() - 1; i++) {
            Point current = points.get(i);
            Point next = points.get(i + 1);
            perimeter += current.distanceTo(next);
        }
        perimeter += points.get(points.size() - 1).distanceTo(points.get(0));
        return perimeter;
    }

    public double getAverageSide() {
        return calculatePerimeter() / points.size();
    }

    public double getLongestSide() {
        double maxDistance = 0.0;
        for (int i = 0; i < points.size() - 1; i++) {
            Point current = points.get(i);
            Point next = points.get(i + 1);
            double distance = current.distanceTo(next);
            if (distance > maxDistance) {
                maxDistance = distance;
            }
        }
        double distance = points.get(points.size() - 1).distanceTo(points.get(0));
        if (distance > maxDistance) {
            maxDistance = distance;
        }
        return maxDistance;
    }
}