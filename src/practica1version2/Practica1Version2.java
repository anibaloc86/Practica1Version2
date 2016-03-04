
package practica1version2;

import java.util.Scanner;

public class Practica1Version2 {
    
    public static void main(String[] args) {
        
        DataBook Datos[] = new DataBook[100];
        PrestamoBook Presta[] = new PrestamoBook[100];
        Scanner lector = new Scanner (System.in);
        int opc, opcP, opcG, contG=0, contP=0, band=0, bandP=0, opcGE;
        String name, nameP;
       
        do{
           System.out.println("\nSeleccione el módulo que desea.");
           System.out.println("1. Gestión de libros.");
           System.out.println("2. Gestión de prestamos.");
           System.out.println("3. Salir.");
           opc= lector.nextInt();
           
           switch(opc){
               case 1:
                       System.out.println("1. Gestión de libros.");               
                    do{                                          
                        System.out.println("\n1. Ingresar Libro.");
                        System.out.println("2. Actualizar Libro.");
                        System.out.println("3. Eliminar Libro.");
                        System.out.println("4. Buscar Libro.");
                        System.out.println("5. Salir.");
                        System.out.println("\nSeleccione una opción:");
                        opcG= lector.nextInt();
                    
                  switch(opcG){
                      
                      case 1:
                          System.out.println("\nIngreso de libros.");
                          
                          if(contG<99){                        
                    Datos[contG] = new DataBook();
                    System.out.print("\nDigite el nombre del libro: ");
                    Datos[contG].setNombre(lector.next());
                    System.out.print("\nDigite el autor: ");
                    Datos[contG].setAutor(lector.next());
                    System.out.print("\nDigite el año: ");
                    Datos[contG].setAño(lector.next());
                    System.out.print("\nDigite el código: ");
                    Datos[contG].setCodigo(lector.next());
                    System.out.print("\nDigite la cantidad: ");
                    Datos[contG].setCantidad(lector.next());
                    System.out.print("\nDigite el área: química, física, tecnológia, cálculo o programación: ");
                    Datos[contG].setArea(lector.next());
                    contG++;
                    }
                    else System.out.println("Memoria llena.");
                          
                    break;
                    
                      case 2:
                          System.out.println("\nActualizar libro.");
                          System.out.println("Digite el nombre del libro a actualizar: ");
                          name = lector.next();
                          
                    for (int i=0; i<contG; i++){
                        if (name.equals(Datos[i].getNombre())){
                            band=1;
                    System.out.print("Digite el año: ");
                    Datos[i].setAño(lector.next());
                    System.out.print("Digite el código: ");
                    Datos[i].setCodigo(lector.next());
                    System.out.print("Digite la cantidad: ");
                    Datos[i].setCantidad(lector.next());
                    System.out.print("Digite el área: química, física, tecnológia, cálculo o programación: ");
                    Datos[i].setArea(lector.next());
                            
                        }
                    }
                    if (band==0)
                        System.out.print("Libro no encontrado");
                    else 
                        band=0;
                          break;
                      
                      case 3:
                          System.out.println("\nEliminar Libro.");
                          System.out.println("\nDigite el nombre del libro a eliminar: ");
                          name = lector.next();
                    
                    System.out.println("\n¿Seguro que desea eliminar el libro?");
                    System.out.println("\n 1. Para Confirmar.");
                    System.out.println(" 2. Para Cancelar.");
                    opcGE = lector.nextInt();
                    
                    if(opcGE==1){
                        
                        for (int i=0; i<contG; i++){
                        if (name.equals(Datos[i].getNombre())){
                            band=1;
                                                                
                    Datos[i] = null;
                                                           
                    System.out.println("\nLibro eliminado.");
                           
                        }
                                               
                    }
                    if (band==0)
                        System.out.print("Libro no encontrado");
                    else 
                        band=0;
                                                
                    }                
                     break;
                          
                      case 4:
                          System.out.println("\nBuscar libro.");
                          System.out.println("\nDigite el nombre del libro: ");
                          name = lector.next();
                    
                    for (int i=0; i<contG; i++){
                        if (name.equals(Datos[i].getNombre())){
                            band=1;
                            
                    System.out.print("\nNombre del libro: "+Datos[i].getNombre());
                    System.out.print("\nAutor: "+Datos[i].getAutor());
                    System.out.print("\nAño: "+Datos[i].getAño());
                    System.out.print("\nCódigo: "+Datos[i].getCodigo());
                    System.out.print("\nCantidad: "+Datos[i].getCantidad());
                    System.out.print("\nArea de interés: "+Datos[i].getArea());
                                                                
                        }
                    }
                    if (band==0)
                        System.out.print("Libro no encontrado");
                    else 
                        band=0;
                          break;
                      case 5:
                          System.out.println("Gracias por utilizar el programa.");
                          break;
                      default:
                          System.out.println("Opción incorrecta.");
                          break;
                 }       
                                    
                   }while(opcG!=5);                   
                   break;
                   
               case 2:
                   
                   System.out.println("2. Gestión de prestamos.");
                   
                   do{                                          
                        System.out.println("\nSeleccione una opción.");
                        System.out.println("1. Prestar libro.");
                        System.out.println("2. Devolver libro.");
                        System.out.println("3. Libros prestados.");
                        System.out.println("4. Salir.");
                        opcP= lector.nextInt();
                    
                  switch(opcP){
                      
                      case 1:
                          System.out.println("\nPrestar libro.");
                          
                          if(contP<99){
                                                      
                    Presta[contP] = new PrestamoBook();
                    System.out.print("\nDigite el nombre del libro: ");
                    Presta[contP].setPrestado(lector.next());
                    System.out.print("\nDigite la cedula: ");
                    Presta[contP].setCedula(lector.next());
                    contP++;
                    }
                    else System.out.println("No hay libros en la reserva.");
                          
                    break;
                    
                      case 2:
                          System.out.println("\nDevolver un libro.");
                          System.out.println("Digite el nombre del libro a dovelver: ");
                          nameP = lector.next();
                          
                    for (int i=0; i<contP; i++){
                        if (nameP.equals(Presta[i].getPrestado())){
                            bandP=1;
                             
                    System.out.print("\nNombre del libro: "+Presta[i].getPrestado());
                    System.out.print("\nCedula: "+Presta[i].getCedula());
                       
                        }
                    }
                    if (band==0)
                        System.out.print("Libro no encontrado");
                    else 
                        band=0;
                          break;
                      
                      case 3:
                          System.out.println("\nLibros prestados:");
                                            
                    for (int i=0; i<contP; i++){
                        
                        if (contP!=0){
                                                       
                    System.out.print("\nNombre del libro: "+Presta[i].getPrestado());
                    i++;                                       
                        }
                    }System.out.print("No hay libros prestados.");
                   break;
                      case 4:
                          System.out.println("Gracias por utilizar el programa.");
                          break;
                      default:
                          System.out.println("Opción incorrecta.");
                          break;
                 }       
                                    
                   }while(opcP!=4);                   
                   break;
                   
                   
                   
               case 3:
                   System.out.println("Gracias por utilizar el programa.");
                   break;
               default:
                   System.out.println("Seleccione una opción válida.");
                    break;
           }
                
    }while(opc!=3); 
    
}
}
