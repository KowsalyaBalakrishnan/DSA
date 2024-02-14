package polynomials;

import java.util.Scanner;

public class PolynomialAddition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first expression => ");
        System.out.println("Enter the number of terms for first expression => ");
        int terms1 = scanner.nextInt();
        PolynomialTerm[] firstExpress = new PolynomialTerm[terms1];
        getPolynomialExpression(terms1, firstExpress, scanner);

        System.out.println("Enter the number of terms for second expression => ");
        int terms2 = scanner.nextInt();
        PolynomialTerm[] secondExpress = new PolynomialTerm[terms2];
        getPolynomialExpression(terms2, secondExpress, scanner);

        int max = Math.max(terms1, terms2);
        PolynomialTerm[] result = new PolynomialTerm[max];
        addPolynomialExpressions(firstExpress, secondExpress, result);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i].getCoefficient() + "x^" + result[i].getExponent());
            if (i + 1 < result.length) {
                System.out.print(" + ");
            }
        }

    }

    private static void addPolynomialExpressions(PolynomialTerm[] firstExpress, PolynomialTerm[] secondExpress, PolynomialTerm[] result) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < firstExpress.length && j < secondExpress.length) {
            result[k] = new PolynomialTerm();
            if (firstExpress[i].getExponent() == secondExpress[j].getExponent()) {
                result[k].setCoefficient(firstExpress[i].getCoefficient() + secondExpress[j].getCoefficient());
                result[k].setExponent(firstExpress[i].getExponent());
                k++;
                i++;
                j++;
            } else if (firstExpress[i].getExponent() > secondExpress[j].getExponent()) {
                result[k].setCoefficient(firstExpress[i].getCoefficient());
                result[k].setExponent(firstExpress[i].getExponent());
                k++;
                i++;
            } else if (secondExpress[j].getExponent() > firstExpress[i].getExponent()) {
                result[k].setCoefficient(secondExpress[j].getCoefficient());
                result[k].setExponent(secondExpress[j].getExponent());
                k++;
                j++;
            }
        }
    }

    private static void getPolynomialExpression(int terms, PolynomialTerm[] polynomialTerms, Scanner scanner) {
        for (int i = 0; i < terms; i++) {
            polynomialTerms[i] = new PolynomialTerm();
            System.out.println("Enter the coefficient => ");
            polynomialTerms[i].setCoefficient(scanner.nextInt());
            System.out.println("Enter the exponent => ");
            polynomialTerms[i].setExponent(scanner.nextInt());
        }
    }
}
