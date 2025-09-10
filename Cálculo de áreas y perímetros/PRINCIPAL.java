public class PRINCIPAL {
      @SuppressWarnings("empty-statement")
      public static void main(String [] args){
          
          int op;
          do{
              op = Integer.parseInt(JOptionPane.showInputDialog(null,"CALCULAR EL AREA y EL PERIMETRO DE LAS FIGURAS GEOMETRICAS\n"                                                     
                 + "Seleccione una opcion: \n"
                 + " 1. Cuadrado\n"
                 + " 2. Circulo\n"
                 + " 3. Rectangulo\n"
                 + " 4. Salir"));
             
              switch(op){
                  case 1 -> {
                      CUADRADO Nia = new CUADRADO() {};
                      Nia.Areayperimetro();
                      System.out.println(" ");
                  }
                  case 2 -> {
                      CIRCULO Nia1 = new CIRCULO() {};
                      Nia1.Areayperimetro();
                      System.out.println(" ");
                  }
                   case 3 -> {
                       RECTANGULO Nia2 = new RECTANGULO() {};
                       Nia2.Areayperimetro();
                       System.out.println(" ");
                  }  
                }
              
            }while(op!=4);
             
        }  
                      
              
} 
              
              
        
     
    

