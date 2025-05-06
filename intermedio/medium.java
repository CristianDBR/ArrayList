package intermedio;
import java.util.ArrayList;
import java.util.Collections;

public class medium {
    //ES1
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

       ArrayList <Integer> inverso = new ArrayList<>();
    for (int i = numeri.size() - 1; i >= 0; i--) {
        inverso.add(numeri.get(i));
    }


    System.out.println("ESERCIZIO 1:");

    System.out.println("Lista originale: " + numeri);
    System.out.println("Lista inverso: " + inverso);



//ES2
ArrayList <Integer> listaDuplicati = new ArrayList<>();
listaDuplicati.add(1);
listaDuplicati.add(2);
listaDuplicati.add(2);
listaDuplicati.add(3);      
listaDuplicati.add(4);
listaDuplicati.add(4);
listaDuplicati.add(5);

ArrayList <Integer> listaNoDuplicati = new ArrayList<>();
for (Integer numero: listaDuplicati) {
    if (!listaNoDuplicati.contains(numero)) {
        listaNoDuplicati.add(numero);
    }
}
System.out.println("\nESERCIZIO 2:");

System.out.println("Lista originale: " + listaDuplicati);
System.out.println("Lista senza duplicati: " + listaNoDuplicati);

//ES3
System.out.println("\nESERCIZIO 3:");
ArrayList<Integer> listaPari = new ArrayList<>();
for (Integer numero : numeri) {
    if (numero % 2 == 0) listaPari.add(numero);
}
System.out.println("Lista originale: " + numeri);
System.out.println("Lista numeri pari: " + listaPari);


//ES4

//massimo e minimo
ArrayList<Integer> listaMinMax = new ArrayList<>();
listaMinMax.add(104);
listaMinMax.add(24);
listaMinMax.add(365);
listaMinMax.add(42);
listaMinMax.add(552);

System.out.println("\nESERCIZIO 4:");

if(listaMinMax.isEmpty()){
    System.out.println("La lista è vuora"); 
}else {
    int minimo = listaMinMax.get(0);
    int massimo = listaMinMax.get(0);

    for (int i=1; i<listaMinMax.size(); i++){
        int numeroCorrente = listaMinMax.get(i);

        if(numeroCorrente < minimo){
            minimo = numeroCorrente;
        }

        if(numeroCorrente > massimo){
            massimo = numeroCorrente;
        }
    }

    System.out.println("Lista per minimo e massimo: " + listaMinMax);
    System.out.println("Il numero minimo è: " + minimo);
    System.out.println("Il numero massimo è: " + massimo);

}

//ES5
System.out.println("\nESERCIZIO 5:");

        ArrayList<String> nomiStudenti = new ArrayList<>();

        nomiStudenti.add("Charlie");
        nomiStudenti.add("Alice");
        nomiStudenti.add("David");
        nomiStudenti.add("Bob");
        nomiStudenti.add("Andrea"); 

        System.out.println("Lista originale: " + nomiStudenti);

        Collections.sort(nomiStudenti);

        System.out.println("Lista ordinata alfabeticamente: " + nomiStudenti);


}
}
