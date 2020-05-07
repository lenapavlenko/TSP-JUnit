import java.util.InputMismatchException;
import java.util.Scanner;

public class MainLab1{
    public static void main(String[] args) {
        Calculating calc;

        Scanner in = new Scanner(System.in);
        System.out.println("Input a number between -2.018 and 63.482: ");

        try {
            double n = in.nextDouble();
            calc = new Calculating(n);
            System.out.printf("№1 Equation solution : %.3f\n№2 Equation solution: %.3f\n№3 Equation solution: %.3f\n№4 Equation solution: %.3f", calc.equation1(), calc.equation2(), calc.equation3(), calc.equation4());
        } catch (Except | InputMismatchException e) {
            System.out.println("Incorrect data.Please try to enter requested number.  ");
        }
    }
}

