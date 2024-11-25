package classroom;

public class Persona {
    private String nombre;
    private long cedula;

    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public long Cedula() {
        return cedula;
    }

  
    public Persona(String nombre) {
        this.nombre = nombre;
        this.cedula = 0; 
    }

    public Persona(long cedula) {
        this.nombre = ""; 
        this.cedula = cedula;
    }

    public Persona(String nombre, long cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
}


