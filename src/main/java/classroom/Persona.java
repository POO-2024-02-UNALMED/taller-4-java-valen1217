package classroom;

public class Persona {
    public long id;
    public String nombre;

    public Persona() {
    }

    public Persona(long id) {
        this.id = id;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Persona(String nombre, long id) {
        this.nombre = nombre;
        this.id = id;
    }
}
