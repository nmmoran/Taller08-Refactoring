package modelos;

import java.util.ArrayList;

public class Profesor extends Persona {
    protected  String codigo;
    protected  ArrayList<Paralelo> paralelos;
    protected  int añosdeTrabajo;
    protected  double BonoFijo;

    public Profesor(String nombre, String apellido, String facultad, int edad, String direccion, String telefono) {
        super(nombre, apellido, facultad, edad, direccion, telefono);
    }
    
        public Profesor(String nombre, String apellido, String facultad, int edad, String direccion, String telefono, String codigo, ArrayList<Paralelo> p, int anioTrabajo, double bonoFijo) {
        super(nombre, apellido, facultad, edad, direccion, telefono);
        this.codigo = codigo;
        this.paralelos = p;
        this.añosdeTrabajo = anioTrabajo;
        this.BonoFijo = bonoFijo;
    }
    
    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public int getAñosdeTrabajo() {
        return añosdeTrabajo;
    }

    public void setAñosdeTrabajo(int añosdeTrabajo) {
        this.añosdeTrabajo = añosdeTrabajo;
    }


    public double getBonoFijo() {
        return BonoFijo;
    }

    public void setBonoFijo(double BonoFijo) {
        this.BonoFijo = BonoFijo;
    }


    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }
        
    public double calcularSueldo(){
        double sueldo=0;
        sueldo= añosdeTrabajo*600 + BonoFijo;
        return sueldo;
    }   
}
