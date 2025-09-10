public class PERSONA {
     protected String Nombre;
     protected String Apellido;
     protected String Edad;

    public PERSONA() {
    }
    
    

    public PERSONA(String Nombre, String Apellido, String Edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String setNombre(String Nombre) {
        this.Nombre = Nombre;
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String setApellido(String Apellido) {
        this.Apellido = Apellido;
        return Apellido;
    }

    public String getEdad() {
        return Edad;
    }

    public String setEdad(String Edad) {
        this.Edad = Edad;
        return Edad;
    }

}
