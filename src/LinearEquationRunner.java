import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter coordinate 1: ");
        String one = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        String two = scan.nextLine();


        int xOne = Integer.parseInt(one, 1, one.indexOf(","), 10);
        int yOne = Integer.parseInt(one, one.indexOf(", ") + 2, one.length() - 1, 10);
        int xTwo = Integer.parseInt(two, 1, two.indexOf(","), 10);
        int yTwo = Integer.parseInt(two, two.indexOf(", ") + 2, two.length() - 1, 10);


//        LinearEquation equ = new LinearEquation(xOne, yOne, xTwo, yTwo);
//        System.out.println(equ.slope());
//        System.out.println(equ.yIntercept());
//        System.out.println(equ.distance());
//        System.out.println(equ.equation());

//        System.out.println("The two points are (" + xOne + ", " + yOne + ") and (" + xTwo + ", " + yTwo + ")");

        int x1 = -1;
        int y1 = 5;
        int x2 = 3;
        int y2 = 10;
        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
        System.out.println("Equation: " + equation.equation());
        System.out.println("Slope: " + equation.slope());
        System.out.println("y-intercept: " + equation.yIntercept());
        System.out.println("Distance: " + equation.distance());
        System.out.println();
        System.out.println("----- Line info -----");
        System.out.println(equation.lineInfo());


//        System.out.println();
//        double testX = 4;
//        System.out.println("Coordinate for x: " + equation.coordinateForX(testX));




    }
}
