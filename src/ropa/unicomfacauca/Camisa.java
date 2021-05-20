package ropa.unicomfacauca;

public class Camisa extends Ropa{
    private String marca;
    public Camisa(){
        super(30000,"Azul");

    }

    @Override
    public String getNombre(){
        return "camisa";
    }
}
