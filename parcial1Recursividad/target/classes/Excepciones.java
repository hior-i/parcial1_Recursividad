import lombok.Setter;
import lombok.Getter;
@Getter
@Setter
public class Excepciones {
    // Excepción 1
    public static class VehiculoNoEncontrado extends Exception {

        public VehiculoNoEncontrado (String mensaje) {
            super(mensaje);
        }
    }

    // Excepción 2
    public static class BateriaInsuficiente extends Exception {

        public BateriaInsuficiente (String mensaje) {
            super(mensaje);
        }
    }
}
    

