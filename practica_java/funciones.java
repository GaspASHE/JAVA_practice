package practica_java;

public class funciones {
    public static void main(String[] args){
        saludar("gaspar");
        restar(1, 2);
    }

    public static void saludar(String nombre){
        System.out.println("Hola "+nombre+"!");
    }

    public static int restar(int a,int b){
        return a-b;
    }

    public static int n_al_cuadrado(int a){
        return a*a;
    }

    public static void es_par_o_impar(int a){
        var que_es = ((a%2) == 0) ? "es par" : "es impar"; 
        System.out.println(que_es);
    }

    public static boolean es_mayor_de_edad(int edad){
        var es_mayor = (edad < 18) ? false : true;
        return es_mayor;
    }

    public static int len_cadena(String cadena){
        return cadena.length();
    }

    public static int promedio(int[] array){
        int cantidad = 0;
        int total = 0;
        for (int valor: array){
            total += valor; 
            cantidad++;
        }
        return total/cantidad;
    }

    public static int factorial(int n){
        if (n == 0){
            return 1;
        } else if (n < 0){
            return -1;
        }

        return n * factorial(n-1);
    }

    public static void mostrar_array(String[] arr){
        for(String string:arr){
            System.out.println(string);
        }
    }

}
