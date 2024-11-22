package classroom;

public class Grupo {
    Persona[] estudiantes;
    Persona profesor;
    Asignatura asignatura;
    int codigo;
    String horario;

    public Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }

    public Grupo(int numeroEstudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = new Persona[numeroEstudiantes];
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }

    public void cambiarEstudiante(int index, Persona estudiante) {
        estudiantes[index] = estudiante;
    }

    public int getCodigo() {
        return this.codigo;
    }
}
