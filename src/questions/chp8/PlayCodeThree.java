package questions.chp8;

import java.util.Scanner;

import static java.lang.System.in;

public class PlayCodeThree {
    public static void main(String[] args) {
        double[][] points = {
                {-1, 0, 3}, {-1,-1,-1}, {4,1,1}, {2, 0.5, 9},
                {3.5, 2,-1}, {3,1.5,3}, {-1.5,4,2}, {5.5, 4,-0.5}
        };

        int p1 = 0, p2 = 1, ;
        19 double shortestDistance = distance(points[p1][0], points[p1][1],
                20 points[p2][0], points[p2][1]);
    }
    public static double distance(double x1, double y1, double x2, double y2, double x3, double y3) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (y3 - y2) * (y3 - y2));
    }
}
