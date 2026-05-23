
import lombok.Setter;
import lombok.Getter;
@Getter
@Setter
public class Monopatin extends Vehiculos {
    private boolean amortiguar;
    private Scanner teclado= new Scanner(System.in);
;

 public Monopatin(String patente,double tarifa , double bateria, boolean amortiguar) {
     super(patente, tarifa, bateria);
     this.amortiguar = false;
    }

    public void mostrar() {
        System.out.println(
            "Patente: " + patente +
            ", Bateria: " + bateria +
            ", Tarida: " + tarifa+
            ", : amortiguador" + amortiguar
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
