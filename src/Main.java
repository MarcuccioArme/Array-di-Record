import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanti record vuoi inserire?");
        System.out.print("Quantità: ");
        int quantità = scanner.nextInt();

        Persona[] persone = new Persona[quantità];

        for (int i=0; i<quantità; i++) {

            System.out.print("Inserisci il nome: ");
            String nome = scanner.nextLine();

            System.out.print("Inserisci il cognome: ");
            String cognome = scanner.nextLine();

            System.out.print("Inserisci l'età: ");
            int eta = scanner.nextInt();

            persone[i] = new Persona(nome, cognome, eta);
        }

        for (Persona persona : persone) {
            System.out.println("Nome: " + persona.nome() + "Cognome: " + persona.cognome() + "Età: " + persona.eta());
        }

        scanner.close();
    }
}