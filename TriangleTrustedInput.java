import java.util.Scanner;
import java.lang.Math;

public class TriangleTrustedInput {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    double side1, side2, side3;

    System.out.print("Enter the lengths of the 3 sides of the triangle..\nSide 1: ");
    side1 = scanner.nextDouble();
    System.out.print("Side 2: ");
    side2 = scanner.nextDouble();
    System.out.print("Side 3: ");
    side3 = scanner.nextDouble();

    //makes sure that dimensions make a triangle
    if ((side1 + side2 > side3) && (side1 + side3 > side2) &&
        (side2 + side3 > side1)) {

        //checks formula to see if traingle is right
        //if within 0.2, angle is considered to be 90deg(my own rounding)
        // |a^2 + b^2 - c^2| < 0.2
        if ((Math.abs((side1*side1) + (side2*side2) - (side3*side3)) < 0.2 ) ||
            (Math.abs((side1*side1) + (side3*side3) - (side2*side2)) < 0.2 ) ||
            (Math.abs((side3*side3) + (side2*side2) - (side1*side1)) < 0.2 )) {
                if (side1==side2 || side1==side3 || side2==side3) {
                  System.out.println("This is an isosceles right triangle! ");
                }
                else {
                  System.out.println("This is a right triangle! ");
                }
              }

        else if (side1 == side2 && side2 == side3) {
          System.out.println("This is an equilateral triangle! ");
        }
        else if (side1==side2 || side1==side3 || side2==side3) {
          System.out.println("This is an isosceles triangle! ");
        }
        else {
          System.out.println("This isn't a special triangle. ");
        }
    }
    else {
      System.out.println("The dimensions you entered don't make a triangle. ");
    }
  }
}
