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

    public Grupo(int cantidadEstudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = new Persona[cantidadEstudiantes];
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }

    public void cambiarEstudiante(int indice, Persona estudiante) {
        this.estudiantes[indice] = estudiante;
    }

    public void cambiarEstudiante(Persona estudianteAnterior, Persona estudianteNuevo) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].equals(estudianteAnterior)) {
                estudiantes[i] = estudianteNuevo;
                break;
            }
        }
    }
}
