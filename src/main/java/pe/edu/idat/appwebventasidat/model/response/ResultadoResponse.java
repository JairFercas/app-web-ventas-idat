package pe.edu.idat.appwebventasidat.model.response;

import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class ResultadoResponse {
    private Boolean respuesta;
    private String mensaje;

}
