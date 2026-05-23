import lombok.Setter;
import lombok.Getter;
import java.util.Scanner;
@Getter
@Setter

public class Pago {
  private String tipo;
  private Scanner teclado;
    
     public Pago(String tipo) {
        this.tipo = tipo;
        this.teclado = new Scanner(System.in);
    }

 public void pagar(){
    System.out.println("Seleccione metodo de pago(transferencia/tarjeta):");
    tipo = teclado.nextLine();

 if (tipo.equals("tarjeta")) {
     System.out.println("Pago con tarjeta");
     Tarjeta tarjeta = new Tarjeta(0); 
     tarjeta.procesar();
    } else if (tipo.equals("transferencia")) {
     System.out.println("Pago con transferencia");
     Transferencia transferencia = new Transferencia(0); 
     transferencia.procesar();
    } else {
     System.out.println("Metodo de pago no valido");
    }
 }
}
