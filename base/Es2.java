package base;
import java.util.ArrayList;

public class Es2 {
    public static int conta(ArrayList<Integer> lista) {
        return lista.size();
    }
    public static void main(String[] args) {
        ArrayList <Integer> numeri = new ArrayList<>();
        numeri.add(1);
        numeri.add(2);
        numeri.add(3);      
        numeri.add(4);
        numeri.add(5);

        int numeroElementi = conta(numeri);
        System.out.println("numero di elementi: " + numeroElementi);

    }
}