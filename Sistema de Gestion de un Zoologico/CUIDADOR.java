public class CUIDADOR {
    private String codigo;
    private String nombre;
    private String especialidad; // Ej: Mamíferos, Aves, etc.
    private List<ANIMAL> animalesACargo;

    public CUIDADOR(String codigo, String nombre, String especialidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.animalesACargo = new ArrayList<>();
    }

    // Agregar animal bajo su cuidado
    public void asignarAnimal(ANIMAL animal) {
        animalesACargo.add(animal);
    }

    public List<ANIMAL> getAnimalesACargo() {
        return animalesACargo;
    }

    @Override
    public String toString() {
        return "Cuidador: " + nombre + " (Especialidad: " + especialidad + ")";
    }

    Object getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

