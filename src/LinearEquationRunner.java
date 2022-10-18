import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter coordinate 1: "  );
        String one =  scan.nextLine();
        System.out.print("Enter coordinate 2: "  );
        String two = scan.nextLine();

        int xOne = Integer.parseInt(one, 2, one.indexOf(","), 10);
        int yOne = Integer.parseInt(one, one.indexOf(", ") +2, two.length()-1 ,10);
        int xtwo = Integer.parseInt(two, 2, two.indexOf(","), 10);
        int ytwo = Integer.parseInt(two, two.indexOf(", ") +2, two.length()-1 ,10);

        System.out.println("The two points are (" + xOne+ ", " + yOne + ") and (" + xtwo + ", " + ytwo + ")");
    }

}
