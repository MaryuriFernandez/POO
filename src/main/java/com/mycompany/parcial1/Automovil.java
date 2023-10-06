
package com.mycompany.parcial1;

public class Automovil extends Vehiculo{
    int numeroPuertas;

    public Automovil(int numeroPuertas, String marca, String modelo, int anio, String propietario, String placa) {
        super(marca, modelo, anio, propietario, placa);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("marca: " + getMarca()+ "    modelo: " + getModelo()+ "  año: "+ getAnio()+ "    propietario: " + getPropietario()+ "    placa: " + getPlaca()+ "    numero de puertas: " + getNumeroPuertas());    
    }

    
    
}
