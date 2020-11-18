package Clase6;

public class persona {

    //public static void main (String args []){

    //Atributos

    private String nombre;
    private int CI;
    private int edad;

    // constructor con parametros
    public persona(String unNombre, int unCI) {

        this.nombre = unNombre;
        this.CI = unCI;

    }
    public persona(String unNombre, int unCI, int unaEdad) {

        this.nombre = unNombre;
        this.CI = unCI;
        this.edad = unaEdad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }

    public long getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int unaEdad) {
        this.edad = unaEdad;
    }

    public String toString(){
        return "la persona " + this.nombre + " con la CI numero: " + this.CI + " tiene " + this.edad + " años";

    }






}






