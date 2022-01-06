package modelos;

import java.util.ArrayList;

public class Estudiante extends Persona {
    //Informacion del estudiante
    protected String matricula;
    protected  ArrayList<Paralelo> paralelos;

    public Estudiante(String nombre, String apellido, String facultad, int edad, String direccion, String telefono) {
        super(nombre, apellido, facultad, edad, direccion, telefono);
    }
    
        public Estudiante(String nombre, String apellido, String facultad, int edad, String direccion, String telefono, String matricula, ArrayList<Paralelo> p) {
        super(nombre, apellido, facultad, edad, direccion, telefono);
        this.matricula = matricula;
        this.paralelos = p;
    }
    
    //Getter y setter de Matricula
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //Getter y setter del Nombre
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
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    public double CalcularNota(Paralelo p, double nexamen,double ndeberes, double nlecciones, double ntalleres){
        double nota=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                double notaTeorico=(nexamen+ndeberes+nlecciones)*0.80;
                double notaPractico=(ntalleres)*0.20;
                nota=notaTeorico+notaPractico;
            }
        }
        return nota;
    }
    
    
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. Esta nota es solo el promedio de las dos calificaciones anteriores.
    public double CalcularNotaTotal(Paralelo p){
        double notaTotal=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                notaTotal=(p.getMateria().notaInicial+p.getMateria().notaFinal)/2;
                
            }
        }
        return notaTotal;
        
    }
}
        
    
    
    
            
        
        
