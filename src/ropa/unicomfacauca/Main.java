package ropa.unicomfacauca;

public class Main {

    public static void main(String[] args) {
        Camisa camisa = new Camisa();
        System.out.println("Ropa");
        System.out.println("*****************************");
        System.out.println("Camisa :" +camisa.getNombre());
        System.out.println("Precio :" +camisa.getPrecio());
        System.out.println("Color :" +camisa.getColor());
        System.out.println("*****************************");
    }
}
