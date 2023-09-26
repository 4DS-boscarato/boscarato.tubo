import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int altezza;
        int raggio;

        System.out.print("Inserisci l'altezza del tubo: ");
        altezza = input.nextInt();

        System.out.print("Inserisci il raggio del tubo: ");
        raggio = input.nextInt();

        Tubo t1 = new Tubo(altezza, raggio);

        System.out.println("\nLa superfice totale del tubo e`: " + t1.superficeTot());
        System.out.println("Il volume del tubo e`: " + t1.volume());
    }
}