import lombok.Setter;
import lombok.Getter;
@Getter
@Setter
public class Transferencia extends Pago {
 private double monto;
    private Scanner teclado= new Scanner(System.in);



    public void procesar() {
        System.out.println("Ingrese el monto a pagar:");
        monto = teclado.nextDouble();
        System.out.println("Pago de " + monto + " con transferencia procesado");
    }

    

}
