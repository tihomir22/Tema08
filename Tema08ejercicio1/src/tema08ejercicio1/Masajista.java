/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema08ejercicio1;

/**
 *
 * @author mati
 */
public class Masajista extends SeleccionFutbol {
    
    private String Titulacion;
    private int aniosExperencia;
    
    public Masajista(){
        super();
    
    }

    public Masajista(String Titulacion, int aniosExperencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.Titulacion = Titulacion;
        this.aniosExperencia = aniosExperencia;
    }

    public Masajista(String Titulacion, int aniosExperencia) {
        this.Titulacion = Titulacion;
        this.aniosExperencia = aniosExperencia;
    }
    
    
    

    public String getTitulacion() {
        return Titulacion;
    }

    public void setTitulacion(String Titulacion) {
        this.Titulacion = Titulacion;
    }

    public int getAniosExperencia() {
        return aniosExperencia;
    }

    public void setAniosExperencia(int aniosExperencia) {
        this.aniosExperencia = aniosExperencia;
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Da asistencia en el entrenamiento");
    }
    public void darMasaje(){
        System.out.println("Da un masaje");
    }

    
    
    
    
    
}
