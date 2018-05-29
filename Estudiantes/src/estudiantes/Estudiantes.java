/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

import java.util.Arrays;
import java.util.Objects;



public class Estudiantes {

    private String nombre;
    private int edad;
    private Materias []materias;

    public Estudiantes(String nombre, int edad, Materias[] materias) {
        this.nombre = nombre;
        this.edad = edad;
        this.materias = materias;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Materias[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materias[] materias) {
        this.materias = materias;
    }

    /*@Override
    public String toString() {
        return "Materia 1=" + materias[0]+" Materia 2" + materias[1] ;
    }*/

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estudiantes other = (Estudiantes) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Arrays.deepEquals(this.materias, other.materias)) {
            return false;
        }
        return true;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
}
