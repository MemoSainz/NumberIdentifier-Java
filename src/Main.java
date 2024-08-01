import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int vector[] = new int[15];
        Scanner teclado = new Scanner(System.in);

        System.out.println("Hello! This is a program that will tell you \n " +
                "how many times you wrote the number 3. \n" +
                "So, please, write the numbers you desire, \n " +
                "you can insert at max 15 numbers." +
                "\n");
        // cargar vector:
        for (int i = 0; i < 15; i++) {
            System.out.println("Insert a number for the vector");
            vector[i] = teclado.nextInt();

        }

        // recorrer para ver cuantos números 3 hay
        int cont = 0;

        for (int i = 0; i < 15; i++) {
            if (vector[i] == 3) {
                cont = cont + 1;
            }
        }

        System.out.println("The quantity of number 3 that you wrote is: " + cont + " time(s).");
        System.out.println("\n " +
                "Thank you for testing this app in your terminal \n " +
                "Please, visit my github: \n" +
                "https://github.com/MemoSainz/");

    }
}