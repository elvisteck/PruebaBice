package cl.bice.prueba.programacion.message;

import cl.bice.prueba.programacion.to.Cobre;
import cl.bice.prueba.programacion.to.Dolar;
import cl.bice.prueba.programacion.to.Ipc;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IndicadoresResponse {
	
	private Cobre cobre;
	private Ipc ipc;
	private Dolar dolar;
	
}
