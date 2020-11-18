package Clase6;

public class alumno extends persona {


    private int numeroEstudiante;
    private String grupo = "1A";
    private boolean tienePrevias;

    public alumno(String unNombre, int unaCI, int unaEdad) {
        super(unNombre, unaCI, unaEdad);
        this.grupo = "1a";
        this.tienePrevias = true;
    }

    public alumno(String unNombre, int unaCI, int unaEdad, int nroEstudiante, String unGrupo, boolean tienePrevias) {
        super(unNombre, unaCI, unaEdad);
        this.grupo = unGrupo;
        this.tienePrevias = tienePrevias;

    }

    public void setNroEstudiante(int nroEstudiante) {
        this.numeroEstudiante = nroEstudiante;
    }

    public int getNroEstudiante() {
        return numeroEstudiante;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setTienePrevias(boolean tienePrevias) {
        if(tienePrevias == true){
            System.out.println("el estudiante tiene previas");
        }else {
            System.out.println("El estudiante paso olimpico");
        }
        this.tienePrevias = tienePrevias;
    }

    public boolean getTienePrevias() {
        return tienePrevias;
    }

    public String toString(){
        return super.toString() + " y tiene el numero de estudiante:  "  + this.numeroEstudiante + " , el mismo pertenece al grupo " + this.grupo +  " y " + this.tienePrevias;
    }

}

