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

        if(xOne == xTwo) {
            System.out.println("This forms a vertical line: x = " + xOne);
            System.exit(20);
        }


        LinearEquation equ = new LinearEquation(xOne, yOne, xTwo, yTwo);
        System.out.println(equ.lineInfo());
        System.out.print("Enter a x value: ");
        double value = scan.nextDouble();
        System.out.println(equ.coordinateForX(value));




    }
}
