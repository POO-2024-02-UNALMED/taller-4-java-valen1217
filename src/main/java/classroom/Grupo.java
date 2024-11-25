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

    public Grupo(int cantidadEstudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = new Persona[cantidadEstudiantes];
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }

    public void cambiarEstudiante(int indice, Persona estudiante) {
        if (indice >= 0 && indice < estudiantes.length) {
            estudiantes[indice] = estudiante;
        }
    }

    public void cambiarEstudiante(Persona estudianteViejo, Persona estudianteNuevo) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].equals(estudianteViejo)) {
                estudiantes[i] = estudianteNuevo;
            }
        }
    }
}
