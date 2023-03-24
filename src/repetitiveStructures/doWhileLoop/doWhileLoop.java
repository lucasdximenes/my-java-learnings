package repetitiveStructures.doWhileLoop;

import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {
        // `do/while` loop
        /*
        * `do/while` loop iterate at least once
        * because the condition is verified only at the end
        *
        * sytax:
        *
        * do {
        *   <command>
        * } while (<condition>);
        * */
        // ex:
        /*
        * Create a program to convert `Celsius` temperature to `Fahrenheit`
        * and ask the user if he wants to repeat the conversion with other values...
        * (s/n) = s => Yes; n => No;
        * F = (9C / 5) + 32
        * */
        Scanner sc = new Scanner(System.in);

        char resp;
        do {
            System.out.println("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();

            double F = 9 * C / 5 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);

            System.out.println("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');

        sc.close();
    }
}
