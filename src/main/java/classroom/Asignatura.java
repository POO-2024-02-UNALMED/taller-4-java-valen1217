package classroom;

public class Asignatura {
    private int codigoExterno;
    private Tipo tipo;
    private String nombre;
    private int codigoInterno; 

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

    public int getCodigoInterno() {
        return codigoInterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getCodigoExterno() {
        return codigoExterno;
    }

    public void setCodigoExterno(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }
}
