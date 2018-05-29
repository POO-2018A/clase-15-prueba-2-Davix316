/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

import java.util.*;

public class Principal {
    public static void main(String[] agrs){
        
        Scanner lector = new Scanner(System.in);
        
        //int numeroEstudiantes=5;
        int opcion;
        Estudiantes []estudiantes= new Estudiantes[5];
        Materias []materias= new Materias[2];
        int numeroMaterias=0;
        int conteoEstudiante=0;
        
        
        do{
            System.out.println("\tMENÚ\n");
            System.out.println("1. Ingresar información de estudiante ");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Salir\n");
            System.out.println("Seleccione una opción.");
            opcion=lector.nextInt();
            
            if(conteoEstudiante==5){
                System.out.println("Ya ingreso la cantidad maxima de estudiantes.");
            }
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el nombre del estudiante: ");
                    lector.nextLine();
                    String nombreEstudiante=lector.nextLine();
                    System.out.println("Ingrese la edad del estudiante: ");
                    int edadEstudiante=lector.nextInt();
                    
                    while(numeroMaterias < 2){
                        System.out.println("Ingrese la materia que toma el estudiante: ");
                        lector.nextLine();
                        String nombreMateria=lector.nextLine();
                        System.out.println("Ingrese en que nivel se encuentra la materia: ");
                        //lector.nextLine();
                        int nivelMateria=lector.nextInt();
                        materias[numeroMaterias]=new Materias(nombreMateria, nivelMateria);
                        estudiantes[conteoEstudiante]=new Estudiantes(nombreEstudiante, edadEstudiante , materias);
                        //System.out.println(materias[numeroMaterias]);
                        numeroMaterias++;  
                    }
                    
                    
                    System.out.println("\n\tInformación ingresada: ");
                    System.out.println("Estudiante N. "+(conteoEstudiante+1)
                            +"\nNombre: "+ estudiantes[conteoEstudiante].getNombre()
                            +"\nEdad: "+ estudiantes[conteoEstudiante].getEdad());
                    System.out.println("\tMaterias ingresadas");
                    for(int i=0; i<2;i++){
                        System.out.println(materias[i]);
                    }
                    conteoEstudiante++;
                    numeroMaterias=0;
                    break;
                    
                case 2:
                    
                    for(int i=0;i<conteoEstudiante;i++){                      
                    System.out.println("\n\tInformación ingresada: ");
                    System.out.println("Estudiante N. "+(i+1)
                            +"\nNombre: "+ estudiantes[i].getNombre()
                            +"\nEdad: "+ estudiantes[i].getEdad());
                        System.out.println(estudiantes[i].getMaterias());
                                         
                    }
                    for(int j=0; j<5;j++){
                    if(estudiantes[0].equals(estudiantes[j+1]) ){
                        System.out.println("Existe duplicados en la posición 1,"+(j+1));
                        }
                    if(estudiantes[1].equals(estudiantes[j+1]) ){
                        System.out.println("Existe duplicados en la posición 2,"+(j+1));
                        }
                    if(estudiantes[2].equals(estudiantes[j+1]) ){
                        System.out.println("Existe duplicados en la posición 3,"+(j+1));
                        }
                    if(estudiantes[3].equals(estudiantes[j+1]) ){
                        System.out.println("Existe duplicados en la posición 4,"+(j+1));
                        }
                    }
                    break;
                
                case 3:
                    System.out.println("Adios");
                    break;
                            
                default:
                    System.out.println("Ingrese opcion valida");
                    break;
                
            }
            
            
            
        }while (conteoEstudiante <=5 || opcion!=3 );
                
               
    }
    
    
}
