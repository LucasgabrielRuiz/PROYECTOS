public class ENTEROSYDECIMALES {
    public static void main(String[] args) {
                Scanner sc =new Scanner (System.in);
                OPERACIONES obj = new OPERACIONES();
                
                int n1entero, n2entero;
                double n1decimal, n2decimal;
                
                
                //NUMEROS ENTEROS
                System.out.println("Ingrese el Primer numero entero");
                n1entero = sc.nextInt();
                System.out.println("Ingrese el Segundo numero entero");
                n2entero = sc.nextInt(); 
                //SUMA DE NUMEROS ENTEROS
                obj.setDatosnumerosenteros(n1entero, n2entero);
                System.out.println("La Suma de los dos numeros enteros son: " +obj.sumaenteros());
                //RESTA DE NUMEROS ENTEROS 
                obj.setDatosnumerosenteros(n1entero, n2entero);
                System.out.println("La Resta de los dos numeros enteros son: " +obj.restaenteros());
                //MULTIPLICACION DE NUMEROS ENTEROS
                obj.setDatosnumerosenteros(n1entero, n2entero);
                System.out.println("La Multiplicacion de los dos numeros enteros son: " +obj.multiplicacionenteros());
                //DIVISION DE NUMEROS ENTEROS
                obj.setDatosnumerosenteros(n1entero, n2entero);
                System.out.println("La Division de los dos numeros enteros son: " +obj.divisionenteros());
                
                
                //NUMEROS DECIMALES
                System.out.println("Ingrese el Primer numero decimal");
                n1decimal = sc.nextDouble();
                System.out.println("Ingrese el Segundo numero decimal");
                n2decimal = sc.nextDouble(); 
                //SUMA DE NUMEROS DECIMALES
                obj.setDatosnumerosDecimales(n1decimal, n2decimal); 
                System.out.println("La Suma de los dos numeros decimales son: " +obj.sumadecimales());
                //RESTA DE NUMEROS DECIMALES 
                obj.setDatosnumerosDecimales(n1decimal, n2decimal); 
                System.out.println("La Resta de los dos numeros decimales son: " +obj.restadecimales());
                //MULTIPLICACION DE NUMEROS DECIMALES 
                obj.setDatosnumerosDecimales(n1decimal, n2decimal); 
                System.out.println("La Multiplicacion de los dos numeros decimales son: " +obj.multiplicaciondecimales());
                //DIVISION DE NUMEROS DECIMALES 
                obj.setDatosnumerosDecimales(n1decimal, n2decimal); 
                      System.out.println("La Division de los dos numeros decimales son: " +obj.divisiondecimales());
    }
}    
