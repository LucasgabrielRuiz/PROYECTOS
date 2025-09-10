//En este proyecto se realizo una simulacion de un cajero automatico como proyecto academico
//Donde se aprendio el uso de condicionales y struct

#include<stdio.h>
#include<time.h>

 struct usuario{
 
 	char nombre [5];	
 	int  pin = 1234;
 	int  saldoin = 10000;
  
 	
 };
 
 
   int main(){
	int saldo = 0;
	int retiro;
	int deposito;
	int pincargado;
	int opcion;
	
	
	struct usuario c1;

	
	
	
	printf("Bienvenido al cajero automatico\n");
	while (2){
	
    	printf("Para continuar ingrese su PIN de seguridad:\n");
    	scanf("%d",&pincargado);
    	 if (pincargado==c1.pin){
    	 printf("PIN correcto acceso concedido.\n");
    	 break;}
    	 else{
    	 	printf("PIN incorrecto acceso denegado.\n");
		 }
		
            }
	
	
    	 while (1){
	 	 printf("\n Menu de opciones\n");
		 printf("1. Ver saldo\n");
		 printf("2. Depositar dinero\n");
		 printf("3. Extraer dinero\n");
	 	 printf("4. Blanquear PIN\n");
		 printf("5. Salir\n");
		 scanf("%d",&opcion);
		 switch (opcion){
			case 1:
			printf("El saldo actual es de: $%d",c1.saldoin);
				break;
				
			case 2:
			printf("Ingrese el monto a depositar\n");
			scanf("%d",&deposito);
			saldo= c1.saldoin + deposito;
			printf("Deposito efectuado su saldo, es de: %d",saldo);
				break;
			case 3:
			printf("Ingrese el monto a retirar");
			scanf("%d",&retiro);
			if(retiro>c1.saldoin){
				printf("Fondo insuficiente");}
				else	{saldo=saldo-retiro;
				printf("El saldo restante es de: %d",saldo);
				}
				break;
								
	          case 4:
	          	printf("Ingrese su PIN de seguridad:\n");
	          	scanf("%d",&pincargado);
	          	if (pincargado==c1.pin){
	          		printf("Ingrese su nuevo PIN de seguridad:\n");
	          		scanf("%d",&c1.pin);
					printf("su PIN de seguridad ha sido cambiado de manera exitosa.\n");			        			
				  }else {
				  	printf("PIN incorrecto.");				
				  }
				  break;
				  
				case 5:
				
	
			   
	         return 0;

	}
}
	
}