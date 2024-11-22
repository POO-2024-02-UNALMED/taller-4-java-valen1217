package classroom;

public class Persona {
    private String nombre;
    private int cedula;

    public Persona() {
        this.nombre = "";
        this.cedula = 0;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.cedula = 1; 
    }

    public Persona(int cedula) {
        this.cedula = cedula;
        this.nombre = "";
    }

    public Persona(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public Persona(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public int getCedula() {
        return this.cedula;
    }

    public String getNombre() {
        return this.nombre;
    }
}
