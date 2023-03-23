package repetitiveStructures.whileLoop.exercises;

import java.util.Scanner;

public class exercise_whileLoop_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solution #1
        /*boolean validPasswod = false;

        while (!validPasswod) {
            int password = sc.nextInt();
            if (password == 2002) {
                validPasswod = true;
                System.out.println("Acesso Permitido");
            } else {
                System.out.println("Senha Invalida");
            }
        }*/

        // Solution #2
        int password = sc.nextInt();

        while (password != 2002) {
            System.out.println("Senha Invalida");
            password = sc.nextInt();
        }

        System.out.println("Acesso Permitido");

        sc.close();
    }
}
