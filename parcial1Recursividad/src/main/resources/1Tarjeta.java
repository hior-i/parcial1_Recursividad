import lombok.Setter;
import lombok.Getter;
import java.util.Scanner;
@Getter
@Setter

public class Tarjeta extends Pago {
    private double monto;
    private Scanner teclado;

    public Tarjeta (double monto) {
        this.monto = monto;
        this.teclado = new Scanner(System.in);
    }




    public void procesar() {
        System.out.println("Ingrese el monto a pagar:");
        monto = teclado.nextDouble();
        System.out.println("Pago de " + monto + " con tarjeta procesado");
    }

}
