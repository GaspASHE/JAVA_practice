package practica_java.herencia;

public class Persona {
    private String name;
    private int age;
    
    public Persona(String name, int age){
        this.name = name;
        this.age = age;   
    }
    
    public void saludar(){
        System.out.println("hola, soy "+name);
    }

    public static class Estudiante extends Persona {
        private String grado;

        public Estudiante(String name, int age,String grado){
            super(name, age);
            this.grado = grado;
        }

        public void estudio(){
            System.out.println("Estoy estudiando en "+grado);
        }
    }

}
