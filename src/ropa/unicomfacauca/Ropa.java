package ropa.unicomfacauca;

public abstract class Ropa {
    private int precio;
    private String color;

    public Ropa(int precio,String color) {
        this.precio = precio;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public int getPrecio (){
        return this.precio;
    }
    public abstract  String getNombre();
}
