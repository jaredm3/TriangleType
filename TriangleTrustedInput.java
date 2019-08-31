import java.util.Scanner;

public class TriangleMain {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    double side1, side2, side3;

    System.out.print("Enter the lengths of the 3 sides of the triangle..\nSide 1: ");
    side1 = scanner.nextDouble();
    System.out.print("Side 2: ");
    side2 = scanner.nextDouble();
    System.out.print("Side 3: ");
    side3 = scanner.nextDouble();


    if (side1 == side2 && side2 == side3) {
      System.out.println("That's an equilateral triangle! ");
    }
    
    else if (side1 == side2) {
      if (((side1*side1) + (side2*side2) - (side3*side3)) < 0.2 ) {
        System.out.println("This is a right triangle! ");
      }
      else {
        System.out.println("This is an isosceles triangle! ");
      }
    }
    else if (side1 == side3) {
      if (((side1*side1) + (side3*side3) - (side2*side2)) < 0.2 ) {
        System.out.println("This is a right triangle! ");
      }
      else {
        System.out.println("This is an isosceles triangle! ");
      }
    }
    else {
      if (((side2*side2) + (side3*side3) - (side1*side1)) < 0.2 ) {
        System.out.println("This is a right triangle! ");
      }
      else {
        System.out.println("This is an isosceles triangle! ");
      }
    }
  }
}
