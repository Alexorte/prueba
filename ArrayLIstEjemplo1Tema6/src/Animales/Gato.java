package Animales;

public class Gato {
    private String nombre;
    public Gato(String n) {
        nombre = n;
    }
    public void maulla() {System.out.println(nombre + ": miau!");}
    public String toString() {
        return "soy el gato " + nombre;
    }
}
