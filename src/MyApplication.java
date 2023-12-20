import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Shape shape = new Shape();
        int n = scan.nextInt();
        for(int i=0;i<n;i++) {
            double x = scan.nextInt();
            double y = scan.nextInt();
            Point point = new Point(x,y);

            shape.addPoint(point);
        }

        double per = shape.calculatePerimeter();
        double avgsd = shape.getAverageSide();
        double lngstsd = shape.getLongestSide();

        System.out.println(per + "\n" + avgsd + "\n" + lngstsd + "\n");


    }
}
