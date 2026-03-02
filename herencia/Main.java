package practica_java.herencia;

import practica_java.herencia.Persona.Estudiante;
import practica_java.herencia.Vehiculos.Car;

public class Main {
    public static void main(String[] args) {
        Car auto1 = new Car(0);
        auto1.tocarBocina();
    
        Estudiante estudiante1 = new Estudiante("gaspar", 21, "3ero");

        estudiante1.saludar();
        estudiante1.estudio();
    
    }
}
