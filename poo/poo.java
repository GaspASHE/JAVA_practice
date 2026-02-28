package practica_java.poo;

public class poo {
    public static void main(String[] args){
        var edad= 21;
        var nombre= "Gaspar";
        
        Persona persona1 = new Persona(nombre,edad);

        persona1.saludar();
    }
}
