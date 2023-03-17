package Telefonia;

public class LagaDistancia extends Principal{
    protected int telefono;
    protected int extencion;
    protected String pais;

    public LagaDistancia() {
    }

    public LagaDistancia(int precio, int duracion, int numerollamadas, int telefono, int extencion, String pais) {
        super(precio, duracion, numerollamadas);
        this.telefono = telefono;
        this.extencion = extencion;
        this.pais = pais;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getExtencion() {
        return extencion;
    }

    public void setExtencion(int extencion) {
        this.extencion = extencion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return super.toString() + "LagaDistancia{" +
                "telefono=" + telefono +
                ", extencion=" + extencion +
                ", pais='" + pais + '\'' +
                '}';
    }

    public void llamada(int l2){

        if (l2 == 2){
            String l = "Llamada realizada";
            System.out.println("Actualización: " +l);
            this.numerollamadas+=1;
        }

    }
}
