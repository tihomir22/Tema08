/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema08ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author mati
 */
public class Tema08ejercicio1 {

    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
    
    public static void main(String[] args) {

        Entrenador delBosque = new Entrenador("284EZ89", 1, "Vicente", "Del Bosque", 60);
        Futbolista iniesta = new Futbolista(6, "Interior derecho", 2, "Andres", "Iniesta", 29);
        Masajista raulMartinez = new Masajista("Licenciado en Fisioterapia", 18, 3, "Raul", "Martinez", 41);

        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);
       
        //CONCENTRACION
        System.out.println("Todos los integrantes comienzan una concentracion.");
        for (int i = 0; i < integrantes.size(); i++) {
            System.out.println(integrantes.get(i).getNombre() + " " + integrantes.get(i).getApellidos() + " -> ");
            integrantes.get(i).Concentrarse();

        }
        //Viaje
        System.out.println("Todos los integrantes viajan para jugar un partido.");
        for (int i = 0; i < integrantes.size(); i++) {
            System.out.println(integrantes.get(i).getNombre() + " " + integrantes.get(i).getApellidos());
            integrantes.get(i).Viajar();

        }
        //Entrenamiento
        System.out.println("Entrenamiento: Solamento el entrenador y el futbolista tiene metodos para entrenar ");
        System.out.println(delBosque.getNombre() + " " + delBosque.getApellidos());
        delBosque.dirigirEntreno();
        System.out.println(iniesta.getNombre() + " " + iniesta.getApellidos());
        iniesta.entrenar();

        //Masaje
        System.out.println("Masaje: Solo el masajista tiene el metodo par adar un mensaje");
        System.out.println(raulMartinez.getNombre() + " " + raulMartinez.getApellidos() + " -> ");
        raulMartinez.darMasaje();

        //Partido de futbol
        System.out.println("Partido de futbol: Solamente el entrenador y el futbolista tiene metodos para el partido de futbol");
        System.out.println(delBosque.getNombre() + " " + delBosque.getApellidos());
        delBosque.dirigirPartido();
        System.out.println(iniesta.getNombre() + " " + iniesta.getApellidos() + " -> ");
        iniesta.jugarPartido();

    }

}
