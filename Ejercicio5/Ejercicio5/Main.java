package Ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Main Main =new Main();
      int elemento;
     int opc;
     boolean X= true;
     
     Scanner leer = new Scanner(System.in);
     
       while (X) { 
        System.out.println("-------MENU------");
          System.out.println("Seleccione una opcion");
        System.out.println("1. Insertar 10 datos");
        System.out.println("2. eliminar");
        System.out.println("3. mostrar");
        System.out.println("4. Salir");
      
        opc=leer.nextInt();
        switch(opc){
            case 1:
            Scanner Lector2 = new Scanner(System.in);
            int cont=10;
            while (cont>0){
            System.out.println("inserte un elemento ");
            elemento=Lector2.nextInt();
            cola.empuja(elemento); 
            cont--;
            
            }
            break;
            case 2:
                cola.eliminar();
            break;
            
            case 3:
                cola.mostrar();
            break;
            case 4: 
                X= false;
             break;
            default:
                System.out.println("Opcion no valida");
        }
        
          
       }


    }
    
}
