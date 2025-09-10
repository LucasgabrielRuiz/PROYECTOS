public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         EQUIPO equipo = new EQUIPO("Tigres", "Monterrey");

        JUGADOR jugador1 = new JUGADOR ("Carlos","Nuñez", "25", "Delantero", 9);
        JUGADOR jugador2 = new JUGADOR("Luis","Arroyo", "23", "Defensa", 4);
        JUGADOR jugador3 = new JUGADOR("Pedro","Uñates", "27", "Mediocampista", 10);

        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(jugador2);
        equipo.agregarJugador(jugador3);

        ENTRENADOR entrenador = new ENTRENADOR("José","Ruiz", "45", 20, "Licenciado en Educación Física", "Tigres");
        equipo.agregarMiembroCuerpoTecnico(entrenador);

        MASAJISTA masajista = new MASAJISTA("Ana", "Medina","35", "10", Arrays.asList("Fisioterapia", "Masaje Deportivo"), "Rehabilitación");
        equipo.agregarMiembroCuerpoTecnico(masajista);

        UTILERO utilero = new UTILERO("Mario","Rodriguez", "40", 15, "Mantenimiento de equipamiento", "Categoría A");
        equipo.agregarMiembroCuerpoTecnico(utilero);

        equipo.concentrar();
        equipo.viajar("Ciudad de México");
        equipo.jugarPartido();
        equipo.entrenar();

        equipo.mostrarJugadoresPorPosicion();

        // Eliminar un jugador
        equipo.eliminarJugador(jugador2);
        equipo.mostrarJugadoresPorPosicion();
    }
}  
    
    
    
    

