
package com.mycompany.parcialprimercorte;

public abstract class Vehiculo {
    String marca, modelo, propietario, placa;
    int anio;

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

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    

    public abstract void mostrarInformacion();
}
