import Controller.manageProduct;

public class Main {
    public static void main(String[] args) {
        manageProduct manageProducts = new manageProduct();
        while (true){
           manageProducts.menu();
        }
    }
}