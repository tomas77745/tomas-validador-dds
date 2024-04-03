package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class InscripcionTest {

    Materia aYED = new Materia("AyED",1);
    Materia discreta = new Materia("Discreta",2);
    Materia ads = new Materia("Analisis De Sistemas",3,aYED,discreta);
    Materia pdp = new Materia("Paradigmas de Programacion",4,aYED);
    Materia dds = new Materia("Diseño de sistemas",5,ads,pdp);


    @Test
    public void alumnoPuedeInscribirseADiseño(){

        Alumno pepito = new Alumno("pepito",1,ads,pdp,aYED,discreta);
        Inscripcion inscripcion = new Inscripcion(pepito,dds);
        Assertions.assertTrue(inscripcion.aprobada());

    }

    @Test
    public void alumnoNoPuedeInscribirsePorqueNoAproboNada(){

        Alumno juan = new Alumno("Juan",1);
        Inscripcion inscripcion = new Inscripcion(juan,pdp,aYED,discreta);
        Assertions.assertFalse(inscripcion.aprobada());

    }

    @Test
    public void alumnoNoPuedeInscribirseAAnalisisDeSistemas(){
        Alumno marco = new Alumno("Marco",2,aYED);
        Inscripcion inscripcion1 = new Inscripcion(marco, ads);
        Assertions.assertFalse(inscripcion1.aprobada());

    }
}


