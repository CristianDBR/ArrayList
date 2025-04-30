package base;
import java.util.ArrayList;
import java.util.Scanner;

public class Es5 {
    public static void main(String[] args) {
        ArrayList<String> nomi = new ArrayList<>();
        nomi.add("anna");
        nomi.add("lidia");
        nomi.add("marco");

        Scanner input = new Scanner(System.in);
        System.out.println("nome da rimuovere: ");
        String rimuovere = input.nextLine();
        input.close();

        nomi.remove(rimuovere); 

        System.out.println("Lista aggiornata: " + nomi);
}
}