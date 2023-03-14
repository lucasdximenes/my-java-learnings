package sequentialStructure.dataOutput;

import java.util.Locale;
public class dataOutput {
    public static void main(String[] args) {
        /*
        * Java data output:
        * System.out.println() - Print something on the console and jump to the next line
        * System.out.print() - Print something on the console
        * */

        // example:
        System.out.println("Data output printLn example");
        System.out.print("Data output print example");
        System.out.print("Whitout jump to the next line");
        System.out.println();

        // Printing variables:
        int y = 2;
        int x = 3;
        System.out.println(y);
        System.out.println(x);

        // Formatting print:
        /*
        * System.out.printf("format command", something);
        * */

        // example
        float floatNumber = 20.245f;
        Locale.setDefault(Locale.US); // This change application locale e.g. 12,45 => 12.45
        System.out.printf("%.2f%n", floatNumber); // Format floatNumber to two decimal places

        // concatenate

        // println | print
        System.out.println("Hello " + "World" + "!");

        // printf
        int age = 20;
        double height = 1.799;
        System.out.printf("He is %d years old and %.2f height%n", age, height);

        String name = "Maria";
        int newAge = 31;
        double income = 4000.0;
        System.out.printf("%s is %d years old and earns $%.2f%n", name, newAge, income);
    }
}
