package classroom;

public class Grupo {
    public int codigo;
    public Persona[] estudiantes;
    public Persona profesor;
    public Asignatura asignatura;
    public String horario;

    public Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }

    public Grupo(int numEstudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = new Persona[numEstudiantes];
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }

    public void cambiarEstudiante(int indice, Persona estudiante) {
        this.estudiantes[indice] = estudiante;
    }

    public void cambiarEstudiante(Persona estudianteAntiguo, Persona estudianteNuevo) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] == estudianteAntiguo) {
                estudiantes[i] = estudianteNuevo;
                break;
            }
        }
    }
}
