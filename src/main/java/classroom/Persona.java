package classroom;

public class Persona {
    private int cedula;
    private String nombre;

    public Persona(int cedula) {
        this.cedula = cedula;
        this.nombre = "Sin nombre";
    }

    public Persona(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public Persona(String nombre) {
        this.cedula = 0;
        this.nombre = nombre;
    }

    public Persona() {
        this.cedula = 0;
        this.nombre = "Sin nombre";
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }
}
