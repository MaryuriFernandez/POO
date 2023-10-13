
package com.mycompany.parcialprimercorte;

public class Motocicleta extends Vehiculo{
    double cilindrada;

    public Motocicleta(double cilindrada, String marca, String modelo, int anio, String propietario, String placa) {
        super(marca, modelo, anio, propietario, placa);
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
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
        System.out.println("marca: " + getMarca()+ "    modelo: " + getModelo()+ "  año: "+ getAnio()+ "    propietario: " + getPropietario()+ "    placa: " + getPlaca()+ "    cilindrada: " + getCilindrada());  
    }
}
