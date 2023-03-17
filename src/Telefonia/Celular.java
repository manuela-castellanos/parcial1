package Telefonia;

public class Celular extends Principal{

    protected String telefono;

    public Celular() {
    }

    public Celular(int precio, int duracion, int numerollamadas, String telefono) {
        super(precio, duracion, numerollamadas);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return super.toString() + "Celular{" +
                "telefono=" + telefono +
                '}';
    }

    public void llamada (int l3){

        if (l3 == 3){
            String l = "Llamada realizada";
            System.out.println("Actualización: " +l);
            this.numerollamadas+=1;
        }
    }
}
