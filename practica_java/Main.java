package practica_java;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world");
        
        //comentarios en linea
    
        /*
        comentarios en bloque
        */
    
        //variables y tipos de datos --- 
        
        //enteros
        int a = 0;  // -2mm <= int <= 2mm                   4 bytes
        byte b = 0;  // -128 <= byte <= 127                 1 byte
        short c = 0;  // -32768 <= short <= 32767           2 bytes
        long d = 0; // -9(18 ceros) <= long <= 9(18 ceros)  8 bytes
    
        //decimales
        float aa = 10.0f;
        double bb = 10.1;
    
        //boolean true/false
        
        //char y string
    
        //array
        byte[] numerosA = new byte[0]; //<tipo de dato del array> <nombre> = new <tipo de dato>[<cantidad contenida en el array>]  | todas las posiciones iniciadas en 0
        byte[] numerosB = {10,2}; //array inicializado
    
        //constantes
        final float PI = 3.14f;
    
        //operadores aritmeticos ---
    
        byte c1 = 1+1;
        byte c2 = 1-1;
        byte c3 = 1*1;
        byte c4 = 3%2;
        byte c5 = 3 / 2;
        float c55 = 3f / 2f;
        double c555 = 3.0 / 2.0;
    
        byte x = 1;
        ++x;
        x++;
    }
}
