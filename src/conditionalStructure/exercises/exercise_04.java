package conditionalStructure.exercises;

import java.util.Scanner;

public class exercise_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int initialHour = sc.nextInt();
        int lastHour = sc.nextInt();

        if (initialHour < lastHour) {
            System.out.printf("O JOGO DUROU %d HORA(S)", lastHour - initialHour);
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S)", (24 - initialHour) + lastHour);
        }

        sc.close();
    }
}
