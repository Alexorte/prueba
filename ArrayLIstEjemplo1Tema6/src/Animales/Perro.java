package Animales;

public class Perro {
    private String nombre;
    public Perro(String n) {
        nombre = n;
    }
    public void ladra() {System.out.println(nombre + ": guau!");}
    public String toString() {
        return "soy el perro " + nombre;
    }
}
