package practica_java.poo;

public class BankAccount {
    private int money;

    public BankAccount(){

    }

    public void deposit(int money){
        if (money > 0){
            this.money += money;
        }
        System.out.println("cantidad invalida");
    }

    public void whitdraw(int money){
        if (money > 0 && this.money > money){
            this.money -= money;
            System.out.println("nuevo balance" + money);
        }
        System.out.println("cantidad invalida");
    }
}
