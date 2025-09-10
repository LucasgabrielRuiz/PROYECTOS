public class HABITAT {
    private String codigo;
    private String nombre;
    private String tipo; // Ej: "sabana", "selva tropical", "ártico"
    private int capacidad;
    private List<ANIMAL> animales;

    public HABITAT(String codigo, String nombre, String tipo, int capacidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.animales = new ArrayList<>();
    }

    public boolean agregarAnimal(ANIMAL animal) {
        if (animales.size() < capacidad) {
            animales.add(animal);
            return true;
        }
        return false;
    }

    public List<ANIMAL> getAnimales() {
        return animales;
    }

    @Override
    public String toString() {
        return "Hábitat: " + nombre + " (" + tipo + "), Capacidad: " + capacidad;
    }

    Object getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


