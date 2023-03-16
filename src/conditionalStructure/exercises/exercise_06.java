package conditionalStructure.exercises;

import java.util.Scanner;

public class exercise_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float interval = sc.nextFloat();

        if (interval >= 0 && interval <= 25) {
            System.out.println("Intevalo [0, 25]");
        } else if (interval > 25 && interval <= 50) {
            System.out.println("Intevalo (25, 50]");
        } else if (interval > 50 && interval <= 75) {
            System.out.println("Intevalo (50, 75]");
        } else if (interval > 75 && interval <= 100) {
            System.out.println("Intevalo (75, 100]");
        } else {
            System.out.println("Fora de intervalo");
        }

        sc.close();
    }
}
