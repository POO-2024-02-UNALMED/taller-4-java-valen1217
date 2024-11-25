package classroom;

public class Asignatura {
    String nombre;
    Tipo tipo;
    int codigoExterno;

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

    public Asignatura(String nombre, int codigoExterno, int codigoInterno, Tipo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.codigoExterno = codigoExterno;
    }

    public void cambiarDatos(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void cambiarDatos(int nuevoCodigo) {
        this.codigoExterno = nuevoCodigo;
    }
}
