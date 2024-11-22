package classroom;

public class Asignatura {
    public String nombre;
    public Tipo tipo;
    public int codigoExterno;

    public Asignatura() {
        this.nombre = "Sin nombre";
        this.tipo = Tipo.FUNDAMENTACION;
        this.codigoExterno = 0;
    }

    public Asignatura(String nombre, Tipo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.codigoExterno = 0;
    }

    public Asignatura(int codigoExterno, Tipo tipo) {
        this.nombre = "Sin nombre";
        this.tipo = tipo;
        this.codigoExterno = codigoExterno;
    }

    public Asignatura(String nombre, int codigoExterno, int otroCodigo, Tipo tipo) {
        this.nombre = nombre;
        this.codigoExterno = otroCodigo;
        this.tipo = tipo;
    }

    public void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoExterno = codigoInterno;
    }
}
