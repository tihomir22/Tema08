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
public abstract class SeleccionFutbol {
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    SeleccionFutbol(){
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void Concentrarse(){
    
    }
    
    public void Viajar(){
    
    }
    //Importante > Metodo abstracto > no se implementa en la clase abstracta pero si en las hijas
    public abstract void entrenamiento();
    
    public void partidoFutbol(){
        System.out.println("Asiste al partido de futbol (Clase Padre)");
    }
    
    
    
}
