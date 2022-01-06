package modelos;

import java.util.ArrayList;

public class Paralelo {
    protected  int numero;
    protected  Materia materia;
    protected  Profesor profesor;
    protected  ArrayList<Estudiante> estudiantes;
    protected  Ayudante ayudante;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Ayudante getAyudante() {
        return ayudante;
    }

    public void setAyudante(Ayudante ayudante) {
        this.ayudante = ayudante;
    }
    
    public void anadirEstudiante(Estudiante e) {
        estudiantes.add(e);
    }
    
    public void eliminarEstudiante(Estudiante e){
        for(Estudiante est: estudiantes){
            if(est.equals(e)){
                estudiantes.remove(e);
            }
        }
    }
    
    
    //Imprime el listado de estudiantes registrados
    public void mostrarListado(){
        //No es necesario implementar
    }
    
    
}
