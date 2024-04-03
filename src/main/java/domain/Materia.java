package domain;

import java.util.Arrays;
import java.util.List;

public class Materia {
    private String nombre;
    private Integer codigo;
    private List<Materia> correlativasParaCursar;

    public Materia(String nombre, Integer codigo, Materia ... materias) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.correlativasParaCursar =  Arrays.asList(materias);
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public List<Materia> getCorrelativasParaCursar() {
        return correlativasParaCursar;
    }

    public void setCorrelativasParaCursarr(List<Materia> correlativasParaCursar) {
        this.correlativasParaCursar = correlativasParaCursar;
    }


}
