package academy.learnprogramming;


//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//
//        //Point 1
//        double x1, y1;
//
//        //Point 2
//        double x2, y2;
//
//        //Creating Scanner Object
//        Scanner sc = new Scanner(System.in);
//
//        //Point 1 Input
//        x1 = sc.nextDouble();
//        y1 = sc.nextDouble();
//
//        //Point 2 Input
//        x2 = sc.nextDouble();
//        y2 = sc.nextDouble();
//
//        //Calculating Distance between 2 Points
//        double Dist;
//        Dist = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
//
//        //Print Distance 4th Decimal
//        System.out.printf("%.4f\n",Dist);
//
//
//
//
//
//    }
//}
//

public class Main {

//    public static void main(String[] args) {
//        getDistance();
//    }

    public static void main(String[] args) {
        distanceFinder d1 = new distanceFinder();
        distanceFinder d2 = new distanceFinder();
        distanceFinder d3 = new distanceFinder();
        distanceFinder d4 = new distanceFinder();

        double distance = d1.getDistance(new Point(3.0, 4.0), new Point(5.0, 7.0));
        System.out.println(distance);
     /// double distanc2 = d2.getDistance(new Point(6, 8), new Point(3, 7.0));
        ///System.out.printf("%.4f\n", distanc2);

        double expected = 3.605551275463989;
        double actual = distance;
        Boolean bool = AssertTrue(expected, actual);

    System.out.println(bool);

    }

    public static Boolean AssertTrue(double expected, double actual) {
        if (expected == actual) {
            return true;
        } else {
            return false;
        }
    }
}


class distanceFinder {
    public double getDistance(Point point1, Point point2) {
        //Calculating Distance between 2 Points
        return Math.sqrt(Math.pow((point2.x - point1.x), 2) + Math.pow((point2.y - point1.y), 2));
    }
}


class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
