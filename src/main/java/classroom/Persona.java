package classroom;

public class Persona {
    private int cedula;
    private String nombre;

    public Persona(int cedula) {
        this.cedula = cedula;
    }

    public Persona(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public Persona(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public Persona() {
        this.cedula = 0; 
        this.nombre = "Sin nombre"; 
    }

    public int getCedula() {
        return cedula;
    }
}
