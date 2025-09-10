public class ZOOMAIN {
    
    private List<ANIMAL> animales;
    private List<CUIDADOR> cuidadores;
    private List<HABITAT> habitats;
    private List<DIETA> dietas;

    public ZOOMAIN() {
        animales = new ArrayList<>();
        cuidadores = new ArrayList<>();
        habitats = new ArrayList<>();
        dietas = new ArrayList<>();
    }

    // Leer desde archivos CSV
    public void cargarDatos() {
        cargarAnimales("animales.csv");
        cargarCuidadores("cuidadores.csv");
        cargarHabitats("habitats.csv");
        cargarDietas("dietas.csv");
    }

    private void cargarAnimales(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                ANIMAL animal = new ANIMAL(datos[0], datos[1], Integer.parseInt(datos[2]), Double.parseDouble(datos[3]), datos[4]);
                animales.add(animal);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cargarCuidadores(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                CUIDADOR cuidador = new CUIDADOR(datos[0], datos[1], datos[2]);
                cuidadores.add(cuidador);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cargarHabitats(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                HABITAT habitat = new HABITAT(datos[0], datos[1], datos[2], Integer.parseInt(datos[3]));
                habitats.add(habitat);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cargarDietas(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                DIETA dieta = new DIETA(datos[0], datos[1]);
                dietas.add(dieta);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Asignar animales a hábitats
    public void asignarAnimalAHabitat(String codigoAnimal, String codigoHabitat) {
        ANIMAL animal = buscarAnimalPorCodigo(codigoAnimal);
        HABITAT habitat = buscarHabitatPorCodigo(codigoHabitat);

        if (animal != null && habitat != null) {
            if (habitat.agregarAnimal(animal)) {
                System.out.println("Animal asignado al hábitat.");
            } else {
                System.out.println("El hábitat está lleno.");
            }
        } else {
            System.out.println("Animal o hábitat no encontrados.");
        }
    }

    // Asignar dieta a un animal
    public void asignarDietaAAnimal(String codigoAnimal, String codigoDieta) {
        ANIMAL animal = buscarAnimalPorCodigo(codigoAnimal);
        DIETA dieta = buscarDietaPorCodigo(codigoDieta);

        if (animal != null && dieta != null) {
            animal.setDieta(dieta);
            System.out.println("Dieta asignada.");
        } else {
            System.out.println("Animal o dieta no encontrados.");
        }
    }

    // Buscar animales por tipo o hábitat
    public List<ANIMAL> buscarAnimalesPorTipo(String tipo) {
        List<ANIMAL> resultado = new ArrayList<>();
        for (ANIMAL animal : animales) {
            if (animal.getTipo().equalsIgnoreCase(tipo)) {
                resultado.add(animal);
            }
        }
        return resultado;
    }

    public List<ANIMAL> buscarAnimalesPorHabitat(String codigoHabitat) {
        HABITAT habitat = buscarHabitatPorCodigo(codigoHabitat);
        if (habitat != null) {
            return habitat.getAnimales();
        }
        return new ArrayList<>();
    }

    // Buscar animales bajo el cuidado de un cuidador específico
    public List<ANIMAL> listarAnimalesDeCuidador(String codigoCuidador) {
        CUIDADOR cuidador = buscarCuidadorPorCodigo(codigoCuidador);
        if (cuidador != null) {
            return cuidador.getAnimalesACargo();
        }
        return new ArrayList<>();
    }

    // Calcular total de animales por tipo
    public int contarAnimalesPorTipo(String tipo) {
        return (int) animales.stream().filter(a -> a.getTipo().equalsIgnoreCase(tipo)).count();
    }

    // Métodos de búsqueda
    private ANIMAL buscarAnimalPorCodigo(String codigo) {
        for (ANIMAL animal : animales) {
            if (animal.getCodigo().equals(codigo)) {
                return animal;
            }
        }
        return null;
    }

    private HABITAT buscarHabitatPorCodigo(String codigo) {
        for (HABITAT habitat : habitats) {
            if (habitat.getCodigo().equals(codigo)) {
                return habitat;
            }
        }
        return null;
    }

    private CUIDADOR buscarCuidadorPorCodigo(String codigo) {
        for (CUIDADOR cuidador : cuidadores) {
            if (cuidador.getCodigo().equals(codigo)) {
                return cuidador;
            }
        }
        return null;
    }

    private DIETA buscarDietaPorCodigo(String codigo) {
        for (DIETA dieta : dietas) {
            if (dieta.getCodigo().equals(codigo)) {
                return dieta;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ZOOMAIN zoo = new ZOOMAIN();
        zoo.cargarDatos();

        // Ejemplos de operaciones
        zoo.asignarAnimalAHabitat("A001", "H001");
        zoo.asignarDietaAAnimal("A001", "D001");

        List<ANIMAL> mamiferos = zoo.buscarAnimalesPorTipo("mamífero");
        System.out.println("Mamíferos en el zoológico: " + mamiferos.size());

        List<ANIMAL> animalesEnSelva = zoo.buscarAnimalesPorHabitat("H002");
        System.out.println("Animales en la selva tropical: " + animalesEnSelva.size());

        List<ANIMAL> animalesCuidador = zoo.listarAnimalesDeCuidador("C001");
        System.out.println("Animales bajo el cuidado del cuidador C001: " + animalesCuidador.size());
    }
}


