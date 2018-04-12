/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicabibliotematema08;

import java.util.ArrayList;

/**
 *
 * @author sportak
 */
public class Biblioteca {

    private String nombre;
    private ArrayList<Publicacion> listaPublicaciones = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Publicacion> getListaPublicaciones() {
        return listaPublicaciones;
    }

    public void setListaPublicaciones(ArrayList<Publicacion> listaPublicaciones) {
        this.listaPublicaciones = listaPublicaciones;
    }

    public void añadirPublicacion(Publicacion p) throws ExcepcionPubliYaExiste {
        if (buscarPublicacion(p.getISBN()) == null) {
            System.out.println("Añadido exitosamente");
            this.listaPublicaciones.add(p);
            System.out.println(p.toString());
        } else {
            throw new ExcepcionPubliYaExiste(p);
        }
    }

    public Publicacion buscarPublicacion(int isbn) {
        for (int i = 0; i < this.listaPublicaciones.size(); i++) {
            if (this.listaPublicaciones.get(i).getISBN() == isbn) {
                return this.listaPublicaciones.get(i);
            }
        }
        return null;
    }

    public boolean borrarPublicacion(Publicacion p) {
        if (p instanceof Libro) {
            this.listaPublicaciones.remove(p);
            System.out.println("El libro fue eliminado exitosamente");
        } else {
            if (p instanceof Revista) {
                if (((Revista) p).getListaArticulos().isEmpty() || ((Revista) p).getListaArticulos() == null) {
                    this.listaPublicaciones.remove(p);
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean comprobarRevista(Publicacion p) throws NoEsUnaRevistaExcepcion {
        if (this.buscarPublicacion(p.getISBN()) != null && (p instanceof Revista)) {
            System.out.println("Es una revista y cumple los requisitos");
            return true;
        } else {
            throw new NoEsUnaRevistaExcepcion(p);
        }
    }
}
