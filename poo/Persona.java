package practica_java.poo;

public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar(){
        System.out.println("Hola! me llamo " +this.nombre+ " y tengo " +this.edad+ " años");
    }
}
