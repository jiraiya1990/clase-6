package Clase6;

public class profesor extends persona {

    private int salario;
    private String materia;

    public profesor(String unNombre, int unaCI, int unaEdad, String unaMateria) {
        super(unNombre, unaCI, unaEdad);
        this.salario = 20000;
        this.materia = unaMateria;
    }

    public profesor(String unNombre, int unaCI, int unaEdad, int unSalario, String unaMateria) {
        super(unNombre, unaCI, unaEdad);
        this.salario = unSalario;
        this.materia = unaMateria;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public String toString() {
        return super.toString() + " el salario es del profesor es: " + this.salario + " pesos." + " e imparte la materia " + this.materia;

    }
}
