package com.example.parcial1Recursividad;
import lombok.Setter;
import lombok.Getter;
@Getter
@Setter
public class Vehiculos {
    private String patente;
    private double bateria;
    private double tarifa;

        public Vehiculos(String patente, double bateria, double tarifa) {
            this.patente = patente;
            this.bateria = bateria;
            this.tarifa = tarifa;
        }
    
    public void seleccionVehiculo(){
    System.out.println("Eliga el tipo de vehiculo (bicicleta/monopatin):");
    tipo = teclado.nextLine();

 if (tipo.equals("bicicleta")) {
     System.out.println("seleccion de bicicleta");
     Bicicleta bicicleta = new Bicicleta(0); 
     bicicleta.mostrar();
     bicicleta.Seleccion();

    } else if (tipo.equals("monopatin")) {
     System.out.println("seleccion de monopatin");
     Monopatin monopatin = new Monopatin(0); 
     monopatin.mostrar();
     monopatin.Seleccion();
    } else {
     System.out.println("Tipo de vehiculo no valido");
    }
 }

}
