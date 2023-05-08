import Animales.Gato;
import Animales.Perro;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList jaula = new ArrayList(30);
        for (int i = 0; i < 12; i++) {
            jaula.add(new Perro("perro" + i));
        }
        for (int i = 0; i < jaula.size(); i++) { // jaula.size() vale 12
            System.out.print("(" + i + ")");
            ((Perro) jaula.get(i)).ladra(); // casting (Perro) para
// acceder a ladra()
        }

// Usando toString() de cada objeto:
        for (int i = 0; i < jaula.size(); i++) {
            System.out.print("(" + i + ")");
            System.out.println(jaula.get(i).toString());
// no hace falta casting (Perro), ni debe ponerse si
// hay otros objetos distintos (como Gato)
        }
        // Sustituye lo que haya en la posición 0 por el nuevo objeto.
        jaula.set(0, new Perro("toby"));
// Colocamos en la posición 3 un gato y el resto de elementos se desplazan a la
//derecha
        Gato misi = new Gato("misi");
        jaula.add(3, misi);
// Si el gato está en la jaula, lo mostramos por pantalla
        if (jaula.contains(misi))
            ((Gato) jaula.get(jaula.indexOf(misi))).maulla();
// Si mostramos toda la jaula usando ladra() como antes tendremos un
//error de casting (no todos los elementos son Perro).
// Puede hacerse usando toString().
// Borramos el gato que está en la posición 3 desplazando el resto a la izquierda
        jaula.remove(3);
// Mostramos la jaula:
        for (int i = 0; i < jaula.size(); i++) {
            System.out.print("(" + i + ")");
            ((Perro) jaula.get(i)).ladra();
        }
// Vaciamos la jaula y preguntamos si está vacía:
        jaula.clear();
        System.out.println("¿Está la jaula vacía? " + jaula.isEmpty());
        ArrayList<Perro> jaulaPerros = new ArrayList<Perro>(30);
        for (int i = 0; i < jaulaPerros.size(); i++) {
            System.out.print("(" + i + ")");
            jaulaPerros.get(i).ladra();
        }
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");
        list1.add("F");
        ListIterator<String> itr1 = list1.listIterator();
        System.out.println("Iteramos hacia adelante");
//Forward iterator
        while(itr1.hasNext()) {
            System.out.print(itr1.next() + ",");
        }
        System.out.println("Iteramos hacia atrás");
//Backward iterator
        while(itr1.hasPrevious()) {
            System.out.print(itr1.previous() + ",");
        }
        System.out.println("Iteramos a partir de una posición específica");
//Comenzamos a iterar a partir de la posición 2
        itr1 = list1.listIterator(2);
        while(itr1.hasNext()) {
            System.out.print(itr1.next() + ",");
        }
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
/* MAL --------- ConcurrentModificationException
if(list.contains("D")) {
int i = list.indexOf("D");
ListIterator<String> itr = list.listIterator(i);
while(itr.hasPrevious())
list.remove(itr.previous());
}
*/
/* MAL -------- ConcurrentModificationException
for (String s:list){
list.remove(s);
}
*/
// BIEN
        if(list.contains("D")) {
            int i = list.indexOf("D");
            ListIterator<String> itr = list.listIterator(i);
            while(itr.hasPrevious()) {
                itr.previous();
                itr.remove();
            }
            System.out.println(list);
        }
        if(list.contains("E")) {
            int i = list.indexOf("E");
            ListIterator<String> itr = list.listIterator(i);
            while(itr.hasNext())
                System.out.println(itr.next());
        }
        for(int i=2; i>=0;i--)
            list.remove(i);
    }
}