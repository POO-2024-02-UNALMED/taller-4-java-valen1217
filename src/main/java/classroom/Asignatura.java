package classroom;

public class Asignatura {
    String nombre;
    int codigoInterno;
    int codigoExterno;
    Tipo tipo;

    public Asignatura() {
        this.nombre = "Sin nombre";
        this.codigoExterno = 0;
        this.tipo = Tipo.FUNDAMENTACION;
    }

    public Asignatura(String nombre, Tipo tipo) {
        this.nombre = nombre;
        this.codigoExterno = 0;
        this.tipo = tipo;
    }

    public Asignatura(int codigoExterno, Tipo tipo) {
        this.nombre = "Sin nombre";
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public Asignatura(String nombre, int codigoInterno, int codigoExterno, Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }
}
