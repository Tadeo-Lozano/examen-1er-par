package uaslp.objetos.parcial1.examen.pos;

public class Product {
    private String nombre;
    private float prec;

    public Product(String nombre, float prec) {
        this.nombre = nombre;
        this.prec = prec;
    }

    public String getNombre(){
        return nombre;
    }

    public float getPrec(){
        return prec;
    }
}
