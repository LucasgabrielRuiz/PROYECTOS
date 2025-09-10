public class UTILERO extends PERSONA {
    private int Experiencia;
    private String Funciones;
    private String Categoria;

    public UTILERO() {
    }

    
    
    public UTILERO(String Nombre, String Apellido, String Edad, int Experiencia, String Funciones, String Categoria) {
        super(Nombre, Apellido, Edad);
        this.Experiencia = Experiencia;
        this.Funciones = Funciones;
        this.Categoria = Categoria;
    }

    public int getExperiencia() {
        return Experiencia;
    }

    public void setExperiencia(int Experiencia) {
        this.Experiencia = Experiencia;
    }

    public String getFunciones() {
        return Funciones;
    }

    public void setFunciones(String Funciones) {
        this.Funciones = Funciones;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
}
