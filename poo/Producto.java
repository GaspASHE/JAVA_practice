package practica_java.poo;

public class Producto {
    
    private int price;

    public Producto(int price){
        setPrice(price);
    }
    
    public void setPrice(int price){
        if (price > 0){
            this.price = price;
        } else {
            System.out.println("precio invalido");
        }
    }
}
