package practica_java.herencia;

public class Vehiculos {
    private int velocidad;

    public Vehiculos(int velocidadInicial){
        this.velocidad = velocidadInicial;
    }

    public void irMasRapido(int velocidad){
        if (velocidad > 0) {
            this.velocidad += velocidad;
        } else {
            System.out.println("aumento de velocidad incorrecto");
        }
    }

    public void irMasLento(int velocidad){
        if (velocidad > 0) {
            this.velocidad -= velocidad;
        } else {
            System.out.println("decremento de velocidad incorrecto");
        }
    }

    public static class Car extends Vehiculos{

        public Car(int velocidadInicial){
            super(velocidadInicial);
        }

        public void tocarBocina(){
            System.out.println("tu TUUU");
        }
        
    }
}

