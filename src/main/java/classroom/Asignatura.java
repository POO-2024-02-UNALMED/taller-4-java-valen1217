package classroom;

public class Asignatura {
    private int codigoExterno;
    private Tipo tipo;

    public Asignatura() {
    }

    public Asignatura(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    public Asignatura(int codigoExterno, Tipo tipo) {
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    public void cambiarDatos(int codigoExterno, Tipo tipo) {
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }
    public void setCodigoInterno(int codigoInterno) {
    this.codigoInterno = codigoInterno;
}

}
