package classroom;

public class Asignatura {
    public String nombre;
    public Tipo tipo;
    public int codigoExterno;
    public int codigoInterno;

 
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
        this.codigoExterno = codigoExterno;
        this.codigoInterno = codigoInterno;
        this.tipo = tipo;
    }


    public void cambiarDatos(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void cambiarDatos(int nuevoCodigo) {
        this.codigoExterno = nuevoCodigo;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public int getCodigoInterno() {
        return this.codigoInterno;
    }
}
