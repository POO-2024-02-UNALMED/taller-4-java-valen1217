package classroom;

public class Asignatura {
    String nombre;
    Tipo tipo;
    int codigoExterno;
    int codigoInterno;

    public Asignatura(String nombre, Tipo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Asignatura(int codigoExterno, Tipo tipo) {
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public Asignatura(String nombre, int codigoExterno, int codigoInterno, Tipo tipo) {
        this.nombre = nombre;
        this.codigoExterno = codigoExterno;
        this.codigoInterno = codigoInterno;
        this.tipo = tipo;
    }

    public Asignatura() {
        this.nombre = "Sin nombre";
        this.tipo = Tipo.FUNDAMENTACION; 
    }

    public void cambiarDatos(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void cambiarDatos(int nuevoCodigoExterno) {
        this.codigoExterno = nuevoCodigoExterno;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
}
