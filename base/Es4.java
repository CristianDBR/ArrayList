package base;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Es4 {
    public static void main(String[] args) {
        ArrayList<String> parole = new ArrayList<>();
        parole.add("cane");
        parole.add("gatto");
        parole.add("elefante");

        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci una parola: ");
        String cerca = input.nextLine();
        input.close();

        if(parole.contains(cerca)){
            System.out.println("Presente nella lista");
        } else {   
            System.out.println("Non presente nella lista");
        }
    }
    
}
