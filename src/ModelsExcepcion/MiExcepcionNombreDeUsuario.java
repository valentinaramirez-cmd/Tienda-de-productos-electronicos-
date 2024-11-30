package ModelsExcepcion;

import Interfaces.IformatFecha;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**Excepcion que se utiliza al momento de verificar si el usuario ingresado no es correcto
 * **/
public class MiExcepcionNombreDeUsuario extends Exception implements IformatFecha {
    private String fechaError;


    public MiExcepcionNombreDeUsuario (String mensaje)
    {
        super(mensaje);
        fechaError = fechaFormateada();
    }

    @Override
    public String fechaFormateada()
    {
        LocalDateTime fechaLocal = LocalDateTime.now();
        DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return fechaLocal.format(fechaFormateada);
    }
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
