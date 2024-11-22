package classroom;

public class Asignatura {
    String nombre;
    Tipo tipo;
    int codigoExterno;
    int codigoInterno;

    public Asignatura() {
        this.nombre = "Sin nombre";
        this.tipo = Tipo.FUNDAMENTACION;
        this.codigoExterno = 0;
        this.codigoInterno = 0; 
    }

    public Asignatura(String nombre, Tipo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.codigoExterno = 0;
        this.codigoInterno = 0; 
    }

    public Asignatura(int codigoExterno, Tipo tipo) {
        this.nombre = "Sin nombre";
        this.tipo = tipo;
        this.codigoExterno = codigoExterno;
        this.codigoInterno = 0; 
    }

    public Asignatura(String nombre, int codigoExterno, int codigoInterno, Tipo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.codigoExterno = codigoExterno;
        this.codigoInterno = codigoInterno;
    }

    public void cambiarDatos(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void cambiarDatos(String nuevoNombre, Tipo nuevoTipo) {
        this.nombre = nuevoNombre;
        this.tipo = nuevoTipo;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public String getNombre() {
        return this.nombre;
    }
}
