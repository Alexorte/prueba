
import java.util.ArrayList;
public class TotalNumeros {
    public static double sumar (ArrayList<Number> lista) {
        double total = 0;
        for (Number elemento: lista) {
            total += elemento.doubleValue();
        }
        return total;
    }
    public static void main(String args[]) {
        Number[] numeros = {1, 2.4, 3, 4.1};
        ArrayList<Number> listaNumeros = new ArrayList<Number>();
        for (Number elemento: numeros) {
            listaNumeros.add (elemento);
        }
        System.out.printf("listaNumeros contiene:%s \n", listaNumeros);
        System.out.printf("Total de los elementos a listaNumeros: %.1f \n", sumar(listaNumeros));
    }
}
