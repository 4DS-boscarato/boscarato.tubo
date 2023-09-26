import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int altezza;
        int raggio;

        System.out.println("Inserisci l'altezza del tubo: ");
        altezza = input.nextInt();

        System.out.println("Inserisci il raggio del tubo: ");
        raggio = input.nextInt();

        Tubo t1 = new Tubo(altezza, raggio);

        System.out.println("La superfice totale del tubo e`: " + t1.superficeTot());
        System.out.println("il volume del tubo e`: " + t1.volume());

    }
}