import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {

        File inpt = new File("/Users/sailybaev/IdeaProjects/MrKhaimuldin/src/input.txt");
        Scanner read = new Scanner(inpt);
        Shape shape = new Shape();

        while (read.hasNext()) {

            String s = read.next();
            double x = Double.valueOf(s.split(",")[0]);
            double y = Double.valueOf(s.split(",")[1]);

            Point point = new Point(x, y);
            shape.addPoint(point);
        }
        

        double per = shape.calculatePerimeter();
        double avgsd = shape.getAverageSide();
        double lngstsd = shape.getLongestSide();

        System.out.println(per + " - Perimeter\n" + avgsd + " - Average Side\n" + lngstsd + " - Longest Side\n");


    }
}
