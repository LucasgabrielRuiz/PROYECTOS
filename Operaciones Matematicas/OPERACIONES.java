public class OPERACIONES {
    //ENTEROS
    private int n1entero, n2entero, sumaenteros, restaenteros,multiplicacionenteros,divisionenteros;
    
     public void setDatosnumerosenteros(int n1entero, int n2entero){
         this.n1entero = n1entero;
         this.n2entero = n2entero;
         
     }
     
    //OPERACION SUMA DE  NUMEROS ENTEROS
     public int sumaenteros(){
         sumaenteros = n1entero + n2entero;
         return sumaenteros;        
     }
     //OPERACION RESTA DE NUMEROS ENTEROS
     public int restaenteros(){
         restaenteros = n1entero - n2entero;
         return restaenteros;
     }
     //OPERACION MULTIPLICACION DE NUMEROS ENTEROS
     public int multiplicacionenteros(){
         multiplicacionenteros = n1entero * n2entero;
         return multiplicacionenteros;
     }
     //OPERACION MULTIPLICACION DE NUMEROS ENTEROS
     public int divisionenteros(){
         divisionenteros = n1entero / n2entero;
         return divisionenteros;
     }    

     //DECIMALES
     private double n1decimal, n2decimal, sumadecimales, restadecimales, multiplicaciondecimales, divisiondecimales;
    
     public void setDatosnumerosDecimales(double n1decimal,double n2decimal ){
         this.n1decimal = n1decimal;
         this.n2decimal = n2decimal;
         
     }
     //OPERACION SUMA DE NUMEROS DECIMALES
     public double sumadecimales(){
         sumadecimales = n1decimal+ n2decimal;
         return  sumadecimales;        
              }
     //OPERACION RESTA DE NUMEROS DECIMALES
     public double restadecimales(){
         restadecimales =n1decimal - n2decimal;
         return restadecimales;
     }
     //OPERACION MULTIPLICACION DE NUMEROS DECIMALES
     public double multiplicaciondecimales(){
         multiplicaciondecimales = n1decimal * n2decimal;
         return multiplicaciondecimales;
     }
     //OPERACION DIVISION DE NUMEROS DECIMALES
     public double divisiondecimales (){
         divisiondecimales = n1decimal / n2decimal;
         return divisiondecimales;
     }    

     
     }
