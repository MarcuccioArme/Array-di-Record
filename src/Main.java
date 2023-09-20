import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanti record vuoi inserire?");
        System.out.print("Quantità: ");
        int quantity = scanner.nextInt();

        Persona[] persone = new Persona[quantity];

        for (int i=0; i<quantity; i++) {

            System.out.print("\nInserisci il nome: ");
            String nome = scanner.next();

            System.out.print("Inserisci il cognome: ");
            String cognome = scanner.next();

            System.out.print("Inserisci l'età: ");
            int eta = scanner.nextInt();

            persone[i] = new Persona(nome, cognome, eta);

            System.out.println("\nRecord aggiunto.");
        }

        for (Persona persona : persone) {
            System.out.println("\nNome: " + persona.nome() + ", Cognome: " + persona.cognome() + ", Età: " + persona.eta());
        }

        scanner.close();
    }
}