public class Empleado {
      //ATRIBUTOS
     String Nombre, Apeliido;
     int Edad;
     int Salario;
     double incrementofijo,porcentajeDesempeno;
     //Metodos constructor
     
    public Empleado(String Nombre, String Apeliido) {
        this.Nombre = Nombre;
        this.Apeliido = Apeliido;
    }

    public Empleado(int Edad, int Salario) {
        this.Edad = Edad;
        this.Salario = Salario;
    }
    public void datosdelempleado(){
        System.out.println("Nombre: "+Nombre+" , Apellido: "+Apeliido+"");
        
        
    }
    public void datosdelempleado2(){
        System.out.println("Edad: "+Edad+" años , Salario: "+Salario+"");
        
    }
     // Sobrecarga de método para incrementar el salario del empleado según un incremento fijo
     public void incrementofijo(double incrementofijo){
         Salario += incrementofijo;
         System.out.println("Salario incrementado a: "+Salario+"");
     }
       // Sobrecarga de método para incrementar el salario del empleado según un incremento y un porcentaje de desempeño
     public void incrementofijo(double incrementofijo, double porcentajeDesempeno){
         Salario += incrementofijo + (Salario * porcentajeDesempeno / 100);
         System.out.println("Salario incrementado a: "+Salario+"");
         
     }
}