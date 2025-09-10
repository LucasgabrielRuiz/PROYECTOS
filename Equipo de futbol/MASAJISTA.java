public class MASAJISTA extends PERSONA {
    private String Experiencia;
    private List<String> Certificados;
    private String Especialidad;

    public MASAJISTA() {
    }

    
    
    public MASAJISTA(String Nombre, String Apellido, String Edad, String Experiencia, List<String> Certificados , String Especialidad) {
        super(Nombre, Apellido, Edad);
        this.Experiencia = Experiencia;
        this.Certificados = Certificados;
        this.Especialidad = Especialidad;
        
    }

    public String getExperiencia() {
        return Experiencia;
    }

    public void setExperiencia(String Experiencia) {
        this.Experiencia = Experiencia;
    }

    public List<String> getCertificados() {
        return Certificados;
    }

    public void setCertificados(List<String> Certificados) {
        this.Certificados = Certificados;
    }


    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }
    
}
