package com.blp.linecomparisonmethod;
import java.util.Scanner;
public class LineComparison_Method {
    Scanner s = new Scanner(System.in);
    double length_of_Firstline, length_of_Secondline;

    public static void main(String[] args) {
        System.out.println("Welcome to Line Computation program by class method");

        LineComparison_Method lineMethods = new LineComparison_Method();
        lineMethods.lengthOfLine1();
        lineMethods.lengthOfLine2();
        lineMethods.compareTo();
    }
    public double lengthOfLine1 () {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter x1 co-ordinate of line: ");
            int x1 = s.nextInt();
            System.out.println("Enter y1 co-ordinate of line: ");
            int y1 = s.nextInt();
            System.out.println("Enter x2 co-ordinate of line: ");
            int x2 = s.nextInt();
            System.out.println("Enter y2 co-ordinate of  line: ");
            int y2 = s.nextInt();
            s.close();
            length_of_Firstline = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            System.out.println("length of Line1: " + length_of_Firstline);
            return length_of_Firstline;
        }

        public double lengthOfLine2 () {
            System.out.println("Enter p1 co-ordinate of line: ");
            int p1 = s.nextInt();
            System.out.println("Enter q1 co-ordinate of line: ");
            int q1 = s.nextInt();
            System.out.println("Enter p2 co-ordinate of line: ");
            int p2 = s.nextInt();
            System.out.println("Enter q2 co-ordinate of  line: ");
            int q2 = s.nextInt();
            s.close();
            length_of_Secondline = Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));
            System.out.println("length of Line1: " + length_of_Secondline);
            return length_of_Secondline;
        }
    public void compareTo() {
        if (length_of_Firstline > length_of_Secondline) {
            System.out.println("Line1 is greater than line2");
        } else if (length_of_Firstline < length_of_Secondline) {
            System.out.println("Line2 is greater than line1");
        } else {
            System.out.println("Both Lines are Equal");
        }
    }
}
