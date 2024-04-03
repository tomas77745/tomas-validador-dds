package domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Inscripcion {

    private Alumno alumno;
    private List<Materia> materiasAInscribirse;

    public Inscripcion(Alumno alumno, Materia ... materiasAInscribirse) {
        this.alumno = alumno;
        this.materiasAInscribirse = Arrays.asList(materiasAInscribirse);
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public List<Materia> getMateriasAInscribirse() {
        return materiasAInscribirse;
    }

    private Boolean aprobadaInscripcionAMateria(Materia materia){

        List<Materia> materiasAprobadasPorAlumno = this.alumno.getMateriasAprobadas();
        List<Materia> correlativasDeMateria = materia.getCorrelativasParaCursar();

        return new HashSet<>(materiasAprobadasPorAlumno).containsAll(correlativasDeMateria);
        //Agregamos el hashset porque sin eso el IDE dio warning de que podría ser poco performante.
    }

    public Boolean aprobada(){
        return this.materiasAInscribirse.stream().allMatch(materia -> aprobadaInscripcionAMateria(materia));
    }

}

