public class EQUIPO {
    private String nombre;
    private String ciudad;
    private List<JUGADOR> jugadores;
    private List<PERSONA> cuerpoTecnico;

    public EQUIPO(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.jugadores = new ArrayList<>();
        this.cuerpoTecnico = new ArrayList<>();
    }

    public void agregarJugador(JUGADOR jugador) {
        jugadores.add(jugador);
    }

    public void eliminarJugador(JUGADOR jugador) {
        jugadores.remove(jugador);
    }

    public void agregarMiembroCuerpoTecnico(PERSONA persona) {
        cuerpoTecnico.add(persona);
    }

    public void concentrar() {
        System.out.println(nombre + " está en concentración.");
    }

    public void viajar(String destino) {
        System.out.println(nombre + " está viajando a " + destino + ".");
    }

    public void jugarPartido() {
        System.out.println(nombre + " está jugando un partido.");
    }

    public void entrenar() {
        System.out.println(nombre + " está entrenando.");
    }

    public List<JUGADOR> getJugadoresPorPosicion(String posicion) {
        return jugadores.stream()
                .filter(j -> j.getPosicion().equals(posicion))
                .collect(Collectors.toList());
    }

    public void mostrarJugadoresPorPosicion() {
        jugadores.stream()
                .collect(Collectors.groupingBy(JUGADOR::getPosicion))
                .forEach((posicion, jugadores) -> {
                    System.out.println("Posición: " + posicion);
                    jugadores.forEach(j -> System.out.println("  " + j.getNombre() + " (Dorsal: " + j.getDorsal() + ", Goles: " + j.getGoles() + ")"));
                });
    }
}

