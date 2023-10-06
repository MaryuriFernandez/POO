
package com.mycompany.parcial1;

import java.util.LinkedList;

/**
 *
 * @author IngSis
 */
public class Parcial1 {

    public static void main(String[] args) {
        LinkedList<Vehiculo> listaVehiculos = new LinkedList<>();
      //creacion de los objetos de Automovil
        Automovil objeto1= new Automovil(4, "kia", "bus", 2020, "Mafe", "A12C36");
        Automovil objeto2= new Automovil(2, "lamborgini", "camioneta", 2015, "maryuri", "SQP76E");
        //creacion de los objetos Motocicleta
        Motocicleta objeto3= new Motocicleta(150, "eco", "cualquiera", 2018, "juanito", "TSM234E");
        Motocicleta objeto4= new Motocicleta(200, "ex´plendor", "lamejor", 2000, "pablito", "ST8PRQ");
        //modificar un nombre:
        objeto1.setPropietario("mariana");
        //agregar los objetos a la lista
        listaVehiculos.add(objeto1);
        listaVehiculos.add(objeto2);
        listaVehiculos.add(objeto3);
        listaVehiculos.add(objeto4);
        
        for(Vehiculo varAux: listaVehiculos){
            varAux.mostrarInformacion();
        }
        
    }
}
