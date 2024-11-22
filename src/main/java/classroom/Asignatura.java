package classroom;

public class Asignatura {
    public String nombre;
    public int codigoExterno;
    public Tipo tipo;

    public Asignatura() {
        this.nombre = "Sin nombre";
        this.codigoExterno = 0;
        this.tipo = Tipo.FUNDAMENTACION;
    }

    public Asignatura(String nombre, Tipo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.codigoExterno = 0;
    }

    public Asignatura(int codigoExterno, Tipo tipo) {
        this.nombre = "Sin nombre";
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public Asignatura(String nombre, int codigoExterno, int codigoInterno, Tipo tipo) {
        this.nombre = nombre;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }
}
