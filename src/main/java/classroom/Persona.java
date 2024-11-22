package classroom;

public class Persona {
    private int cedula;
    private String nombre;

    public Persona() {
        this.cedula = 0;
        this.nombre = "Sin nombre";
    }

    public Persona(int cedula) {
        this.cedula = cedula;
        this.nombre = "Sin nombre";
    }

    public Persona(String nombre) {
        this.cedula = 1;
        this.nombre = nombre;
    }

    public Persona(String nombre, int cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }
}
