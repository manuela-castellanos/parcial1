package Telefonia;

public class Principal {

    protected int precio;
    protected int duracion;
    protected int numerollamadas;

    public Principal() {
    }

    public Principal(int precio, int duracion, int numerollamadas) {
        this.precio = precio;
        this.duracion = duracion;
        this.numerollamadas = numerollamadas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getNumerollamadas() {
        return numerollamadas;
    }

    public void setNumerollamadas(int numerollamadas) {
        this.numerollamadas = numerollamadas;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "precio=" + precio +
                ", duracion=" + duracion +
                ", numerollamadas=" + numerollamadas +
                '}';
    }

}
