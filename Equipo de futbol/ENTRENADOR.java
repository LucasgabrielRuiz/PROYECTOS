public class ENTRENADOR extends PERSONA {
    private int Exp;
    private String titulo;
    private String Equipo;

    public ENTRENADOR() {
    }

    
    
    public ENTRENADOR(String Nombre, String Apellido, String Edad, int Exp ,String titulo, String Equipo){
        super(Nombre, Apellido, Edad);
        this.Exp = Exp;
        this.titulo = titulo;
        this.Equipo = Equipo; 
    }

    public int getExp() {
        return Exp;
    }

    public void setExp(int Exp) {
        this.Exp = Exp;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }
    
}
