
package com.mycompany.parcialprimercorte;

import java.util.LinkedList;

public class Servicio {
     LinkedList<Vehiculo> listaVehiculos = new LinkedList<>();

    public LinkedList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(LinkedList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
     
    public void GuardarMotocicleta(double cilindrada, String marca, String modelo, int anio, String propietario, String placa){
        boolean repetido;
        System.out.println("1");
        repetido = BuscarPlaca(placa);
        if(repetido){
            System.out.println("No se puede guardar el vehiculo, ¡tiene placa repetida!");
        }else{
            Motocicleta objeto= new Motocicleta(cilindrada, marca, modelo, anio, propietario, placa);
            listaVehiculos.add(objeto);
            System.out.println("vehiculo guardado");
        }
        
    }
    
    public void GuardarAutomovil(int numeroPuertas, String marca, String modelo, int anio, String propietario, String placa){
        boolean repetido;
        System.out.println("0");
        repetido = BuscarPlaca(placa);
        if(repetido){
            System.out.println("No se puede guardar el vehiculo, ¡tiene placa repetida!");
        }else{
            Automovil objeto= new Automovil(numeroPuertas, marca, modelo, anio, propietario, placa);
            listaVehiculos.add(objeto);
            System.out.println("vehiculo guardado");
        }
    }
    
    public boolean BuscarPlaca(String placa){
        boolean repetido=false;
         
        for(Vehiculo e: listaVehiculos){
            if(placa.equals(e.getPlaca())){
                repetido=true;
            }
        }
        return repetido;
    }
    
    public void ModificarNombre(String nombre, String nombreModificado){
        for(Vehiculo e: listaVehiculos){
            if(nombre.equals(e.propietario)){
                e.setPropietario(nombreModificado);
                System.out.println("Nombre modificado");
            }else{
                System.out.println("nombre no encontrado");
            }
        }
        
    }
    
    public void obtenerVehiculoPlaca(String placa){
        for(Vehiculo e: listaVehiculos){
        if(placa.equals(e.placa)){
            System.out.println("Vehiculo encontrado: ");
            e.mostrarInformacion();
        }
        }
    }
}
