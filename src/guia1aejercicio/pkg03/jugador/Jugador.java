
package guia1aejercicio.pkg03.jugador;


public class Jugador {
    private static int contadorJugadores = 0;
    private String nombre;
    private int puntaje;
    private String nacionalidad;
    private int edad;

    public Jugador() {
        contadorJugadores++;
    }

    public Jugador(String nombre, int puntaje, String nacionalidad, int edad) {
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        contadorJugadores++;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void cartel() {
        System.out.println("mostrar cartel: ejecuto sin instanciar un objeto");
    }

    public static int getContadorJugadores() {
        return contadorJugadores;
    }

}
