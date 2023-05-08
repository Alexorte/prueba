import java.util.ArrayList;
public class PruebaComodin {
    public static void main(String [] args) {
        Integer[] enteros = {1, 2, 3, 4, 5};
        ArrayList<Integer> listaEnters = new ArrayList<Integer>();
        for (Integer elemento: enteros) {
            listaEnters.add(elemento);
        }
        System.out.printf("listaEnters contiene: %s \n", listaEnters);
        System.out.printf("Total de los elementos a listaEntero: %.0f \n \n",
                sumar(listaEnters));
        Double[] valoresDouble = {1.1, 3.3, 7.9};
        ArrayList<Double> listaDouble = new ArrayList<Double>();
        for (Double elemento: valoresDouble) {
            listaDouble.add (elemento);
        }
        System.out.printf("listaDouble contiene: %s \n", listaDouble);
        System.out.printf("Total de los elementos a listaDouble: %.1f \n \n", sumar(listaDouble));
        // sigue por aquí el método main
        Number[] numeros = {1, 2.4, 3, 4.1};
        ArrayList<Number> listaNumeros = new ArrayList<Number>();
        for (Number elemento: numeros) {
            listaNumeros.add (elemento);
        }
        System.out.printf("listaNumeros contiene: %s \n", listaNumeros);
        System.out.printf("Total de los elementos a listaNumeros: %.1f \n", sumar(listaNumeros));
    }
    // Fin del main
    public static double sumar( ArrayList <? extends Number> lista ) {
        double total = 0;
        for(Number elemento: lista) {
            total += elemento.doubleValue();
        }
        return total;
    }
}
