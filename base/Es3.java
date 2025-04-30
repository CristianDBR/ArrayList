package base;
import java.util.ArrayList;

public class Es3 {
    public static int calcolo(ArrayList<Integer> lista) {
        int somma =0;
        for (int numero : lista) {
            somma += numero;
        }
        return somma;
    }
    public static void main(String[] args) {
        ArrayList <Integer> numeri = new ArrayList<>();
        numeri.add(1);
        numeri.add(1);
        numeri.add(1);
        numeri.add(1);
        numeri.add(6);

        int sommaTotale = calcolo(numeri);
        System.out.println("la somma dei numeri è: " + sommaTotale);

    }
}