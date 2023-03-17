package Telefonia ;

public class Local extends Principal{
    protected int numerotelefono;
    protected int numeroextencion;
    protected String ciudad;

    public Local() {
    }

    public Local(int precio, int duracion, int numerollamadas, int numerotelefono, int numeroextencion, String ciudad) {
        super(precio, duracion, numerollamadas);
        this.numerotelefono = numerotelefono;
        this.numeroextencion = numeroextencion;
        this.ciudad = ciudad;
    }

    public int getNumerotelefono() {
        return numerotelefono;
    }

    public void setNumerotelefono(int numerotelefono) {
        this.numerotelefono = numerotelefono;
    }

    public int getNumeroextencion() {
        return numeroextencion;
    }

    public void setNumeroextencion(int numeroextencion) {
        this.numeroextencion = numeroextencion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return super.toString() + "Local{" +
                "numerotelefono=" + numerotelefono +
                ", numeroextencion=" + numeroextencion +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }

    public void llamada(int l1){
         if (l1 == 1){
             String l = "Llamada realizada";
             System.out.println("Actualización: " +l);
             this.numerollamadas+=1;
         }

    }



}
