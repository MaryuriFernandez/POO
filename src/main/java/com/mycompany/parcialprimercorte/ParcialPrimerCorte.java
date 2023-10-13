
package com.mycompany.parcialprimercorte;


public class ParcialPrimerCorte {

    public static void main(String[] args) {
       Servicio objeto = new Servicio();
       
        System.out.println("____________________________________________________________________________");
        System.out.println("G U A R D A R  V E H I C U L O S");
       
       objeto.GuardarMotocicleta(150, "eco", "cuatrimoto", 2020, "mafe", "SQP76E");
       objeto.GuardarMotocicleta(200, "splendor", "cualquiera", 2000, "pepito", "SQP76E");
       objeto.GuardarMotocicleta(280, "honda", "unica", 2015, "juanito", "UTR85V");
       objeto.GuardarMotocicleta(150, "splendor", "una", 2020, "juan", "SQP76E");
       objeto.GuardarMotocicleta(180, "eco", "dos", 2000, "mafesita", "PSE96P");
       objeto.GuardarMotocicleta(200, "splendor", "cualquiera", 2000, "pepito", "SQP76E");
       objeto.GuardarMotocicleta(200, "ECO", "cualquiera", 2000, "pepito", "SQOL6E");
       objeto.GuardarMotocicleta(200, "splendor", "cualquiera", 2000, "pepito", "SQN76E");
       objeto.GuardarMotocicleta(200, "splendor", "TRESS", 2000, "pepito", "SQP76E");
       objeto.GuardarMotocicleta(150, "HONDA", "cualquiera", 2019, "Manuel", "SQP76E");

       objeto.GuardarAutomovil(2, "lamborgini", "unico", 2000, "Maryuri", "MNOP36");
       objeto.GuardarAutomovil(4, "kia", "4x4", 2020, "Mauricio", "MNOS36");
       objeto.GuardarAutomovil(2, "lamborgini", "dos", 2020, "Camilo", "MNNP36");
       objeto.GuardarAutomovil(4, "Hyundai", "unico", 2010, "Melanie", "MNOP36");
       objeto.GuardarAutomovil(2, "ferrari", "unico", 2020, "Patricia", "MNOS36");
       objeto.GuardarAutomovil(4, "BMW", "unico", 2022, "Pablo", "MNNU36");
       objeto.GuardarAutomovil(2, "Honda", "unico", 2000, "Willintong", "PSOP36");
       objeto.GuardarAutomovil(2, "lamborgini", "unico", 2000, "Maryuri", "MNOM26");
       objeto.GuardarAutomovil(2, "lamborgini", "unico", 2000, "Maryuri", "MNOP36");
       objeto.GuardarAutomovil(2, "lamborgini", "unico", 2000, "Maryuri", "MNWM36");
       
        System.out.println("____________________________________________________________________________");
        System.out.println("M O S T R A R  I N F O R M A C I O N");
       
       for (Vehiculo listaVehiculo : objeto.getListaVehiculos()) {
            listaVehiculo.mostrarInformacion();
        }
       
        System.out.println("____________________________________________________________________________");
        System.out.println("M O D I F I C A R  N O M B R E");
       
       objeto.ModificarNombre("mafe", "Maryuri");
       
       System.out.println("____________________________________________________________________________");
       System.out.println("M O S T R A R  I N F O R M A C I O N");
       
        for (Vehiculo listaVehiculo : objeto.getListaVehiculos()) {
            listaVehiculo.mostrarInformacion();
        }
        
        System.out.println("____________________________________________________________________________");
        System.out.println("O B T E N E R  V E H I C U L O  P O R  P L A C A");
        objeto.obtenerVehiculoPlaca("SQP76E");
       
    }
}
