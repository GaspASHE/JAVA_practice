package practica_java.poo;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre,int edad){
        this.nombre = setNombre(nombre);;
        this.edad = setEdad(edad);
    }

    //setters
    private String setNombre(String nombre){
         // Recorremos desde el índice 0 hasta el final (largo - 1)
        for (int i = 0; i < nombre.length(); i++) {
            // Extraemos el caracter en la posición i
            char letra = nombre.charAt(i);
            if (Character.isDigit(letra)){
                System.out.println("nombre erroneo");
                return "";
            }
        }
        return nombre;
    }

    private int setEdad(int edad){
        if (edad < 0) {
            System.out.println("edad invalida");
            return 0;
        }
        return edad;
    }

    //getters
    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    //primitivas
    public void saludar(){
        System.out.println("Hola! me llamo " +this.nombre+ " y tengo " +this.edad+ " años");
    }
}
