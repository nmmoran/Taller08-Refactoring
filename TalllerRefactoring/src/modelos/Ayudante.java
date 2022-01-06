package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante{

    protected  ArrayList<Paralelo> paralelos;

    public Ayudante(String nombre, String apellido, String facultad, int edad, String direccion, String telefono) {
        super(nombre, apellido, facultad, edad, direccion, telefono);
    }
    
    public Ayudante(String nombre, String apellido, String facultad, int edad, String direccion, String telefono,ArrayList<Paralelo> p) {
        super(nombre, apellido, facultad, edad, direccion, telefono);
        this.paralelos = p;
    }
    
    
//getters and setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return super.getNombre();
    }

    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public String getApellido() {
        return super.getApellido();
    }

    public void setApellido(String apellido) {
        super.setApellido(apellido);
    }

    public String getFacultad() {
        return super.getFacultad();
    }

    public void setFacultad(String facultad) {
        super.setFacultad(facultad);
    }

    public int getEdad() {
        return super.getEdad();
    }

    public void setEdad(int edad) {
        super.setEdad(edad);
    }

    public String getDireccion() {
        return super.getDireccion();
    }

    public void setDireccion(String direccion) {
        super.setDireccion(direccion);
    }

    public String getTelefono() {
        return super.getTelefono();
    }

    public void setTelefono(String telefono) {
        super.setTelefono(telefono);
    }

 

    public ArrayList<Paralelo> getParalelos() {
        return paralelos;
    }

    public void setParalelos(ArrayList<Paralelo> paralelos) {
        this.paralelos = paralelos;
    }
    

    //Método para imprimir los paralelos que tiene asignados como ayudante
    public void MostrarParalelos(){
        for(Paralelo par:paralelos){
            //Muestra la info general de cada paralelo
        }
    }
}
