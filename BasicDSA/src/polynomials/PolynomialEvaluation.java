package polynomials;

import java.util.Scanner;

public class PolynomialEvaluation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of terms");
        int numberOfTerms = scanner.nextInt();

        PolynomialTerm[] polynomialTerm = new PolynomialTerm[numberOfTerms];
        System.out.println("Enter the terms:-\n");
        for (int i = 0; i < numberOfTerms; i++) {
            polynomialTerm[i] = new PolynomialTerm();
            System.out.println("Enter the Coefficient => ");
            polynomialTerm[i].setCoefficient(scanner.nextInt());
            System.out.println("Enter the Exponent => ");
            polynomialTerm[i].setExponent(scanner.nextInt());
        }

        System.out.println("Enter the value of x => ");
        int x = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i < polynomialTerm.length; i++) {
            sum += polynomialTerm[i].getCoefficient() * (Math.pow(x, polynomialTerm[i].getExponent()));
        }

        System.out.println("For the supplied value of x = " + x + ", the polynomialTerm evaluation is " + sum);
    }
}
