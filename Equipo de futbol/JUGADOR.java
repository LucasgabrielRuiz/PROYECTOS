public class JUGADOR extends PERSONA {
    private String Posicion;
    private int Goles;
    private int Dorsal;

    public JUGADOR() {
    }

    
    
    public JUGADOR(String Nombre, String Apellido, String Edad, String Posicion, int Dorsal ) {
        super(Nombre, Apellido, Edad);
        this.Posicion = Posicion;
        this.Goles = 0;
        this.Dorsal = Dorsal;
        
    }


    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }
  

    public int getDorsal() {
        return Dorsal;
    }

    public void setDorsal(int Dorsal) {
        this.Dorsal = Dorsal;
    }

    public void anotarGol() {
        this.Goles++;
    }

    String getGoles() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
