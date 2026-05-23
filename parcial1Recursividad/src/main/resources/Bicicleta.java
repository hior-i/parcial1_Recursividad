import lombok.Setter;
import java.util.ArrayList;
import lombok.Getter;
import java.util.Scanner;
@Getter
@Setter

public class Bicicleta extends Vehiculos {
    private int tamaño;
    private Scanner teclado= new Scanner(System.in);
;

 public Bicicleta(String patente,double tarifa , double bateria, int tamaño) {
        super(patente, tarifa, bateria);
        this.tamaño = tamaño;
    }

    public void mostrar() {
        System.out.println(
            "Patente: " + patente +
            ", Bateria: " + bateria +
            ", Tarida: " + tarifa+
            ", Tamaño: " + tamaño
        );
    }

    public void seleccion() {

    System.out.println("Seleccione la patente de la bicicleta:");

    String seleccion = teclado.nextLine();

    if (seleccion.equals(patente)) {
        System.out.println("Selección exitosa");
    } else {
        System.out.println("Patente no encontrada");
    }
 }
}

