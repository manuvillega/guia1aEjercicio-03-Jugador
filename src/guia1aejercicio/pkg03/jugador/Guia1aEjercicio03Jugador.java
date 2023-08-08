/*En un nuevo proyecto crear una clase de nombre Jugador con los atributos: nombre, 
puntaje, nacionalidad y edad. Luego un constructor vació y un constructor que inicialice 
todos sus atributos; agregue además los respectivos métodos getter y setter. Desde el 
método main de la clase principal del proyecto crear un Jugador utilizando el constructor 
vacío; luego, a dicho jugador darle de nombre “Juan”, con 140 puntos, de nacionalidad 
“Argentino” y una edad de 29 años; por último mostrar por consola el estado de cada uno 
de sus atributos.*/

package guia1aejercicio.pkg03.jugador;


public class Guia1aEjercicio03Jugador {

   
    public static void main(String[] args) {
       Jugador juan = new Jugador();
       juan.setNombre("Juan");
       juan.setPuntaje (150);
       juan.setNacionalidad("argentino");
       juan.setEdad (29);
       
        System.out.println("Nombre del Jugador: "+juan.getNombre());
        System.out.println("Puntaje: "+juan.getPuntaje());
        System.out.println("Nacionalidad: "+juan.getNacionalidad());
        System.out.println("Edad: "+juan.getEdad());
        System.out.println("constructor vacio");
        System.out.println("----------------------------------");
        
        Jugador pepe = new Jugador ("Pepe", 45, "argentino", 25);
        System.out.println("nombre: " +pepe.getNombre());
        System.out.println("puntaje " +pepe.getPuntaje());
        System.out.println("nacionalidad " +pepe.getNacionalidad());
        System.out.println("edad " +pepe.getEdad());
        System.out.println("constructor con parametros");
        System.out.println("----------------------------------");
        
        System.out.println("la cantidad de jugadores es: " +Jugador.getContadorJugadores());
        System.out.println("atributo estatico");
        System.out.println("----------------------------------");
        
        Jugador.cartel();
        System.out.println("metodo estatico");
        System.out.println("----------------------------------");
       
    }
    
   
}

