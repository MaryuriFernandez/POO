
package com.mycompany.parcial1;

public abstract class Vehiculo {
    String marca;
    String modelo;
    int anio;
    String propietario;
    String placa;

    public Vehiculo(String marca, String modelo, int anio, String propietario, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.propietario = propietario;
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public abstract void mostrarInformacion();
}
