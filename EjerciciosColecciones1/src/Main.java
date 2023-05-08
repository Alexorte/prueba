//Nombre: Javier García Meneses
//Grupo: A, G04
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList ejerc1=new ArrayList();
        ejerc1.add("Red");
        ejerc1.add("Green");
        ejerc1.add("Orange");
        ejerc1.add("White");
        ejerc1.add("Black");
        System.out.println(ejerc1.toString());
        ejerc1.add(0,"Pink");
        System.out.println(ejerc1.toString());
        ejerc1.set(3,"Blue");
        ejerc1.add("Purple");
        System.out.println(ejerc1.toString());
        for(int i=1;i< ejerc1.size();i++){
            if(i%2==0){
                System.out.print(ejerc1.get(i));
            }
            if(i!=ejerc1.size()-1 && i%2==0){
                System.out.print(", ");
            }
            if(i== ejerc1.size()-1){
                System.out.print(",\n");
            }
        }
        ejerc1.remove(4);
        System.out.println(ejerc1.toString());
        //ejerc1.sort();

    }
}